package cours.apprentissage.scheduleddemo.manifeste;

import cours.apprentissage.scheduleddemo.article.Article;
import cours.apprentissage.scheduleddemo.article.ArticleRepository;
import cours.apprentissage.scheduleddemo.avarnav.Avarnav;
import cours.apprentissage.scheduleddemo.conteneur.Conteneur;
import cours.apprentissage.scheduleddemo.conteneur.ConteneurRepository;
import cours.apprentissage.scheduleddemo.manifeste.dtos.ManifesteArticleDTO;
import cours.apprentissage.scheduleddemo.manifeste.dtos.ManifesteDTO;
import cours.apprentissage.scheduleddemo.manifeste.dtos.ManifestePostDTO;
import cours.apprentissage.scheduleddemo.manifeste.mappers.ManifesteArticleMapper;
import cours.apprentissage.scheduleddemo.manifeste.mappers.ManifesteMapper;
import cours.apprentissage.scheduleddemo.manifeste.specification.ManifesteSpecification;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
@Transactional
public class ManifesteImpl implements IManifeste {
    private final ManifesteRepository manifesteRepository;
    private final ArticleRepository articleRepository;
    private final ConteneurRepository conteneurRepository;
    private final ManifesteMapper manifesteMapper;
    private final ManifesteArticleMapper manifesteArticleMapper;

    public ManifesteImpl(ManifesteRepository manifesteRepository, ArticleRepository articleRepository, ConteneurRepository conteneurRepository, ManifesteMapper manifesteMapper, ManifesteArticleMapper manifesteArticleMapper) {
        this.manifesteRepository = manifesteRepository;
        this.articleRepository = articleRepository;
        this.conteneurRepository = conteneurRepository;
        this.manifesteMapper = manifesteMapper;
        this.manifesteArticleMapper = manifesteArticleMapper;
    }

    /*Cette methode permet d'enregistrer a la fois le manifeste,les articles qui sont associes au manifestes et les conteneurs qui contients les articles*/
    @Override
    public ManifesteDTO save(ManifestePostDTO manifestePostDTO) {
        ManifesteDTO manifesteDTO = new ManifesteDTO();
        manifesteDTO.setAnnee(manifestePostDTO.getAnnee());
        manifesteDTO.setBureau(manifestePostDTO.getBureau());
        manifesteDTO.setNumero(manifestePostDTO.getNumero());
        manifesteDTO.setConsignataire(manifestePostDTO.getConsignataire());
        manifesteDTO.setNumeroRepertoire(manifestePostDTO.getNumeroRepertoire());
        manifesteDTO.setNavire(manifestePostDTO.getNavire());
        manifesteDTO.setTypeNavire(manifestePostDTO.getTypeNavire());
        manifesteDTO.setOrigine(manifestePostDTO.getOrigine());
        manifesteDTO.setProvenance(manifestePostDTO.getProvenance());
        manifesteDTO.setPavillon(manifestePostDTO.getPavillon());
        manifesteDTO.setDateArrivee(manifestePostDTO.getDateArrivee());
        manifesteDTO.setVolume(manifestePostDTO.getVolume());
        manifesteDTO.setNombreArticle(manifestePostDTO.getNombreArticle());
        manifesteDTO.setConnaissement(manifestePostDTO.getConnaissement());
        Manifeste manifesteToSave = manifesteMapper.toEntity(manifesteDTO);
        Manifeste manifesteSaved = manifesteRepository.save(manifesteToSave);
        List<Article> articles = new ArrayList<>();
        List<Conteneur> conteneurs = new ArrayList<>();
        for (Article article : manifestePostDTO.getArticles()) {
            article.setManifeste(manifesteSaved);
            articles.add(article);
        }
        for (Article article : articles) {
            Article articleToSave = articleRepository.save(article);
            for (Conteneur conteneur : articleToSave.getConteneurs()) {
                conteneur.setArticle(articleToSave);
                conteneurs.add(conteneur);
            }
        }
        for (Conteneur conteneur : conteneurs) {
            conteneurRepository.save(conteneur);
        }
        return manifesteDTO;
    }

    @Override
    public Page<ManifesteDTO> getManifesteBySpecification(String annee, String bureau, String navire, Date dateArrivee, String connaissement) {
        Specification<ManifesteDTO> manifesteDTO = ManifesteSpecification.getManifesteBySpecification(annee, bureau, navire, dateArrivee, connaissement);
        Page<Manifeste> manifestePage = manifesteRepository.findAll(manifesteDTO);
        if (manifestePage.isEmpty()) {
            System.out.println("Aucun manifeste ne correspond à cette recherche");
        }
        return manifestePage.map(manifesteMapper::toDto);
    }

    @Override
    public List<ManifesteArticleDTO> getAllManifeste() {
        List<Manifeste>manifestes=manifesteRepository.findAll();
        return manifesteArticleMapper.toDto(manifestes);
    }

    @Override
    public void getAllManfiesteAndSave() {
        String url = "http://localhost:8083/manifestes/liste";
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<List<ManifesteArticleDTO>> response = restTemplate.exchange(
                url,
                HttpMethod.GET,
                null,
                new ParameterizedTypeReference<>() {
                });
        List<ManifesteArticleDTO> list = response.getBody();
        for (ManifesteArticleDTO manifesteArticleDTO : list) {
            /*avarnav.setEscale("Guinee Conakry");*/
            System.out.println("les listes sont:"+manifesteArticleDTO);
            //save(avarnav);
        }
    }


}

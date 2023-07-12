package cours.apprentissage.scheduleddemo.manifeste;

import cours.apprentissage.scheduleddemo.article.Article;
import cours.apprentissage.scheduleddemo.article.ArticleRepository;
import cours.apprentissage.scheduleddemo.article.dtos.ArticleDTO;
import cours.apprentissage.scheduleddemo.article.mappers.ArticleMapper;
import cours.apprentissage.scheduleddemo.conteneur.Conteneur;
import cours.apprentissage.scheduleddemo.conteneur.ConteneurRepository;
import cours.apprentissage.scheduleddemo.conteneur.dtos.ConteneurDTO;
import cours.apprentissage.scheduleddemo.conteneur.mappers.ConteneurMapper;
import cours.apprentissage.scheduleddemo.manifeste.dtos.ManifesteDTO;
import cours.apprentissage.scheduleddemo.manifeste.dtos.ManifestePostDTO;
import cours.apprentissage.scheduleddemo.manifeste.mappers.ManifesteMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class ManifesteImpl implements IManifeste {
    private final ManifesteRepository manifesteRepository;
    private final ArticleRepository articleRepository;
    private final ConteneurRepository conteneurRepository;
    private final ManifesteMapper manifesteMapper;
    private final ArticleMapper articleMapper;
    private final ConteneurMapper conteneurMapper;

    public ManifesteImpl(ManifesteRepository manifesteRepository, ArticleRepository articleRepository, ConteneurRepository conteneurRepository, ManifesteMapper manifesteMapper, ArticleMapper articleMapper, ConteneurMapper conteneurMapper) {
        this.manifesteRepository = manifesteRepository;
        this.articleRepository = articleRepository;
        this.conteneurRepository = conteneurRepository;
        this.manifesteMapper = manifesteMapper;
        this.articleMapper = articleMapper;
        this.conteneurMapper = conteneurMapper;
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
        manifesteDTO.setPpmBeneficiaire(manifestePostDTO.getPpmBeneficiaire());
        manifesteDTO.setPpmDeclarant(manifestePostDTO.getPpmDeclarant());
        manifesteDTO.setNombreArticle(manifestePostDTO.getNombreArticle());
        Manifeste manifesteToSave = manifesteMapper.toEntity(manifesteDTO);
        Manifeste manifesteSaved = manifesteRepository.save(manifesteToSave);
        List<Article> articles = new ArrayList<>();
        List<Conteneur> conteneurs = new ArrayList<>();
        for (Article article : manifestePostDTO.getArticles()) {
            article.setManifeste(manifesteSaved);
            articles.add(article);
        }
        for (Article article : articles) {
            Article articleToSave=articleRepository.save(article);
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
}

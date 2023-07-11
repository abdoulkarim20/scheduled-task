package cours.apprentissage.scheduleddemo.manifeste;

import cours.apprentissage.scheduleddemo.article.Article;
import cours.apprentissage.scheduleddemo.article.ArticleRepository;
import cours.apprentissage.scheduleddemo.conteneur.Conteneur;
import cours.apprentissage.scheduleddemo.conteneur.ConteneurRepository;
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

    public ManifesteImpl(ManifesteRepository manifesteRepository, ArticleRepository articleRepository, ConteneurRepository conteneurRepository, ManifesteMapper manifesteMapper) {
        this.manifesteRepository = manifesteRepository;
        this.articleRepository = articleRepository;
        this.conteneurRepository = conteneurRepository;
        this.manifesteMapper = manifesteMapper;
    }

    @Override
    public ManifesteDTO save(ManifestePostDTO manifesteDTO) {
        ManifesteDTO manifeste = new ManifesteDTO();
        manifeste.setAnnee(manifesteDTO.getAnnee());
        manifeste.setBureau(manifesteDTO.getBureau());
        manifeste.setNumero(manifesteDTO.getNumero());
        Manifeste manifesteToSave = manifesteMapper.toEntity(manifeste);
        Manifeste manifesteSaved = manifesteRepository.save(manifesteToSave);
        List<Article> articles = new ArrayList<>();
        List<Conteneur> conteneurs = new ArrayList<>();
        for (Article articleDTO : manifesteDTO.getArticles()) {
            articleDTO.setManifeste(manifesteSaved);
            articles.add(articleDTO);
        }
        for (Article article : articles) {
            Article articleSaved=articleRepository.save(article);
            for (Conteneur conteneur : articleSaved.getConteneurs()) {
                conteneur.setArticle(articleSaved);
                conteneurs.add(conteneur);
            }
        }
        for (Conteneur conteneur : conteneurs) {
            conteneurRepository.save(conteneur);
        }
        return manifeste;
    }
}

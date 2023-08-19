package cours.apprentissage.scheduleddemo.article;

import cours.apprentissage.scheduleddemo.article.dtos.ArticleDTO;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ArticleImpl implements IArticle{
    private final ArticleRepository articleRepository;
    public ArticleImpl(ArticleRepository articleRepository) {
        this.articleRepository = articleRepository;
    }
    @Override
    public ArticleDTO save(ArticleDTO articleDTO) {
        return null;
    }
}

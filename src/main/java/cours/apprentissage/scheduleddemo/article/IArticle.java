package cours.apprentissage.scheduleddemo.article;

import cours.apprentissage.scheduleddemo.article.dtos.ArticleDTO;

public interface IArticle {
    ArticleDTO save(ArticleDTO articleDTO);
}

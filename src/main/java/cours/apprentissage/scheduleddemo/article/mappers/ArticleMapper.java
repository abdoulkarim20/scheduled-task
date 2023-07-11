package cours.apprentissage.scheduleddemo.article.mappers;

import cours.apprentissage.scheduleddemo.article.Article;
import cours.apprentissage.scheduleddemo.article.dtos.ArticleDTO;
import cours.apprentissage.scheduleddemo.utils.EntityMapper;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface ArticleMapper extends EntityMapper<ArticleDTO, Article> {
    @Mapping(target = "manifeste",source = "manifeste")
    ArticleDTO toDto(Article article);
}

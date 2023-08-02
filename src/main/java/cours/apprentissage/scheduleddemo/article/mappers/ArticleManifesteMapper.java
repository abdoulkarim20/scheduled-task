package cours.apprentissage.scheduleddemo.article.mappers;

import cours.apprentissage.scheduleddemo.article.Article;
import cours.apprentissage.scheduleddemo.article.dtos.ArticleManifesteDTO;
import cours.apprentissage.scheduleddemo.utils.EntityMapper;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface ArticleManifesteMapper extends EntityMapper<ArticleManifesteDTO, Article> {
    @Mapping(target = "manifeste",source = "manifeste")
    ArticleManifesteDTO toDto(Article article);
}

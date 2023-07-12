package cours.apprentissage.scheduleddemo.manifeste.mappers;

import cours.apprentissage.scheduleddemo.manifeste.Manifeste;
import cours.apprentissage.scheduleddemo.manifeste.dtos.ManifesteArticleDTO;
import cours.apprentissage.scheduleddemo.utils.EntityMapper;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ManifesteArticleMapper extends EntityMapper<ManifesteArticleDTO, Manifeste> {
}

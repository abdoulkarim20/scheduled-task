package cours.apprentissage.scheduleddemo.manifeste.mappers;

import cours.apprentissage.scheduleddemo.manifeste.Manifeste;
import cours.apprentissage.scheduleddemo.manifeste.dtos.ManifesteDTO;
import cours.apprentissage.scheduleddemo.utils.EntityMapper;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ManifesteMapper extends EntityMapper<ManifesteDTO, Manifeste> {
}

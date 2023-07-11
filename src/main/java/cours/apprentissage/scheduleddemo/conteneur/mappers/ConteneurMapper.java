package cours.apprentissage.scheduleddemo.conteneur.mappers;

import cours.apprentissage.scheduleddemo.conteneur.Conteneur;
import cours.apprentissage.scheduleddemo.conteneur.dtos.ConteneurDTO;
import cours.apprentissage.scheduleddemo.utils.EntityMapper;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface ConteneurMapper extends EntityMapper<ConteneurDTO, Conteneur> {
    @Mapping(target = "article",source = "article")
    ConteneurDTO toDto(Conteneur conteneur);
}

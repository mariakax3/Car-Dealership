package pl.zajavka.infrastructure.database.repository.mapper;

import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;
import pl.zajavka.domain.Mechanic;
import pl.zajavka.infrastructure.database.entity.MechanicEntity;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-06-14T14:45:05+0200",
    comments = "version: 1.5.3.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-7.5.1.jar, environment: Java 17.0.1 (Oracle Corporation)"
)
@Component
public class MechanicEntityMapperImpl implements MechanicEntityMapper {

    @Override
    public Mechanic mapFromEntity(MechanicEntity entity) {
        if ( entity == null ) {
            return null;
        }

        Mechanic.MechanicBuilder mechanic = Mechanic.builder();

        mechanic.mechanicId( entity.getMechanicId() );
        mechanic.name( entity.getName() );
        mechanic.surname( entity.getSurname() );
        mechanic.pesel( entity.getPesel() );

        return mechanic.build();
    }
}

package pl.zajavka.infrastructure.database.repository.mapper;

import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;
import pl.zajavka.domain.Part;
import pl.zajavka.infrastructure.database.entity.PartEntity;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-06-14T18:42:18+0200",
    comments = "version: 1.5.3.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-7.5.1.jar, environment: Java 17.0.1 (Oracle Corporation)"
)
@Component
public class PartEntityMapperImpl implements PartEntityMapper {

    @Override
    public Part mapFromEntity(PartEntity entity) {
        if ( entity == null ) {
            return null;
        }

        Part.PartBuilder part = Part.builder();

        part.partId( entity.getPartId() );
        part.serialNumber( entity.getSerialNumber() );
        part.description( entity.getDescription() );
        part.price( entity.getPrice() );

        return part.build();
    }
}

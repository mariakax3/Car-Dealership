package pl.zajavka.infrastructure.database.repository.mapper;

import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;
import pl.zajavka.domain.Service;
import pl.zajavka.infrastructure.database.entity.ServiceEntity;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-05-23T09:00:44+0200",
    comments = "version: 1.5.3.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-7.5.1.jar, environment: Java 17.0.1 (Oracle Corporation)"
)
@Component
public class ServiceEntityMapperImpl implements ServiceEntityMapper {

    @Override
    public Service mapFromEntity(ServiceEntity entity) {
        if ( entity == null ) {
            return null;
        }

        Service.ServiceBuilder service = Service.builder();

        service.serviceId( entity.getServiceId() );
        service.serviceCode( entity.getServiceCode() );
        service.description( entity.getDescription() );
        service.price( entity.getPrice() );

        return service.build();
    }
}

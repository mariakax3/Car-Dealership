package pl.zajavka.api.dto.mapper;

import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;
import pl.zajavka.api.dto.ServiceDTO;
import pl.zajavka.domain.Service;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-07-06T21:53:44+0200",
    comments = "version: 1.5.3.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-7.5.1.jar, environment: Java 17.0.1 (Oracle Corporation)"
)
@Component
public class ServiceMapperImpl implements ServiceMapper {

    @Override
    public ServiceDTO map(Service service) {
        if ( service == null ) {
            return null;
        }

        ServiceDTO.ServiceDTOBuilder serviceDTO = ServiceDTO.builder();

        serviceDTO.serviceCode( service.getServiceCode() );
        serviceDTO.description( service.getDescription() );
        serviceDTO.price( service.getPrice() );

        return serviceDTO.build();
    }
}

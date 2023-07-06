package pl.zajavka.api.dto.mapper;

import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;
import pl.zajavka.api.dto.CepikVehicleDTO;
import pl.zajavka.domain.CepikVehicle;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-07-06T20:11:18+0200",
    comments = "version: 1.5.3.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-7.5.1.jar, environment: Java 17.0.1 (Oracle Corporation)"
)
@Component
public class CepikVehicleMapperImpl implements CepikVehicleMapper {

    @Override
    public CepikVehicleDTO map(CepikVehicle cepikVehicle) {
        if ( cepikVehicle == null ) {
            return null;
        }

        CepikVehicleDTO.CepikVehicleDTOBuilder cepikVehicleDTO = CepikVehicleDTO.builder();

        cepikVehicleDTO.cepikId( cepikVehicle.getCepikId() );
        cepikVehicleDTO.brand( cepikVehicle.getBrand() );
        cepikVehicleDTO.model( cepikVehicle.getModel() );
        cepikVehicleDTO.type( cepikVehicle.getType() );
        cepikVehicleDTO.engineCapacity( cepikVehicle.getEngineCapacity() );
        cepikVehicleDTO.weight( cepikVehicle.getWeight() );
        cepikVehicleDTO.fuel( cepikVehicle.getFuel() );

        return cepikVehicleDTO.build();
    }
}

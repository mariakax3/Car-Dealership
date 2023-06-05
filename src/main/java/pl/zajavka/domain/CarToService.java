package pl.zajavka.domain;

import lombok.*;

import java.util.Objects;
import java.util.Set;

@With
@Value
@Builder
@ToString(of = {"carToServiceId", "vin", "brand", "model", "year"})
@EqualsAndHashCode(of = "vin")
public class CarToService {

    Integer carToServiceId;
    String vin;
    String brand;
    String model;
    Integer year;
    Set<CarServiceRequest> carServiceRequests;

    public boolean shouldExistInCarToBuy() {
        return Objects.nonNull(vin)
                && Objects.isNull(brand)
                && Objects.isNull(model)
                && Objects.isNull(year);
    }
}

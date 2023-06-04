package pl.zajavka.api.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CarPurchaseDTO {

    private String existingCustomerEmail;

    private String customerName;
    private String customerSurname;
    private String customerPhone;
    private String customerEmail;
    private String customerAddressCountry;
    private String customerAddressCity;
    private String customerAddressPostalCode;
    private String customerAddressStreet;

    private String carVin;
    private String salesmanPesel;

    public static CarPurchaseDTO buildDefaultData() {
        return CarPurchaseDTO.builder()
                .customerName("Alfred")
                .customerSurname("Samochodowy")
                .customerPhone("+48 745 233 432")
                .customerEmail("alf.samoch@email.com")
                .customerAddressCountry("Polska")
                .customerAddressCity("Wrocław")
                .customerAddressPostalCode("50-001")
                .customerAddressStreet("Bokserska 15")
                .build();
    }
}

package pl.zajavka.business;

import lombok.AllArgsConstructor;
import pl.zajavka.business.dao.MechanicDAO;
import pl.zajavka.business.dao.SalesmanDAO;
import pl.zajavka.infrastructure.database.entity.MechanicEntity;
import pl.zajavka.infrastructure.database.entity.SalesmanEntity;

import java.util.Optional;

@AllArgsConstructor
public class MechanicService {

    private final MechanicDAO mechanicDAO;

    public MechanicEntity findMechanic(String pesel) {
        Optional<MechanicEntity> salesman = mechanicDAO.findByPesel(pesel);
        if (salesman.isEmpty()) {
            throw new RuntimeException("Could not find salesman by pesel: [%s]".formatted(pesel));
        }
        return salesman.get();
    }
}

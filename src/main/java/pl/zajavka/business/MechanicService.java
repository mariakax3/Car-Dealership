package pl.zajavka.business;

import lombok.AllArgsConstructor;
import pl.zajavka.business.dao.MechanicDAO;
import pl.zajavka.domain.Mechanic;

import java.util.Optional;

@AllArgsConstructor
public class MechanicService {

    private final MechanicDAO mechanicDAO;

    public Mechanic findMechanic(String pesel) {
        Optional<Mechanic> salesman = mechanicDAO.findByPesel(pesel);
        if (salesman.isEmpty()) {
            throw new RuntimeException("Could not find salesman by pesel: [%s]".formatted(pesel));
        }
        return salesman.get();
    }
}

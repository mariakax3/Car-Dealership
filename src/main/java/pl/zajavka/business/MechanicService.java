package pl.zajavka.business;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pl.zajavka.business.dao.MechanicDAO;
import pl.zajavka.domain.Mechanic;

import java.util.List;
import java.util.Optional;

@Slf4j
@Service
@AllArgsConstructor
public class MechanicService {

    private final MechanicDAO mechanicDAO;

    @Transactional
    public List<Mechanic> findAvailableMechanics() {
        List<Mechanic> availableMechanics = mechanicDAO.findAvailable();
        log.info("Available mechanics: [{}]", availableMechanics.size());
        return availableMechanics;
    }

    @Transactional
    public Mechanic findMechanic(String pesel) {
        Optional<Mechanic> salesman = mechanicDAO.findByPesel(pesel);
        if (salesman.isEmpty()) {
            throw new RuntimeException("Could not find salesman by pesel: [%s]".formatted(pesel));
        }
        return salesman.get();
    }
}

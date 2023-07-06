package pl.zajavka.infrastructure.database.repository.jpa;

import lombok.AllArgsConstructor;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.TestPropertySource;
import pl.zajavka.infrastructure.database.entity.CarToBuyEntity;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static pl.zajavka.util.EntityFixtures.*;

@DataJpaTest
@TestPropertySource(locations = "classpath:application-test.yml")
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@AllArgsConstructor(onConstructor = @__(@Autowired))
class CarToBuyJpaRepositoryTest {

    private CarToBuyJpaRepository carToBuyJpaRepository;

    @Test
    void thatCarBeSavedCorrectly() {
        //given
        List<CarToBuyEntity> cars = List.of(someCar1(), someCar2(), someCar3());
        carToBuyJpaRepository.saveAllAndFlush(cars);

        //when
        List<CarToBuyEntity> availableCars = carToBuyJpaRepository.findAvailableCars();

        //then
        assertThat(availableCars).hasSize(9);
    }
}

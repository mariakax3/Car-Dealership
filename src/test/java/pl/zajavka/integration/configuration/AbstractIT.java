package pl.zajavka.integration.configuration;

import org.junit.jupiter.api.AfterEach;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.test.context.ActiveProfiles;
import pl.zajavka.CarDealershipApplication;

@ActiveProfiles("test")
@SpringBootTest(
        classes = CarDealershipApplication.class,
        webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT
)
public abstract class AbstractIT {

    @LocalServerPort
    protected int port;

    @Value("${server.servlet.context-path}")
    protected String basePath;

    @AfterEach
    void afterEach() {

    }
}

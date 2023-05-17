package pl.zajavka.integration;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.*;
import pl.zajavka.business.*;
import pl.zajavka.business.dao.*;
import pl.zajavka.business.management.CarDealershipManagementService;
import pl.zajavka.business.management.FileDataPreparationService;
import pl.zajavka.infrastructure.configuration.HibernateUtil;
import pl.zajavka.infrastructure.database.repository.*;

@Slf4j
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class CarDealershipTest {

    private CarDealershipManagementService carDealershipManagementService;
    private CarPurchaseService carPurchaseService;
    private CarServiceRequestService carServiceRequestService;
    private CarServiceProcessingService carServiceProcessingService;

    @BeforeEach
    void beforeEach() {
        CarDAO carDAO = new CarRepository();
        PartDAO partDAO = new PartRepository();
        ServiceDAO serviceDAO = new ServiceRepository();
        SalesmanDAO salesmanDAO = new SalesmanRepository();
        CustomerDAO customerDAO = new CustomerRepository();
        MechanicDAO mechanicDAO = new MechanicRepository();
        CarServiceRequestDAO carServiceRequestDAO = new CarServiceRequestRepository();
        ServiceRequestProcessingDAO serviceRequestProcessingDAO = new ServiceRequestProcessingRepository();

        CarService carService = new CarService(carDAO);
        MechanicService mechanicService = new MechanicService(mechanicDAO);
        CustomerService customerService = new CustomerService(customerDAO);
        SalesmanService salesmanService = new SalesmanService(salesmanDAO);
        PartCatalogService partCatalogService = new PartCatalogService(partDAO);
        ServiceCatalogService serviceCatalogService = new ServiceCatalogService(serviceDAO);
        FileDataPreparationService fileDataPreparationService = new FileDataPreparationService();
        CarDealershipManagementRepository carDealershipManagementDAO = new CarDealershipManagementRepository();
        CarServiceRequestService carServiceRequestService = new CarServiceRequestService(
                fileDataPreparationService,
                carService,
                customerService,
                carServiceRequestDAO
        );

        this.carDealershipManagementService = new CarDealershipManagementService(
                carDealershipManagementDAO,
                fileDataPreparationService
        );
        this.carPurchaseService = new CarPurchaseService(
                fileDataPreparationService,
                customerService,
                carService,
                salesmanService
        );
        this.carServiceRequestService = new CarServiceRequestService(
                fileDataPreparationService,
                carService,
                customerService,
                carServiceRequestDAO
        );
        this.carServiceProcessingService = new CarServiceProcessingService(
                fileDataPreparationService,
                mechanicService,
                carService,
                serviceCatalogService,
                partCatalogService,
                carServiceRequestService,
                serviceRequestProcessingDAO
        );
    }

    @AfterAll
    static void afterAll() {
        HibernateUtil.closeSessionFactory();
    }

    @Test
    @Order(1)
    void purge() {
        log.info("### RUNNING ORDER 1");
        carDealershipManagementService.purge();
    }

    @Test
    @Order(2)
    void init() {
        log.info("### RUNNING ORDER 2");
        carDealershipManagementService.init();
    }

    @Test
    @Order(3)
    void purchase() {
        log.info("### RUNNING ORDER 3");
        carPurchaseService.purchase();
    }

    @Test
    @Order(4)
    void makeServiceRequests() {
        log.info("### RUNNING ORDER 4");
        carServiceRequestService.requestService();
    }

    @Test
    @Order(5)
    void processServiceRequests() {
        log.info("### RUNNING ORDER 5");
        carServiceProcessingService.process();
    }

    @Test
    @Order(6)
    void printCarHistory() {
        log.info("### RUNNING ORDER 6");

    }
}

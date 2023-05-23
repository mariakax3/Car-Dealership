package pl.zajavka.infrastructure.database.repository.mapper;

import java.util.LinkedHashSet;
import java.util.Set;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;
import pl.zajavka.domain.Address;
import pl.zajavka.domain.CarServiceRequest;
import pl.zajavka.domain.CarToBuy;
import pl.zajavka.domain.CarToService;
import pl.zajavka.domain.Customer;
import pl.zajavka.domain.Invoice;
import pl.zajavka.domain.Mechanic;
import pl.zajavka.domain.Part;
import pl.zajavka.domain.Salesman;
import pl.zajavka.domain.Service;
import pl.zajavka.domain.ServiceMechanic;
import pl.zajavka.domain.ServicePart;
import pl.zajavka.infrastructure.database.entity.AddressEntity;
import pl.zajavka.infrastructure.database.entity.CarServiceRequestEntity;
import pl.zajavka.infrastructure.database.entity.CarToBuyEntity;
import pl.zajavka.infrastructure.database.entity.CarToServiceEntity;
import pl.zajavka.infrastructure.database.entity.CustomerEntity;
import pl.zajavka.infrastructure.database.entity.InvoiceEntity;
import pl.zajavka.infrastructure.database.entity.MechanicEntity;
import pl.zajavka.infrastructure.database.entity.PartEntity;
import pl.zajavka.infrastructure.database.entity.SalesmanEntity;
import pl.zajavka.infrastructure.database.entity.ServiceEntity;
import pl.zajavka.infrastructure.database.entity.ServiceMechanicEntity;
import pl.zajavka.infrastructure.database.entity.ServicePartEntity;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-05-23T09:00:44+0200",
    comments = "version: 1.5.3.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-7.5.1.jar, environment: Java 17.0.1 (Oracle Corporation)"
)
@Component
public class CustomerEntityMapperImpl implements CustomerEntityMapper {

    @Override
    public Customer mapFromEntity(CustomerEntity entity) {
        if ( entity == null ) {
            return null;
        }

        Customer.CustomerBuilder customer = Customer.builder();

        customer.customerId( entity.getCustomerId() );
        customer.name( entity.getName() );
        customer.surname( entity.getSurname() );
        customer.phone( entity.getPhone() );
        customer.email( entity.getEmail() );
        customer.address( addressEntityToAddress( entity.getAddress() ) );
        customer.invoices( invoiceEntitySetToInvoiceSet( entity.getInvoices() ) );
        customer.carServiceRequests( carServiceRequestEntitySetToCarServiceRequestSet( entity.getCarServiceRequests() ) );

        return customer.build();
    }

    @Override
    public CustomerEntity mapToEntity(Customer customer) {
        if ( customer == null ) {
            return null;
        }

        CustomerEntity.CustomerEntityBuilder customerEntity = CustomerEntity.builder();

        customerEntity.customerId( customer.getCustomerId() );
        customerEntity.name( customer.getName() );
        customerEntity.surname( customer.getSurname() );
        customerEntity.phone( customer.getPhone() );
        customerEntity.email( customer.getEmail() );
        customerEntity.address( addressToAddressEntity( customer.getAddress() ) );
        customerEntity.invoices( invoiceSetToInvoiceEntitySet( customer.getInvoices() ) );
        customerEntity.carServiceRequests( carServiceRequestSetToCarServiceRequestEntitySet( customer.getCarServiceRequests() ) );

        return customerEntity.build();
    }

    protected Address addressEntityToAddress(AddressEntity addressEntity) {
        if ( addressEntity == null ) {
            return null;
        }

        Address.AddressBuilder address = Address.builder();

        address.addressId( addressEntity.getAddressId() );
        address.country( addressEntity.getCountry() );
        address.city( addressEntity.getCity() );
        address.postalCode( addressEntity.getPostalCode() );
        address.address( addressEntity.getAddress() );
        address.customer( mapFromEntity( addressEntity.getCustomer() ) );

        return address.build();
    }

    protected CarToBuy carToBuyEntityToCarToBuy(CarToBuyEntity carToBuyEntity) {
        if ( carToBuyEntity == null ) {
            return null;
        }

        CarToBuy.CarToBuyBuilder carToBuy = CarToBuy.builder();

        carToBuy.carToBuyId( carToBuyEntity.getCarToBuyId() );
        carToBuy.vin( carToBuyEntity.getVin() );
        carToBuy.brand( carToBuyEntity.getBrand() );
        carToBuy.model( carToBuyEntity.getModel() );
        carToBuy.year( carToBuyEntity.getYear() );
        carToBuy.color( carToBuyEntity.getColor() );
        carToBuy.price( carToBuyEntity.getPrice() );
        carToBuy.invoice( invoiceEntityToInvoice( carToBuyEntity.getInvoice() ) );

        return carToBuy.build();
    }

    protected Set<Invoice> invoiceEntitySetToInvoiceSet(Set<InvoiceEntity> set) {
        if ( set == null ) {
            return null;
        }

        Set<Invoice> set1 = new LinkedHashSet<Invoice>( Math.max( (int) ( set.size() / .75f ) + 1, 16 ) );
        for ( InvoiceEntity invoiceEntity : set ) {
            set1.add( invoiceEntityToInvoice( invoiceEntity ) );
        }

        return set1;
    }

    protected Salesman salesmanEntityToSalesman(SalesmanEntity salesmanEntity) {
        if ( salesmanEntity == null ) {
            return null;
        }

        Salesman.SalesmanBuilder salesman = Salesman.builder();

        salesman.salesmanId( salesmanEntity.getSalesmanId() );
        salesman.name( salesmanEntity.getName() );
        salesman.surname( salesmanEntity.getSurname() );
        salesman.pesel( salesmanEntity.getPesel() );
        salesman.invoices( invoiceEntitySetToInvoiceSet( salesmanEntity.getInvoices() ) );

        return salesman.build();
    }

    protected Invoice invoiceEntityToInvoice(InvoiceEntity invoiceEntity) {
        if ( invoiceEntity == null ) {
            return null;
        }

        Invoice.InvoiceBuilder invoice = Invoice.builder();

        invoice.invoiceId( invoiceEntity.getInvoiceId() );
        invoice.invoiceNumber( invoiceEntity.getInvoiceNumber() );
        invoice.dateTime( invoiceEntity.getDateTime() );
        invoice.car( carToBuyEntityToCarToBuy( invoiceEntity.getCar() ) );
        invoice.customer( mapFromEntity( invoiceEntity.getCustomer() ) );
        invoice.salesman( salesmanEntityToSalesman( invoiceEntity.getSalesman() ) );

        return invoice.build();
    }

    protected Set<CarServiceRequest> carServiceRequestEntitySetToCarServiceRequestSet(Set<CarServiceRequestEntity> set) {
        if ( set == null ) {
            return null;
        }

        Set<CarServiceRequest> set1 = new LinkedHashSet<CarServiceRequest>( Math.max( (int) ( set.size() / .75f ) + 1, 16 ) );
        for ( CarServiceRequestEntity carServiceRequestEntity : set ) {
            set1.add( carServiceRequestEntityToCarServiceRequest( carServiceRequestEntity ) );
        }

        return set1;
    }

    protected CarToService carToServiceEntityToCarToService(CarToServiceEntity carToServiceEntity) {
        if ( carToServiceEntity == null ) {
            return null;
        }

        CarToService.CarToServiceBuilder carToService = CarToService.builder();

        carToService.carToServiceId( carToServiceEntity.getCarToServiceId() );
        carToService.vin( carToServiceEntity.getVin() );
        carToService.brand( carToServiceEntity.getBrand() );
        carToService.model( carToServiceEntity.getModel() );
        carToService.year( carToServiceEntity.getYear() );
        carToService.carServiceRequests( carServiceRequestEntitySetToCarServiceRequestSet( carToServiceEntity.getCarServiceRequests() ) );

        return carToService.build();
    }

    protected Set<ServiceMechanic> serviceMechanicEntitySetToServiceMechanicSet(Set<ServiceMechanicEntity> set) {
        if ( set == null ) {
            return null;
        }

        Set<ServiceMechanic> set1 = new LinkedHashSet<ServiceMechanic>( Math.max( (int) ( set.size() / .75f ) + 1, 16 ) );
        for ( ServiceMechanicEntity serviceMechanicEntity : set ) {
            set1.add( serviceMechanicEntityToServiceMechanic( serviceMechanicEntity ) );
        }

        return set1;
    }

    protected Mechanic mechanicEntityToMechanic(MechanicEntity mechanicEntity) {
        if ( mechanicEntity == null ) {
            return null;
        }

        Mechanic.MechanicBuilder mechanic = Mechanic.builder();

        mechanic.mechanicId( mechanicEntity.getMechanicId() );
        mechanic.name( mechanicEntity.getName() );
        mechanic.surname( mechanicEntity.getSurname() );
        mechanic.pesel( mechanicEntity.getPesel() );
        mechanic.serviceMechanics( serviceMechanicEntitySetToServiceMechanicSet( mechanicEntity.getServiceMechanics() ) );

        return mechanic.build();
    }

    protected Service serviceEntityToService(ServiceEntity serviceEntity) {
        if ( serviceEntity == null ) {
            return null;
        }

        Service.ServiceBuilder service = Service.builder();

        service.serviceId( serviceEntity.getServiceId() );
        service.serviceCode( serviceEntity.getServiceCode() );
        service.description( serviceEntity.getDescription() );
        service.price( serviceEntity.getPrice() );
        service.serviceMechanics( serviceMechanicEntitySetToServiceMechanicSet( serviceEntity.getServiceMechanics() ) );

        return service.build();
    }

    protected ServiceMechanic serviceMechanicEntityToServiceMechanic(ServiceMechanicEntity serviceMechanicEntity) {
        if ( serviceMechanicEntity == null ) {
            return null;
        }

        ServiceMechanic.ServiceMechanicBuilder serviceMechanic = ServiceMechanic.builder();

        serviceMechanic.serviceMechanicId( serviceMechanicEntity.getServiceMechanicId() );
        serviceMechanic.hours( serviceMechanicEntity.getHours() );
        serviceMechanic.comment( serviceMechanicEntity.getComment() );
        serviceMechanic.carServiceRequest( carServiceRequestEntityToCarServiceRequest( serviceMechanicEntity.getCarServiceRequest() ) );
        serviceMechanic.mechanic( mechanicEntityToMechanic( serviceMechanicEntity.getMechanic() ) );
        serviceMechanic.service( serviceEntityToService( serviceMechanicEntity.getService() ) );

        return serviceMechanic.build();
    }

    protected Set<ServicePart> servicePartEntitySetToServicePartSet(Set<ServicePartEntity> set) {
        if ( set == null ) {
            return null;
        }

        Set<ServicePart> set1 = new LinkedHashSet<ServicePart>( Math.max( (int) ( set.size() / .75f ) + 1, 16 ) );
        for ( ServicePartEntity servicePartEntity : set ) {
            set1.add( servicePartEntityToServicePart( servicePartEntity ) );
        }

        return set1;
    }

    protected Part partEntityToPart(PartEntity partEntity) {
        if ( partEntity == null ) {
            return null;
        }

        Part.PartBuilder part = Part.builder();

        part.partId( partEntity.getPartId() );
        part.serialNumber( partEntity.getSerialNumber() );
        part.description( partEntity.getDescription() );
        part.price( partEntity.getPrice() );
        part.serviceParts( servicePartEntitySetToServicePartSet( partEntity.getServiceParts() ) );

        return part.build();
    }

    protected ServicePart servicePartEntityToServicePart(ServicePartEntity servicePartEntity) {
        if ( servicePartEntity == null ) {
            return null;
        }

        ServicePart.ServicePartBuilder servicePart = ServicePart.builder();

        servicePart.servicePartId( servicePartEntity.getServicePartId() );
        servicePart.quantity( servicePartEntity.getQuantity() );
        servicePart.carServiceRequest( carServiceRequestEntityToCarServiceRequest( servicePartEntity.getCarServiceRequest() ) );
        servicePart.part( partEntityToPart( servicePartEntity.getPart() ) );

        return servicePart.build();
    }

    protected CarServiceRequest carServiceRequestEntityToCarServiceRequest(CarServiceRequestEntity carServiceRequestEntity) {
        if ( carServiceRequestEntity == null ) {
            return null;
        }

        CarServiceRequest.CarServiceRequestBuilder carServiceRequest = CarServiceRequest.builder();

        carServiceRequest.carServiceRequestId( carServiceRequestEntity.getCarServiceRequestId() );
        carServiceRequest.carServiceRequestNumber( carServiceRequestEntity.getCarServiceRequestNumber() );
        carServiceRequest.receivedDateTime( carServiceRequestEntity.getReceivedDateTime() );
        carServiceRequest.completedDateTime( carServiceRequestEntity.getCompletedDateTime() );
        carServiceRequest.customerComment( carServiceRequestEntity.getCustomerComment() );
        carServiceRequest.customer( mapFromEntity( carServiceRequestEntity.getCustomer() ) );
        carServiceRequest.car( carToServiceEntityToCarToService( carServiceRequestEntity.getCar() ) );
        carServiceRequest.serviceMechanics( serviceMechanicEntitySetToServiceMechanicSet( carServiceRequestEntity.getServiceMechanics() ) );
        carServiceRequest.serviceParts( servicePartEntitySetToServicePartSet( carServiceRequestEntity.getServiceParts() ) );

        return carServiceRequest.build();
    }

    protected AddressEntity addressToAddressEntity(Address address) {
        if ( address == null ) {
            return null;
        }

        AddressEntity.AddressEntityBuilder addressEntity = AddressEntity.builder();

        addressEntity.addressId( address.getAddressId() );
        addressEntity.country( address.getCountry() );
        addressEntity.city( address.getCity() );
        addressEntity.postalCode( address.getPostalCode() );
        addressEntity.address( address.getAddress() );
        addressEntity.customer( mapToEntity( address.getCustomer() ) );

        return addressEntity.build();
    }

    protected CarToBuyEntity carToBuyToCarToBuyEntity(CarToBuy carToBuy) {
        if ( carToBuy == null ) {
            return null;
        }

        CarToBuyEntity.CarToBuyEntityBuilder carToBuyEntity = CarToBuyEntity.builder();

        carToBuyEntity.carToBuyId( carToBuy.getCarToBuyId() );
        carToBuyEntity.vin( carToBuy.getVin() );
        carToBuyEntity.brand( carToBuy.getBrand() );
        carToBuyEntity.model( carToBuy.getModel() );
        carToBuyEntity.year( carToBuy.getYear() );
        carToBuyEntity.color( carToBuy.getColor() );
        carToBuyEntity.price( carToBuy.getPrice() );
        carToBuyEntity.invoice( invoiceToInvoiceEntity( carToBuy.getInvoice() ) );

        return carToBuyEntity.build();
    }

    protected Set<InvoiceEntity> invoiceSetToInvoiceEntitySet(Set<Invoice> set) {
        if ( set == null ) {
            return null;
        }

        Set<InvoiceEntity> set1 = new LinkedHashSet<InvoiceEntity>( Math.max( (int) ( set.size() / .75f ) + 1, 16 ) );
        for ( Invoice invoice : set ) {
            set1.add( invoiceToInvoiceEntity( invoice ) );
        }

        return set1;
    }

    protected SalesmanEntity salesmanToSalesmanEntity(Salesman salesman) {
        if ( salesman == null ) {
            return null;
        }

        SalesmanEntity.SalesmanEntityBuilder salesmanEntity = SalesmanEntity.builder();

        salesmanEntity.salesmanId( salesman.getSalesmanId() );
        salesmanEntity.name( salesman.getName() );
        salesmanEntity.surname( salesman.getSurname() );
        salesmanEntity.pesel( salesman.getPesel() );
        salesmanEntity.invoices( invoiceSetToInvoiceEntitySet( salesman.getInvoices() ) );

        return salesmanEntity.build();
    }

    protected InvoiceEntity invoiceToInvoiceEntity(Invoice invoice) {
        if ( invoice == null ) {
            return null;
        }

        InvoiceEntity.InvoiceEntityBuilder invoiceEntity = InvoiceEntity.builder();

        invoiceEntity.invoiceId( invoice.getInvoiceId() );
        invoiceEntity.invoiceNumber( invoice.getInvoiceNumber() );
        invoiceEntity.dateTime( invoice.getDateTime() );
        invoiceEntity.car( carToBuyToCarToBuyEntity( invoice.getCar() ) );
        invoiceEntity.customer( mapToEntity( invoice.getCustomer() ) );
        invoiceEntity.salesman( salesmanToSalesmanEntity( invoice.getSalesman() ) );

        return invoiceEntity.build();
    }

    protected Set<CarServiceRequestEntity> carServiceRequestSetToCarServiceRequestEntitySet(Set<CarServiceRequest> set) {
        if ( set == null ) {
            return null;
        }

        Set<CarServiceRequestEntity> set1 = new LinkedHashSet<CarServiceRequestEntity>( Math.max( (int) ( set.size() / .75f ) + 1, 16 ) );
        for ( CarServiceRequest carServiceRequest : set ) {
            set1.add( carServiceRequestToCarServiceRequestEntity( carServiceRequest ) );
        }

        return set1;
    }

    protected CarToServiceEntity carToServiceToCarToServiceEntity(CarToService carToService) {
        if ( carToService == null ) {
            return null;
        }

        CarToServiceEntity.CarToServiceEntityBuilder carToServiceEntity = CarToServiceEntity.builder();

        carToServiceEntity.carToServiceId( carToService.getCarToServiceId() );
        carToServiceEntity.vin( carToService.getVin() );
        carToServiceEntity.brand( carToService.getBrand() );
        carToServiceEntity.model( carToService.getModel() );
        carToServiceEntity.year( carToService.getYear() );
        carToServiceEntity.carServiceRequests( carServiceRequestSetToCarServiceRequestEntitySet( carToService.getCarServiceRequests() ) );

        return carToServiceEntity.build();
    }

    protected Set<ServiceMechanicEntity> serviceMechanicSetToServiceMechanicEntitySet(Set<ServiceMechanic> set) {
        if ( set == null ) {
            return null;
        }

        Set<ServiceMechanicEntity> set1 = new LinkedHashSet<ServiceMechanicEntity>( Math.max( (int) ( set.size() / .75f ) + 1, 16 ) );
        for ( ServiceMechanic serviceMechanic : set ) {
            set1.add( serviceMechanicToServiceMechanicEntity( serviceMechanic ) );
        }

        return set1;
    }

    protected MechanicEntity mechanicToMechanicEntity(Mechanic mechanic) {
        if ( mechanic == null ) {
            return null;
        }

        MechanicEntity.MechanicEntityBuilder mechanicEntity = MechanicEntity.builder();

        mechanicEntity.mechanicId( mechanic.getMechanicId() );
        mechanicEntity.name( mechanic.getName() );
        mechanicEntity.surname( mechanic.getSurname() );
        mechanicEntity.pesel( mechanic.getPesel() );
        mechanicEntity.serviceMechanics( serviceMechanicSetToServiceMechanicEntitySet( mechanic.getServiceMechanics() ) );

        return mechanicEntity.build();
    }

    protected ServiceEntity serviceToServiceEntity(Service service) {
        if ( service == null ) {
            return null;
        }

        ServiceEntity.ServiceEntityBuilder serviceEntity = ServiceEntity.builder();

        serviceEntity.serviceId( service.getServiceId() );
        serviceEntity.serviceCode( service.getServiceCode() );
        serviceEntity.description( service.getDescription() );
        serviceEntity.price( service.getPrice() );
        serviceEntity.serviceMechanics( serviceMechanicSetToServiceMechanicEntitySet( service.getServiceMechanics() ) );

        return serviceEntity.build();
    }

    protected ServiceMechanicEntity serviceMechanicToServiceMechanicEntity(ServiceMechanic serviceMechanic) {
        if ( serviceMechanic == null ) {
            return null;
        }

        ServiceMechanicEntity.ServiceMechanicEntityBuilder serviceMechanicEntity = ServiceMechanicEntity.builder();

        serviceMechanicEntity.serviceMechanicId( serviceMechanic.getServiceMechanicId() );
        serviceMechanicEntity.hours( serviceMechanic.getHours() );
        serviceMechanicEntity.comment( serviceMechanic.getComment() );
        serviceMechanicEntity.carServiceRequest( carServiceRequestToCarServiceRequestEntity( serviceMechanic.getCarServiceRequest() ) );
        serviceMechanicEntity.mechanic( mechanicToMechanicEntity( serviceMechanic.getMechanic() ) );
        serviceMechanicEntity.service( serviceToServiceEntity( serviceMechanic.getService() ) );

        return serviceMechanicEntity.build();
    }

    protected Set<ServicePartEntity> servicePartSetToServicePartEntitySet(Set<ServicePart> set) {
        if ( set == null ) {
            return null;
        }

        Set<ServicePartEntity> set1 = new LinkedHashSet<ServicePartEntity>( Math.max( (int) ( set.size() / .75f ) + 1, 16 ) );
        for ( ServicePart servicePart : set ) {
            set1.add( servicePartToServicePartEntity( servicePart ) );
        }

        return set1;
    }

    protected PartEntity partToPartEntity(Part part) {
        if ( part == null ) {
            return null;
        }

        PartEntity.PartEntityBuilder partEntity = PartEntity.builder();

        partEntity.partId( part.getPartId() );
        partEntity.serialNumber( part.getSerialNumber() );
        partEntity.description( part.getDescription() );
        partEntity.price( part.getPrice() );
        partEntity.serviceParts( servicePartSetToServicePartEntitySet( part.getServiceParts() ) );

        return partEntity.build();
    }

    protected ServicePartEntity servicePartToServicePartEntity(ServicePart servicePart) {
        if ( servicePart == null ) {
            return null;
        }

        ServicePartEntity.ServicePartEntityBuilder servicePartEntity = ServicePartEntity.builder();

        servicePartEntity.servicePartId( servicePart.getServicePartId() );
        servicePartEntity.quantity( servicePart.getQuantity() );
        servicePartEntity.carServiceRequest( carServiceRequestToCarServiceRequestEntity( servicePart.getCarServiceRequest() ) );
        servicePartEntity.part( partToPartEntity( servicePart.getPart() ) );

        return servicePartEntity.build();
    }

    protected CarServiceRequestEntity carServiceRequestToCarServiceRequestEntity(CarServiceRequest carServiceRequest) {
        if ( carServiceRequest == null ) {
            return null;
        }

        CarServiceRequestEntity.CarServiceRequestEntityBuilder carServiceRequestEntity = CarServiceRequestEntity.builder();

        carServiceRequestEntity.carServiceRequestId( carServiceRequest.getCarServiceRequestId() );
        carServiceRequestEntity.carServiceRequestNumber( carServiceRequest.getCarServiceRequestNumber() );
        carServiceRequestEntity.receivedDateTime( carServiceRequest.getReceivedDateTime() );
        carServiceRequestEntity.completedDateTime( carServiceRequest.getCompletedDateTime() );
        carServiceRequestEntity.customerComment( carServiceRequest.getCustomerComment() );
        carServiceRequestEntity.customer( mapToEntity( carServiceRequest.getCustomer() ) );
        carServiceRequestEntity.car( carToServiceToCarToServiceEntity( carServiceRequest.getCar() ) );
        carServiceRequestEntity.serviceMechanics( serviceMechanicSetToServiceMechanicEntitySet( carServiceRequest.getServiceMechanics() ) );
        carServiceRequestEntity.serviceParts( servicePartSetToServicePartEntitySet( carServiceRequest.getServiceParts() ) );

        return carServiceRequestEntity.build();
    }
}

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
    date = "2023-05-23T10:47:08+0200",
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

        customer.invoices( mapInvoices( entity.getInvoices() ) );
        customer.customerId( entity.getCustomerId() );
        customer.name( entity.getName() );
        customer.surname( entity.getSurname() );
        customer.phone( entity.getPhone() );
        customer.email( entity.getEmail() );
        customer.address( addressEntityToAddress( entity.getAddress() ) );
        customer.carServiceRequests( carServiceRequestEntitySetToCarServiceRequestSet( entity.getCarServiceRequests() ) );

        return customer.build();
    }

    @Override
    public Invoice mapFromEntity(InvoiceEntity entity) {
        if ( entity == null ) {
            return null;
        }

        Invoice.InvoiceBuilder invoice = Invoice.builder();

        invoice.invoiceId( entity.getInvoiceId() );
        invoice.invoiceNumber( entity.getInvoiceNumber() );
        invoice.dateTime( entity.getDateTime() );

        return invoice.build();
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

        return address.build();
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
}

package pl.zajavka.infrastructure.database.repository;

import org.hibernate.Session;
import pl.zajavka.business.dao.CustomerDAO;
import pl.zajavka.infrastructure.configuration.HibernateUtil;
import pl.zajavka.infrastructure.database.entity.CustomerEntity;

import java.util.Objects;
import java.util.Optional;

public class CustomerRepository implements CustomerDAO {

    @Override
    public Optional<CustomerEntity> findByEmail(String email) {
        try (Session session = HibernateUtil.getSession()) {
            Objects.requireNonNull(session);
            session.beginTransaction();

            String query = "SELECT ce FROM CustomerEntity ce WHERE ce.email = :email";
            Optional<CustomerEntity> result = session.createQuery(query, CustomerEntity.class)
                    .setParameter("email", email)
                    .uniqueResultOptional();

            session.getTransaction().commit();
            return result;
        }
    }

    @Override
    public void issueInvoice(CustomerEntity customer) {
        try (Session session = HibernateUtil.getSession()) {
            Objects.requireNonNull(session);
            session.beginTransaction();

            if (Objects.isNull(customer.getCustomerId())) {
                session.persist(customer);
            }
            customer.getInvoices().stream()
                    .filter(invoice -> Objects.isNull(invoice.getInvoiceId()))
                    .forEach(invoice -> {
                        invoice.setCustomer(customer);
                        session.persist(invoice);
                    });

            session.getTransaction().commit();
        }
    }

    @Override
    public void saveServiceRequest(CustomerEntity customer) {
        try (Session session = HibernateUtil.getSession()) {
            Objects.requireNonNull(session);
            session.beginTransaction();
            customer.getCarServiceRequests().stream()
                    .filter(request -> Objects.isNull(request.getCarServiceRequestId()))
                    .forEach(session::persist);
            session.getTransaction().commit();
        }
    }

    @Override
    public CustomerEntity saveCustomer(CustomerEntity entity) {
        try (Session session = HibernateUtil.getSession()) {
            Objects.requireNonNull(session);
            session.beginTransaction();
            session.persist(entity);
            session.getTransaction().commit();
            return entity;
        }
    }
}

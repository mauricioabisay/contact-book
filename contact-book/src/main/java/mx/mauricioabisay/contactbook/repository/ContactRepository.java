package mx.mauricioabisay.contactbook.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import mx.mauricioabisay.contactbook.model.Contact;

@Repository
public interface ContactRepository extends JpaRepository<Contact, Long> {

}

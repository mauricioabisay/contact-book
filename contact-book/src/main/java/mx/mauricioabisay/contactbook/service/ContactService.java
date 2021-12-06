package mx.mauricioabisay.contactbook.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mx.mauricioabisay.contactbook.model.Contact;
import mx.mauricioabisay.contactbook.repository.ContactRepository;

@Service
public class ContactService {
	@Autowired
	ContactRepository repo;
	
	public Contact findById(long id) {
		Optional<Contact> contact = repo.findById(id);
		if (contact.isPresent()) {
			return contact.get();
		}
		return null;
	}
	
	public List<Contact> list() {
		return repo.findAll();
	}
	
	public Contact save(Contact contact) {
		return repo.save(contact);
	}
	
	public void delete(long id) {
		repo.deleteById(id);
	}
	
	public void delete(Contact contact) {
		repo.delete(contact);
	}
}

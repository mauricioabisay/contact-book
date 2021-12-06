package mx.mauricioabisay.contactbook;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import mx.mauricioabisay.contactbook.model.Contact;
import mx.mauricioabisay.contactbook.service.ContactService;

@RestController
@RequestMapping("contacts")
public class ContactController {
	@Autowired
	private ContactService service;
	
	@GetMapping("/{id}")
	public Contact getById(@PathVariable long id) {
		return service.findById(id);
	}
	
	@GetMapping("/")
	public List<Contact> list() {
		return service.list();
	}
	
	@PostMapping
	public Contact create(Contact contact) {
		return service.save(contact);
	}
}

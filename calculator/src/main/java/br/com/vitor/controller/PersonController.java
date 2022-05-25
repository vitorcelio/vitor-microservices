package br.com.vitor.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import br.com.vitor.model.Person;
import br.com.vitor.service.PersonService;

@RestController
@RequestMapping("person")
public class PersonController {

	@Autowired
	private PersonService personService;

	@GetMapping("{id}")
	public Person findById(@PathVariable("id") Long id) {
		return personService.findById(id);
	}

	@GetMapping
	public List<Person> findAll() {
		return personService.findAll();
	}
	
	@PostMapping
	public Person save(@RequestBody Person person) {
		return personService.save(person);
	}
	
	@PutMapping("{id}")
	public Person update(@PathVariable("id") Long id, @RequestBody Person person) {
		return personService.update(id, person);
	}
	
	@DeleteMapping("{id}")
	public void delete(@PathVariable("id") Long id) {
		personService.delete(id);
	}

}

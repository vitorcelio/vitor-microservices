package br.com.vitor.service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.stereotype.Service;

import br.com.vitor.model.Person;

@Service
public class PersonService {
	
	private final AtomicLong counter = new AtomicLong();
	private List<Person> persons = new ArrayList<>();

	public Person save(Person person) {
		person.setId(counter.incrementAndGet());
		persons.add(person);
		return person;
	}
	
	public Person update(Long id, Person personUp) {
		for (Person person : persons) {
			if(person.getId().longValue() == id) {
				persons.remove(person);
				
				person.setId(id);
				person.setNome(personUp.getNome());
				person.setSobrenome(personUp.getSobrenome());
				person.setEndereco(personUp.getEndereco());
				
				persons.add(person);
				return person;
			}
		}
		
		return new Person("não encontrado!");
	}
	
	public void delete(Long id) {
		for (Person person : persons) {
			if(person.getId().longValue() == id) {
				persons.remove(person);
			}
		}
	}

	public Person findById(Long id) {
		for (Person person : persons) {
			if(person.getId().longValue() == id) {
				return person;
			}
		}
		
		return new Person("não encontrado!");
	}

	public List<Person> findAll() {
		return this.persons;
	}

}

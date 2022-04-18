package br.com.erudio.services;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.stereotype.Service;

import br.com.erudio.model.Person;

@Service
public class PersonServices {

	private final AtomicLong counter = new AtomicLong();
	
	public Person findById(String id) {
		Person person = new Person();
		person.setId(counter.incrementAndGet());
		person.setFirstName("Gabriel");
		person.setLastName("Ternes");
		person.setAddress("Canoas - Rio Grande do Sul - Brasil");
		person.setGender("Male");
		
		return person;
	}
	
}

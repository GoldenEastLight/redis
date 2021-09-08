package com.practice.redis.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.practice.redis.entity.Person;
import com.practice.redis.repository.PersonRepository;

@Service
public class PersonService {

    @Autowired
    private PersonRepository personRepository;

    // C :: 사람 save
    public Person create(String firstName, String lastName, int age) {
        return personRepository.save(new Person(firstName, lastName, age));
    }

    // R :: 사람 모두 get List
    public List<Person> getAll() {
        return personRepository.findAll();
    }

    // R :: 사람 1명 get
    public Person getByFirstName(String firstName) {
        return personRepository.findByFirstName(firstName);
    }

    // U :: 사람 정보 update save
    public Person update(String firstName, String lastName, int age) {
        Person person = personRepository.findByFirstName(firstName);
        person.setLastName(lastName);
        person.setAge(age);
        return personRepository.save(person);
    }

    // D :: 사람 모두 delete
    public void deleteAll() {
        personRepository.deleteAll();
    }
}

package com.practice.redis.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.practice.redis.entity.Person;

@Repository
public interface PersonRepository extends JpaRepository<Person, String> {

    public Person findByFirstName(String firstName);

    public List<Person> findByAge(int age);

}

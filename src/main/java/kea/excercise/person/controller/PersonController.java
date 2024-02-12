package kea.excercise.person.controller;

import kea.excercise.person.model.Person;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@RestController
public class PersonController {

    @GetMapping("/persons")
    public List<Person> getAllPersons(){
        var person1 = new Person();
        person1.setId(1);
        person1.setFirstName("DUMMY");
        person1.setLastName("TEST");
        person1.setDateOfBirth(LocalDate.parse("1978-01-01"));

        var person2 = new Person();
        person2.setId(2);
        person2.setFirstName("MUMMY");
        person2.setLastName("QEST");
        person2.setDateOfBirth(LocalDate.parse("1938-05-01"));

        List<Person> persons = new ArrayList<>();
        persons.add(person1);
        persons.add(person2);

        return persons;

    }
}

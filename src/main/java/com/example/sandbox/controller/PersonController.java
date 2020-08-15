package com.example.sandbox.controller;

import com.example.sandbox.entity.Person;
import com.example.sandbox.repository.PersonRepo;
import javassist.NotFoundException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/person")
public class PersonController {
    private static final Logger logger = LoggerFactory.getLogger(PersonController.class);

    private final PersonRepo personRepo;

    @Autowired
    public PersonController(PersonRepo personRepo) {
        this.personRepo = personRepo;
    }

    // http://localhost:8080/sandbox/person/1001
    @GetMapping("{id}")
    public Person getPersonById(@PathVariable Integer id) throws Exception {
        logger.info("get person by id = {}", id);
        Optional<Person> result = personRepo.findById(id);
        if (result.isPresent()) {
            return result.get();
        } else {
            throw new NotFoundException("Person not found");
        }
    }
}

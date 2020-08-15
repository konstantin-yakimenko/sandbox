package com.example.sandbox.controller;

import com.example.sandbox.entity.Test;
import com.example.sandbox.entity.TestId;
import com.example.sandbox.repository.TestRepo;
import javassist.NotFoundException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/test")
public class TestController {
    private static final Logger logger = LoggerFactory.getLogger(TestController.class);

    private final TestRepo testRepo;

    @Autowired
    public TestController(TestRepo testRepo) {
        this.testRepo = testRepo;
    }

    // http://localhost:8080/sandbox/test?key1=1&key2=1
    @GetMapping
    public Test getbykey(@RequestParam("key1") Integer key1,
                         @RequestParam("key2") Integer key2) throws Exception {
        TestId testId = new TestId(key1, key2);

        logger.info("get test by id = {}", testId);
        Optional<Test> result = testRepo.findById(testId);
        if (result.isPresent()) {
            return result.get();
        } else {
            throw new NotFoundException("Person not found");
        }
    }
}

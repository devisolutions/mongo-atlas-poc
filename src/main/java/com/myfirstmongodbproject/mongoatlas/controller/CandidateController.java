package com.myfirstmongodbproject.mongoatlas.controller;

import com.myfirstmongodbproject.mongoatlas.models.Candidate;
import com.myfirstmongodbproject.mongoatlas.repository.CandidateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping
public class CandidateController {

    @Autowired
    private CandidateRepository candidateRepository;

    @PostMapping("/candidate")
    @ResponseStatus(code = HttpStatus.CREATED)
    public Candidate add(@RequestBody Candidate candidate) {
        return candidateRepository.save(candidate);
    }

    @GetMapping("/candidate")
    public List<Candidate> get(@RequestParam("name") String name) {
        System.out.println("Candidate Name : " + name);
        return candidateRepository.findByName(name);
    }

    @GetMapping("/hello")
    public String test(@RequestParam("name") String name) {
        return "Hello " + name;
    }
}
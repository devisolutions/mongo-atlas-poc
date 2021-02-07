package com.myfirstmongodbproject.mongoatlas.repository;

import com.myfirstmongodbproject.mongoatlas.models.Candidate;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface CandidateRepository extends MongoRepository<Candidate, String> {
    List<Candidate> findByName(String name);
}

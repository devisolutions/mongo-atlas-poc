package com.myfirstmongodbproject.mongoatlas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories(basePackages={"com.myfirstmongodbproject.mongoatlas.repository"})
public class MongoatlasApplication {

    public static void main(String[] args) {
        SpringApplication.run(MongoatlasApplication.class, args);
    }

}

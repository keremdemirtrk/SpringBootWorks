package com.springtut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories //Mongodb repos' enable
public class Application {


    public static void main(String[] args) {
        SpringApplication.run(Application.class,args);

    }
}

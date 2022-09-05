package com.example.crudspring;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
class LoadDatabase {

  private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);

  @Bean
  CommandLineRunner initDatabase(JobRepository repository) {

    return args -> {
      log.info("Preloading " + repository.save(new Job("Dummy First Job", "Description of my dummy first job")));
      log.info("Preloading " + repository.save(new Job("Dummy Second Job", "Description of my dummy second job")));
    };
  }
}
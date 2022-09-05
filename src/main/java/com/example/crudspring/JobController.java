package com.example.crudspring;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
class JobController {
    
    private final JobRepository repository;

    JobController(JobRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/job")
    List<Job> getAll() {
        return repository.findAll();
    }

    @PostMapping("/job")
    Job create(@RequestBody Job job) {
        return repository.save(job);
    }

    @GetMapping("/job/{id}")
    Job getById(@PathVariable Long id) {
        return repository.findById(id)
            .orElseThrow(() -> new JobNotFoundException(id));
    }

    @PutMapping("/job/{id}")
    Job update(@RequestBody Job newJob, @PathVariable Long id) {
        return repository.findById(id).map(job -> {
            job.setTitle(newJob.getTitle());
            job.setDesciption(newJob.getDescription());
            return repository.save(job);
        })
        .orElseGet(() -> {
            newJob.setId(id);
            return repository.save(newJob);            
        });
    }

    @DeleteMapping("/job/{id}")
    void delete(@PathVariable Long id) {
        repository.deleteById(id);
    }
}
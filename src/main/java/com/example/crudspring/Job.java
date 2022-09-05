package com.example.crudspring;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
class Job {

    private @Id @GeneratedValue Long id;
    private String title;
    private String description;
    
    Job() {}

    Job(String title, String description) {
        this.title = title;
        this.description = description;
    }

    public Long getId() {
        return this.id;
    }

    public String getTitle() {
        return this.title;
    }

    public String getDescription() {
        return this.description;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDesciption(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Job)) return false;
        
        Job job = (Job) o;
        return Objects.equals(this.id, job.id) && Objects.equals(this.title, job.title) && Objects.equals(this.description, job.description);
    }

    @Override
    public String toString() {
        return String.format("Job(id=%d, title='%s', description='%s')", this.id, this.title, this.description);
    }

}
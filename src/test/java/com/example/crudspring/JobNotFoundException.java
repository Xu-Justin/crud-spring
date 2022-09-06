package com.example.crudspring;

class JobNotFoundException extends RuntimeException {

    JobNotFoundException(Long id) {
        super(String.format("Not found %d", id));
    }

}
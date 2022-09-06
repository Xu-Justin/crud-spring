# crud-spring

This project is a basic example of performing CRUD and API using [Spring](https://spring.io/).

## Usage

Run the following commands to run the applications.

```bash
cd crud-spring
./mvnw spring-boot:run
```

## API

| Method   | Route       | Request                                                            | Description                                     |
|:--------:|-------------|--------------------------------------------------------------------|-------------------------------------------------|
| `GET`    | /job        | -                                                                  | Display all jobs.                               |
| `POST`   | /job        | <pre>{<br>  "title": str<br>  "description": str<br>}</pre >       | Create a job.                                   |
| `GET`    | /job/{id}   | -                                                                  | Display a job by {id}.                          |
| `PUT`    | /job/{id}   | <pre>{<br>  "title": str<br>  "description": str<br>}</pre>        | Update a job by {id}.                           |
| `DELETE` | /job/{id}   | -                                                                  | Delete a job by {id}.                           |

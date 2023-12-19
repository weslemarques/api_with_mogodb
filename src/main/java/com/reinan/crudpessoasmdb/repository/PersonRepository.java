package com.reinan.crudpessoasmdb.repository;

import com.reinan.crudpessoasmdb.model.Person;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PersonRepository extends MongoRepository<Person, String> {
}

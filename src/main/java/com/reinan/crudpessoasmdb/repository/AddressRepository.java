package com.reinan.crudpessoasmdb.repository;

import com.reinan.crudpessoasmdb.model.Address;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface AddressRepository extends MongoRepository<Address, String> {
}

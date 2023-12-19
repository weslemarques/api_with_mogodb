package com.reinan.crudpessoasmdb.service;

import com.reinan.crudpessoasmdb.dto.PersonDTO;
import com.reinan.crudpessoasmdb.model.Person;
import com.reinan.crudpessoasmdb.repository.AddressRepository;
import com.reinan.crudpessoasmdb.repository.PersonRepository;
import com.reinan.crudpessoasmdb.utils.mapper.PersonMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {

    private final PersonRepository personRepository;

    final AddressRepository addressRepository;

    private final PersonMapper mapperPerson;


    public PersonService(PersonRepository personRepository, AddressRepository addressRepository, PersonMapper mapper) {
        this.personRepository = personRepository;
        this.addressRepository = addressRepository;
        this.mapperPerson = mapper;
    }

    public List<Person> getAll() {
        return personRepository.findAll();
    }

    public void save(PersonDTO personDTO) {
        var person = new Person();
        mapperPerson.toModel(person,personDTO);
        var address  = addressRepository.save(personDTO.getAddress());
        person.setAddress(address);
        personRepository.save(person);
    }

}

package com.reinan.crudpessoasmdb.controller;

import com.reinan.crudpessoasmdb.dto.PersonDTO;
import com.reinan.crudpessoasmdb.model.Address;
import com.reinan.crudpessoasmdb.model.Person;
import com.reinan.crudpessoasmdb.repository.AddressRepository;
import com.reinan.crudpessoasmdb.repository.PersonRepository;
import com.reinan.crudpessoasmdb.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/people")
public class PersonController {
    private final PersonService personService;

    public PersonController(PersonService personService) {
        this.personService = personService;
    }
    @PostMapping
    public void save(@RequestBody PersonDTO personDTO){
        personService.save(personDTO);
    }

    @GetMapping
    public List<Person> getAll(){
       return personService.getAll();
    }
}

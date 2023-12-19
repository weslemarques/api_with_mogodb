package com.reinan.crudpessoasmdb.utils.mapper;

import com.reinan.crudpessoasmdb.dto.PersonDTO;
import com.reinan.crudpessoasmdb.model.Person;
import org.springframework.stereotype.Component;

@Component
public class PersonMapper {

    public void toDTO(Person person, PersonDTO dto){
        dto.setAddress(person.getAddress());
        dto.setAge(person.getAge());
        dto.setName(person.getName());
        dto.setId(person.getId());
    }

    public void toModel(Person person, PersonDTO dto){
        person.setAge(dto.getAge());
        person.setName(dto.getName());
    }
}

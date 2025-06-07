package com.beesion.ms.test.service.impl;

import com.beesion.ms.test.dto.PersonDto;
import com.beesion.ms.test.mapper.PersonMapper;
import com.beesion.ms.test.model.Person;
import com.beesion.ms.test.repository.PersonRepo;
import com.beesion.ms.test.service.IPersonService;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class PersonService implements IPersonService {

    @Inject
    PersonRepo personRepo;//Inyecta la dependencia y no la clase concreta

    @Override
    public void save(PersonDto dto) {
        Person entity = PersonMapper.toEntity(dto);//Mapeamos dto a entidad
        personRepo.save(entity);//Guardamos la entidad
    }
}

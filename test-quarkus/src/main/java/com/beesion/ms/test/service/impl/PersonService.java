package com.beesion.ms.test.service.impl;

import com.beesion.ms.test.dto.AddressDto;
import com.beesion.ms.test.dto.PersonDto;
import com.beesion.ms.test.mapper.AddressMapper;
import com.beesion.ms.test.mapper.PersonMapper;
import com.beesion.ms.test.model.Address;
import com.beesion.ms.test.model.Person;
import com.beesion.ms.test.repository.AddressRepo;
import com.beesion.ms.test.repository.PersonRepo;
import com.beesion.ms.test.service.IPersonService;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import java.util.List;
import java.util.stream.Collectors;

@ApplicationScoped
public class PersonService implements IPersonService {

    @Inject
    PersonRepo personRepo;//Inyecta la dependencia y no la clase concreta
    
    @Inject
    AddressRepo addressRepo;
    
    @Override
    public void save(PersonDto dto) {
        Person entity = PersonMapper.toEntity(dto);//Mapeamos dto a entidad
        personRepo.save(entity);//Guardamos la entidad
    }
    
    @Override
    public List<AddressDto> findAddressesByPersonId(Long personId) {
        List<Address> addresses = addressRepo.findByPersonId(personId);
        return addresses.stream()
                .map(AddressMapper::toDto)
                .collect(Collectors.toList());
    }
}

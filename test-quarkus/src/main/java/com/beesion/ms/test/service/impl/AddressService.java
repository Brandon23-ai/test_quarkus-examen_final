/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.beesion.ms.test.service.impl;

import com.beesion.ms.test.dto.AddressDto;
import com.beesion.ms.test.mapper.AddressMapper;
import com.beesion.ms.test.model.Address;
import com.beesion.ms.test.repository.AddressRepo;
import com.beesion.ms.test.service.IAddressService;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import java.util.List;
import java.util.stream.Collectors;

@ApplicationScoped
public class AddressService implements IAddressService {

    @Inject
    AddressRepo addressRepo;
    
    @Override
    public void save(AddressDto dto) {
        Address address = AddressMapper.toEntity(dto);
        addressRepo.save(address);
    }
    
    @Override
    public List<AddressDto> findAll() {
        List<Address> addresses = addressRepo.findAll();
        return addresses.stream()
                .map(AddressMapper::toDto)
                .collect(Collectors.toList());
    }
 
   
}

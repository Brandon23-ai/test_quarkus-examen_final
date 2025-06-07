/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.beesion.ms.test.mapper;

import com.beesion.ms.test.dto.AddressDto;
import com.beesion.ms.test.model.Address;

public class AddressMapper {
    
    public static Address toEntity(AddressDto dto) {
        Address a = new Address();
        a.setStreet(dto.getStreet());
        a.setCity(dto.getCity());
        a.setZip(dto.getZip());
        return a;
    }

    public static AddressDto toDto(Address a) {
        AddressDto dto = new AddressDto();
        dto.setStreet(a.getStreet());
        dto.setCity(a.getCity());
        dto.setZip(a.getZip());
        return dto;
    }
    
}

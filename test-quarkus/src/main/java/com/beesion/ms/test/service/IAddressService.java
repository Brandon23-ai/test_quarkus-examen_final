/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.beesion.ms.test.service;

import com.beesion.ms.test.dto.AddressDto;
import java.util.List;

public interface IAddressService {
    void save(AddressDto dto);
    List<AddressDto> findAll();

}


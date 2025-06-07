package com.beesion.ms.test.service;

import com.beesion.ms.test.dto.AddressDto;
import com.beesion.ms.test.dto.PersonDto;
import java.util.List;

public interface IPersonService {
    void save(PersonDto dto);//utilizamos PersonDto
    List<AddressDto> findAddressesByPersonId(Long personId);
}

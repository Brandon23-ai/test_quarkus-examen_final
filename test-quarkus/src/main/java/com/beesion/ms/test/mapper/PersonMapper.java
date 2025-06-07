/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.beesion.ms.test.mapper;

import com.beesion.ms.test.dto.PersonDto;
import com.beesion.ms.test.model.Person;


/*
Clase dedicada al mapeo entre dto y entidad.
Mejora:
    -Apliacion de single resonasability.
    -Reutilizacion y mentenibilidad.
    -Facilitar pruebas unitarias
    -Evitar codigo repetido.
*/
public class PersonMapper {
    
    public static PersonDto toDto(Person person) {
        if (person == null) return null;

        PersonDto dto = new PersonDto();
        dto.setName(person.getName());
        return dto;
    }

    public static Person toEntity(PersonDto dto) {
        if (dto == null) return null;

        Person entity = new Person();
        entity.setName(dto.getName());
        return entity;
    }
    
}

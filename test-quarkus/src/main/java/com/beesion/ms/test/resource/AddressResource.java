/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.beesion.ms.test.resource;

import com.beesion.ms.test.dto.AddressDto;
import com.beesion.ms.test.service.IAddressService;

import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import java.util.List;



@Path("/address")
public class AddressResource {
    @Inject
    IAddressService addressService;

    @POST
    public Response save(AddressDto dto) {
        addressService.save(dto);
        return Response.ok("Dirección guardada").build();
    }
    
    @GET
    public Response findAll() {
        List<AddressDto> addresses = addressService.findAll();
        return Response.ok(addresses, MediaType.APPLICATION_JSON).build();
    }
}

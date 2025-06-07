package com.beesion.ms.test.resource;


import com.beesion.ms.test.dto.PersonDto;
import com.beesion.ms.test.service.IPersonService;


import jakarta.inject.Inject;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.core.Response;

@Path("/Person")
public class PersonaResource {
    @Inject
    IPersonService personService;
    

    @POST
    public Response save(PersonDto dto) {
        personService.save(dto);
        return Response.ok("Elemento guardado").build();
    }
}

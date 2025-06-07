package com.beesion.ms.test.resource;


import com.beesion.ms.test.dto.AddressDto;
import com.beesion.ms.test.dto.PersonDto;
import com.beesion.ms.test.service.IPersonService;


import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import java.util.List;

@Path("/Person")
public class PersonaResource {
    @Inject
    IPersonService personService;
    

    @POST
    public Response save(PersonDto dto) {
        personService.save(dto);
        return Response.ok("Elemento guardado").build();
    }
    
    @GET
    @Path("/{id}/addresses")
    public Response getAddressesByPersonId(@PathParam("id") Long personId) {
        List<AddressDto> addresses = personService.findAddressesByPersonId(personId);
        if (addresses == null || addresses.isEmpty()) {
            return Response.noContent().build();
        }
        return Response.ok(addresses, MediaType.APPLICATION_JSON).build();
    }

}

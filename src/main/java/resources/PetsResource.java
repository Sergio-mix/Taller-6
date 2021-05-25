package resources;

import resources.pojos.Pet;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.ArrayList;
import java.util.List;
@Path("/pets")
public class PetsResource {
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response list() {

        List<Pet> pets = new ArrayList<Pet>();
        pets.add(new Pet(1, 11111 ,"Max","Canino","Doberman","Grande","Macho","/src/main/Images/Max.jpg",1));
        pets.add(new Pet(2, 22222 ,"Perla","Felino","Ragdoll","Mediano","Hembra","/src/main/Images/Perla.jpg",2));
        return Response.ok()
                .entity(pets)
                .build();
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response create(Pet pet) {
        pet.setName("Bonnie");
        return Response.status(Response.Status.CREATED)
                .entity(pet)
                .build();
    }
    @PUT
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response modify( @PathParam("id") Integer id, Pet pet) {

        return Response.ok()
                .entity(pet)
                .build();
    }

}

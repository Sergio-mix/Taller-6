package co.edu.unbosque.taller_6.resources;

import co.edu.unbosque.taller_6.resources.pojos.Owner;
import co.edu.unbosque.taller_6.resources.pojos.Pet;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.ArrayList;
import java.util.List;

/**
 * PetsResource
 */
@Path("/pets")
public class PetsResource {
    private List<Pet> pets;

    /**
     * method to add pets objects to pets list (get)
     *
     * @return pet list
     */
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response list() {
        pets = new ArrayList<Pet>();

        pets.add(new Pet(1, 11111, "Max", "Canino", "Doberman", "Grande", "Macho", "/src/main/Images/Max.jpg", 1));
        pets.add(new Pet(2, 22222, "Perla", "Felino", "Ragdoll", "Mediano", "Hembra", "/src/main/Images/Perla.jpg", 2));
        pets.add(new Pet(2, 22222, "Bonnie", "Felino", "Ragdoll", "Mediano", "Hembra", "/src/main/Images/Perla.jpg", 3));

        return Response.ok()
                .entity(pets)
                .build();
    }

    /**
     * method to create a pet object (post)
     *
     * @param pet pet
     * @return pet
     */
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response create(Pet pet) {
        pet.setName("Bonnie");

        return Response.status(Response.Status.CREATED)
                .entity(pet)
                .build();
    }

    /**
     * method to modify a pet (put)
     *
     * @param id  pet id
     * @param pet pet
     * @return modified pet
     */
    @PUT
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response modify(@PathParam("id") Integer id, Pet pet) {
        pet.setPetId(id);
        return Response.ok()
                .entity(pet)
                .build();
    }

    /**
     * @return pet item list
     */
    public List<Pet> getPets() {
        return pets;
    }

    public void setPets(List<Pet> pets) {
        this.pets = pets;
    }
}
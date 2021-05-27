package co.edu.unbosque.taller_6.resources;

import co.edu.unbosque.taller_6.resources.pojos.Owner;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.ArrayList;
import java.util.List;

@Path("/owners")

public class OwnersResource {
    private Owner owner = new Owner();
    private List<Owner> owners = new ArrayList<Owner>();
    private PetsResource petsResource = new PetsResource();


    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response list() {

        owners.add(new Owner("PepitoPerez2", 1, "Pepito Perez", "Carrera 7", "Usaquen"));
        owners.add(new Owner("ElverGalarga145", 2, "Elver Galarga", "Calle 116", "Kenedy"));
        owners.add(new Owner("PepitoPerez3", 3, "Pepito Perez2", "Carrera 7", "Engativa"));

        return Response.ok()
                .entity(owners)
                .build();
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response create(Owner owner) {
        owner.setUserName("PepitoPerez3");
        return Response.status(Response.Status.CREATED)
                .entity(owner)
                .build();
    }

    @PUT
    @Path("/{username}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response modify(@PathParam("username") String username, Owner owner) {

        return Response.ok()
                .entity(owner)
                .build();
    }

    public List<Owner> getOwners() {
        return owners;
    }

    public void setOwners(List<Owner> owners) {
        this.owners = owners;
    }

}

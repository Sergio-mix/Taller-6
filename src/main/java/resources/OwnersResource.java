package resources;

import resources.pojos.Owner;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.ArrayList;
import java.util.List;
@Path("/owners")

public class OwnersResource {
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response list() {

        List<Owner> owners = new ArrayList<Owner>();
        owners.add(new Owner("PepitoPerez2",1, "Pepito Perez" ,"Carrera 7","Usaquen"));
        owners.add(new Owner("ElverGalarga145",2, "Elver Galarga" ,"Calle 116","Usaquen"));
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
    public Response modify( @PathParam("username") String username, Owner owner) {

        return Response.ok()
                .entity(owner)
                .build();
    }

}

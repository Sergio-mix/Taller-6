package co.edu.unbosque.taller_6.resources;

import co.edu.unbosque.taller_6.resources.pojos.Owner;
import co.edu.unbosque.taller_6.resources.pojos.Vet;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.ArrayList;
import java.util.List;
@Path("/vets")
public class VetsResource {
    private Vet vet = new Vet();
    private List<Vet> vets = new ArrayList<Vet>();

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response list() {

        vets.add(new Vet("Rositamel11","Rosa Melano", "Carrera 7", "Usaquen"));
        vets.add(new Vet("ArmandoCS22", "Armando Casas", "Calle 116", "Usaquen"));
        vets.add(new Vet("CameloBto33", "Benito Camelo", "Carrera 95", "Engativa"));

        return Response.ok()
                .entity(vets)
                .build();
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response create(Vet vet) {
        vet.setUsername("ElverGalindo44");
        return Response.status(Response.Status.CREATED)
                .entity(vet)
                .build();
    }

    @PUT
    @Path("/{username}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response modify(@PathParam("username") String username, Vet vet) {
        return Response.ok()
                .entity(vet)
                .build();
    }

}

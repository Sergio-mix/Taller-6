package co.edu.unbosque.taller_6.resources;

import co.edu.unbosque.taller_6.resources.pojos.Owner;
import co.edu.unbosque.taller_6.resources.pojos.Vet;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.ArrayList;
import java.util.List;

/**
 * Class VetsResource
 */
@Path("/vets")
public class VetsResource {
    private Vet vet = new Vet();
    private List<Vet> vets = new ArrayList<Vet>();

    /**
     * Metodo get
     * @return
     */
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response list() {

        vets.add(new Vet(1,"Rositamol11","Rosa Molano", "Carrera 7", "Usaquen"));
        vets.add(new Vet(1,"Rositamol11","Rosa Molano", "Carrera 7", "Usaquen"));
        vets.add(new Vet(2,"ArmandoCS22", "Armando Casas", "Calle 116", "Usaquen"));
        vets.add(new Vet(3,"CamargoBto33", "Benito Camargo", "Carrera 95", "Engativa"));

        return Response.ok()
                .entity(vets)
                .build();
    }

    /**
     * Metodo post
     * @param vet
     * @return
     */
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response create(Vet vet) {
        list();
        vets.add(vet);

        return Response.status(Response.Status.CREATED)
                .entity(vets)
                .build();
    }

    /**
     * Metodo put
     * @param username
     * @param vet
     * @return
     */
    @PUT
    @Path("/{username}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response modify(@PathParam("username") String username, Vet vet) {
        return Response.ok()
                .entity(vet)
                .build();
    }

    public List<Vet> getVets() {
        return vets;
    }

    public void setVets(List<Vet> vets) {
        this.vets = vets;
    }
}

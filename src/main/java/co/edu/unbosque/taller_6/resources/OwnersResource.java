package co.edu.unbosque.taller_6.resources;

import co.edu.unbosque.taller_6.resources.pojos.Owner;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.ArrayList;
import java.util.List;

/**
 * Class OwnersResouerce
 */
@Path("/owners")

public class OwnersResource {
    private Owner owner = new Owner();
    private List<Owner> owners = new ArrayList<Owner>();
    private List<String> usaquen = new ArrayList<>();
    private List<String> kennedy = new ArrayList<>();
    private List<String> engativa = new ArrayList<>();
    private PetsResource petsResource = new PetsResource();

    /**
     * Metodo get
     * @return
     */
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response list() {

        owners.add(new Owner("PepitoPerez2", 1, "Pepito Perez", "Carrera 7", "Usaquen"));
        owners.add(new Owner("Elver145", 2, "Elver Garcia", "Calle 116", "Kennedy"));
        owners.add(new Owner("PepitoPerez3", 3, "Pepito Perez2", "Carrera 7", "Engativa"));
        for (int i = 0; i < owners.size(); i++) {
            if (owners.get(i).getNeighborhood().equals("Usaquen")) {
                usaquen.add(owners.get(i).getNeighborhood());
            }
            if (owners.get(i).getNeighborhood().equals("Kennedy")) {
                kennedy.add(owners.get(i).getNeighborhood());
            }
            if (owners.get(i).getNeighborhood().equals("Engativa")) {
                engativa.add(owners.get(i).getNeighborhood());
            }
        }
        return Response.ok()
                .entity(owners)
                .build();
    }

    /**
     * Metodo post
     * @param owner
     * @return
     */
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response create(Owner owner) {
        list();
        owners.add(owner);
        return Response.status(Response.Status.CREATED)
                .entity(owner)
                .build();
    }

    /**
     * Metodo put
     * @param username
     * @param owner
     * @return
     */
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

    public List<String> getUsaquen() {
        return usaquen;
    }

    public void setUsaquen(List<String> usaquen) {
        this.usaquen = usaquen;
    }

    public List<String> getKennedy() {
        return kennedy;
    }

    public void setKennedy(List<String> kennedy) {
        this.kennedy = kennedy;
    }

    public List<String> getEngativa() {
        return engativa;
    }

    public void setEngativa(List<String> engativa) {
        this.engativa = engativa;
    }
}

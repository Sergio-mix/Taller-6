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
    private List<Owner> owners = new ArrayList<>();
    private List<String> usaquen = new ArrayList<>();
    private List<String> kennedy = new ArrayList<>();
    private List<String> engativa = new ArrayList<>();


    /**
     * Method to list owners by location(get)
     *
     * @return owner list
     */
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response list() {
        owners.add(new Owner("PepitoPerez2", 1, "Pepito Perez", "Carrera 7", "Usaquen"));
        owners.add(new Owner("Elver145", 2, "Elver Garcia", "Calle 116", "Kennedy"));
        owners.add(new Owner("PepitoPerez3", 3, "Pepito Perez2", "Carrera 7", "Engativa"));

        for (Owner value : owners) {
            if (value.getNeighborhood().equals("Usaquen")) {
                usaquen.add(value.getNeighborhood());
            }
            if (value.getNeighborhood().equals("Kennedy")) {
                kennedy.add(value.getNeighborhood());
            }
            if (value.getNeighborhood().equals("Engativa")) {
                engativa.add(value.getNeighborhood());
            }
        }

        return Response.ok()
                .entity(owners)
                .build();
    }

    /**
     * Method to create owner (post)
     *
     * @param owner owner
     * @return owner
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
     * method to modify owner(put)
     *
     * @param username User name
     * @param owner    owner Object
     * @return owner
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

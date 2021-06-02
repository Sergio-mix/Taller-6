package co.edu.unbosque.taller_6.resources;

import com.github.cliftonlabs.json_simple.JsonObject;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * Class TotalOwnersResouerce
 */
@Path("/totalOwners")
public class TotalOwnersResource {
    private OwnersResource ownersResource;

    /**
     * Method to obtain the number of owners by locality
     *
     * @return json with owners by location
     */
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response totalOwners() {
        ownersResource = new OwnersResource();
        ownersResource.list();

        JsonObject json = new JsonObject();
        json.put("El numero de propietarios registrados es:", ownersResource.getOwners().size());
        json.put("El numero de propietarios que hay en Usaquen es:", ownersResource.getUsaquen().size());
        json.put("El numero de propietarios que hay en Kennedy es:", ownersResource.getKennedy().size());
        json.put("El numero de propietarios que hay en Engativa es:", ownersResource.getEngativa().size());

        return Response.ok()
                .entity(json)
                .build();
    }

}

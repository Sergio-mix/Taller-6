package co.edu.unbosque.taller_6.resources;

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
     * Metodo get
     * @return
     */
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response totalOwners() {
        ownersResource = new OwnersResource();
        ownersResource.list();

        String mensaje = "El numero de propietarios registrados es: "+ownersResource.getOwners().size()+"\n"+
                "El numero de propietarios que hay en Usaquen es:" + ownersResource.getUsaquen().size() + "\n"+
                "El numero de propietarios que hay en Kennedy es:" + ownersResource.getKennedy().size() + "\n"+
                "El numero de propietarios que hay en Engativa es:" + ownersResource.getEngativa().size() + "\n";
        ;

        return Response.ok()
                .entity(mensaje)
                .build();
    }

}

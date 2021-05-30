package co.edu.unbosque.taller_6.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/totalOwners")
public class TotalOwnersResource {
    private OwnersResource ownersResource;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response totalOwners() {
        ownersResource = new OwnersResource();
        ownersResource.list();
        String mensaje = "";
        for (int i = 0; i < ownersResource.getUsaquen().size(); i++) {
            if (ownersResource.getUsaquen().get(i).equals("Usaquen")) {
                mensaje = "El numero de propietarios que hay en Usaquen es:" + ownersResource.getUsaquen().size() + "\n";
            }
        }
        for (int i = 0; i < ownersResource.getKennedy().size(); i++) {
            if (ownersResource.getKennedy().get(i).equals("Kennedy")) {
                mensaje += "El numero de propietarios que hay en Kennedy es:" + ownersResource.getKennedy().size() + "\n";
            }
        }
        for (int i = 0; i < ownersResource.getEngativa().size(); i++) {
            if (ownersResource.getEngativa().get(i).equals("Engativa")) {
                mensaje = "El numero de propietarios que hay en Engativa es:" + ownersResource.getEngativa().size() + "\n";
            }
        }


        return Response.ok()
                .entity(mensaje)
                .build();
    }

}

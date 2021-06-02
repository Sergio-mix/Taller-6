package co.edu.unbosque.taller_6.resources;


import co.edu.unbosque.taller_6.resources.pojos.Visit;
import com.github.cliftonlabs.json_simple.JsonObject;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * Classs TotalVisitsVet
 */
@Path("/totalVisitsVet")
public class TotalVisitsVetResource {
    private VisitsResource visitsResource;
    private VetsResource vetsResource;

    /**
     * method to obtain the list of owners (get)
     *
     * @return
     */
    @GET
    @Path("/type")
    @Produces(MediaType.APPLICATION_JSON)
    public Response listPetsOwner() {
        visitsResource = new VisitsResource();
        visitsResource.list();
        JsonObject json = new JsonObject();

        json.put("El numero de visitas en total es", visitsResource.getVisits().size());
        json.put("El numero de visitas de tipo <Sterilization> Es", visitsResource.getSterilization().size());
        json.put("El numero de visitas de tipo <Microchip Implantation> Es", visitsResource.getMicrochipImplantation().size());
        json.put("El numero de visitas de tipo <Vaccination> Es", visitsResource.getVaccination().size());
        json.put("El numero de visitas de tipo <Deworming> Es", visitsResource.getDeworming().size());
        json.put("El numero de visitas de tipo <Urgency> Es", visitsResource.getUrgency().size());
        json.put("El numero de visitas de tipo <Control> Es", visitsResource.getControl().size());

        return Response.ok()
                .entity(json)
                .build();

    }

    @GET
    @Path("/vet")
    @Produces(MediaType.APPLICATION_JSON)
    public Response listPetsMicrochip() {
        vetsResource = new VetsResource();
        vetsResource.list();

        int contador1 = 1;
        int contador2 = 1;
        int contador3 = 1;

        JsonObject json = new JsonObject();
        for (int i = 0; i < vetsResource.getVets().size(); i++) {
            if (vetsResource.getVets().get(i).getVetId().equals(1)) {
                json.put("El numero de visitas que tuvo la veterinaria " + vetsResource.getVets().get(i).getName() + " Es", contador1++);
            }

            if (vetsResource.getVets().get(i).getVetId().equals(2)) {
                json.put("El numero de visitas que tuvo la veterinaria " + vetsResource.getVets().get(i).getName() + " Es", contador2++);

            }
            if (vetsResource.getVets().get(i).getVetId().equals(3)) {
                json.put("El numero de visitas que tuvo la veterinaria " + vetsResource.getVets().get(i).getName() + " Es", contador3++);

            }
        }
        return Response.ok()
                .entity(json)
                .build();
    }
}

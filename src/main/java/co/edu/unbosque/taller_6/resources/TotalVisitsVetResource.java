package co.edu.unbosque.taller_6.resources;


import co.edu.unbosque.taller_6.resources.pojos.Visit;

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
     * Metodo get type
     * @return
     */
    @GET
    @Path("/type")
    @Produces(MediaType.APPLICATION_JSON)
    public Response listPetsOwner() {
        visitsResource = new VisitsResource();
        visitsResource.list();

        String mensaje = "El numero de visitas en total es: " + visitsResource.getVisits().size() + "\n" +
                "El numero de visitas de tipo <Sterilization> Es: " + visitsResource.getSterilization().size() + "\n" +
                "El numero de visitas de tipo <Microchip Implantation> Es: " + visitsResource.getMicrochipImplantation().size() + "\n" +
                "El numero de visitas de tipo <Vaccination> Es: " + visitsResource.getVaccination().size() + "\n" +
                "El numero de visitas de tipo <Deworming> Es: " + visitsResource.getDeworming().size() + "\n" +
                "El numero de visitas de tipo <Urgency> Es: " + visitsResource.getUrgency().size() + "\n" +
                "El numero de visitas de tipo <Control> Es: " + visitsResource.getControl().size() + "\n";

        return Response.ok()
                .

                        entity(mensaje)
                .

                        build();

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

        String mensaje = "";
        for (int i = 0; i < vetsResource.getVets().size(); i++) {
            if (vetsResource.getVets().get(i).getVetId().equals(1)) {
                mensaje = "El numero de visitas que tuvo la veterinaria " + vetsResource.getVets().get(i).getName() + " Es:" + contador1++ + "\n";
            }
            if (vetsResource.getVets().get(i).getVetId().equals(2)) {
                mensaje += "El numero de visitas que tuvo la veterinaria " + vetsResource.getVets().get(i).getName() + " Es:" + contador2++ + "\n";

            }
            if (vetsResource.getVets().get(i).getVetId().equals(3)) {
                mensaje += "El numero de visitas que tuvo la veterinaria " + vetsResource.getVets().get(i).getName() + " Es:" + contador3++ + "\n";

            }
        }
        return Response.ok()
                .entity(mensaje)
                .build();
    }
}

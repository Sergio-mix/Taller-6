package co.edu.unbosque.taller_6.resources;


import co.edu.unbosque.taller_6.resources.pojos.Case;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * Class CasesResource
 */
@Path("/pets/{petId}/cases")
public class CasesResource {
    /**
     * Method to create case (post)
     *
     * @param petId Pet id
     * @param cases Type of case
     * @return response
     */
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response createCase(@PathParam("petId") Integer petId, Case cases) {

        Response result = null;

        String perdida = "PERDIDA";
        String robo = "ROBO";
        String fallecimiento = "FALLECIMIENTO";

        if (cases.getType().toUpperCase().equals(perdida) || cases.getType().toUpperCase().equals(robo) || cases.getType().toUpperCase().equals(fallecimiento)) {
            cases.setPetId(petId);
            cases.setCaseId(10);

            Response success = Response.status(Response.Status.CREATED)
                    .entity(cases)
                    .build();
            result = success;
        } else {
            Response fault = Response.status(Response.Status.BAD_REQUEST)
                    .entity(cases)
                    .build();
            result = fault;
        }

        return result;
    }
}

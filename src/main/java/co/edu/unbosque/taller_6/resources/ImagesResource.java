package co.edu.unbosque.taller_6.resources;

import co.edu.unbosque.taller_6.resources.pojos.Image;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * Class to create image point 3
 */
@Path("/pets/{petId}/images")
public class ImagesResource {
    /**
     * Create image
     * @param petId
     * @param photo
     * @return
     */
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response create(@PathParam("petId") Integer petId, Image photo) {

        return Response.status(Response.Status.CREATED)
                .entity(photo)
                .build();
    }



}

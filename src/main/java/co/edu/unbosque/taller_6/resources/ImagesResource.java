package co.edu.unbosque.taller_6.resources;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.ArrayList;
import java.util.List;

@Path("/images")
public class ImagesResource {
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response list() {

        List<Photography> photos = new ArrayList<Photography>();
        photos.add(new Photography(1, "pictures12121.jpg"));
        photos.add(new Photography(2,"pictures33.jpg"));
        return Response.ok()
                .entity(photos)
                .build();
    }
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response create(Photography photo) {
        photo.setPicture("photo2454.jpg");
        return Response.status(Response.Status.CREATED)
                .entity(photo)
                .build();
    }



}

package co.edu.unbosque.taller_6.resources;

import co.edu.unbosque.taller_6.resources.pojos.ListCasesType;
import co.edu.unbosque.taller_6.resources.pojos.NumberOfCases;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.ArrayList;
import java.util.List;

/**
 * Class Cases_TotalResource
 */
@Path("/Totalcases")
public class Cases_TotalResource {
    /**
     * Metodo Get point 11
     * @return
     */
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response listCases() {

        List<ListCasesType> listCases = new ArrayList<>();

        int perdida= 22;
        int robo= 12;
        int fallecimiento= 32;
        int totalRegistered=perdida+robo+fallecimiento;
        listCases.add(new ListCasesType(perdida, "PERDIDA"));
        listCases.add(new ListCasesType(robo, "ROBO"));
        listCases.add(new ListCasesType(fallecimiento, "FALLECIMIENTO"));
        NumberOfCases numberOfCases = new NumberOfCases(totalRegistered, listCases);


        return Response.ok()
                .entity(numberOfCases)
                .build();
    }


}

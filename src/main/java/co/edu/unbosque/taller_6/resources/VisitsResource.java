package co.edu.unbosque.taller_6.resources;

import co.edu.unbosque.taller_6.resources.pojos.TotalVisits;
import co.edu.unbosque.taller_6.resources.pojos.Vet;
import co.edu.unbosque.taller_6.resources.pojos.Visit;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.ArrayList;
import java.util.List;

/**
 * Class VisitsResource
 */
@Path("/visitVet")
public class VisitsResource {
    private int contador1 = 0;
    private int contador2 = 0;
    private int contador3 = 0;
    private int contador4 = 0;
    private int contador5 = 0;
    private int contador6 = 0;

    private Visit visit;
    private List<Visit> visits;
    private List<String> sterilization;
    private List<String> microchipImplantation;
    private List<String> vaccination;
    private List<String> deworming;
    private List<String> urgency;
    private List<String> control;
    private TotalVisits totalVisits;


    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response list() {
        visits = new ArrayList<>();
        sterilization = new ArrayList<>();
        microchipImplantation = new ArrayList<>();
        vaccination = new ArrayList<>();
        deworming = new ArrayList<>();
        urgency = new ArrayList<>();
        control = new ArrayList<>();
        visits = new ArrayList<>();

        visits.add(new Visit(1, "27/05/2020", "Sterilization", "Animal Grande", "Rositamel11", 1));
        visits.add(new Visit(2, "28/05/2020", "Sterilization", "Animal Grande", "Rositamel11", 1));
        visits.add(new Visit(3, "29/05/2020", "Microchip Implantation", "Animal Grande", "ArmandoCS22", 1));
        visits.add(new Visit(4, "30/05/2020", "Vaccination", "Animal Mediano", "ArmandoCS22", 2));
        visits.add(new Visit(5, "01/06/2020", "Deworming", "Animal Mediano", "CameloBto33", 2));
        visits.add(new Visit(6, "02/06/2020", "Urgency", "Animal Pequeño", "CameloBto33", 3));
        visits.add(new Visit(7, "06/07/2020", "Control", "Animal Pequeño", "CameloBto33", 3));

        for (Visit value : visits) {
            if (value.getType().equals("Sterilization")) {
                sterilization.add(value.getType());
                contador1++;
            }
            if (value.getType().equals("Microchip Implantation")) {
                microchipImplantation.add(value.getType());
                contador2++;
            }
            if (value.getType().equals("Vaccination")) {
                vaccination.add(value.getType());
                contador3++;
            }
            if (value.getType().equals("Deworming")) {
                deworming.add(value.getType());
                contador4++;
            }
            if (value.getType().equals("Urgency")) {
                urgency.add(value.getType());
                contador5++;
            }
            if (value.getType().equals("Control")) {
                control.add(value.getType());
                contador6++;
            }
        }

        totalVisits = new TotalVisits(sterilization, microchipImplantation, vaccination, deworming, urgency, control);

        return Response.ok()
                .entity(visits)
                .build();
    }

    @Path("/create")
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response createVisit(Visit visite) {
        visit = new Visit();
        visite.setVisitId(7);
        return Response.status(Response.Status.CREATED)
                .entity(visite)
                .build();
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response list2() {
        list();

        return Response.ok()
                .entity(visits)
                .build();
    }


    public List<Visit> getVisits() {
        return visits;
    }

    public void setVisits(List<Visit> visits) {
        this.visits = visits;
    }

    public List<String> getSterilization() {
        return sterilization;
    }

    public void setSterilization(List<String> sterilization) {
        this.sterilization = sterilization;
    }

    public List<String> getMicrochipImplantation() {
        return microchipImplantation;
    }

    public void setMicrochipImplantation(List<String> microchipImplantation) {
        this.microchipImplantation = microchipImplantation;
    }

    public List<String> getVaccination() {
        return vaccination;
    }

    public void setVaccination(List<String> vaccination) {
        this.vaccination = vaccination;
    }

    public List<String> getDeworming() {
        return deworming;
    }

    public void setDeworming(List<String> deworming) {
        this.deworming = deworming;
    }

    public List<String> getUrgency() {
        return urgency;
    }

    public void setUrgency(List<String> urgency) {
        this.urgency = urgency;
    }

    public List<String> getControl() {
        return control;
    }

    public void setControl(List<String> control) {
        this.control = control;
    }
}

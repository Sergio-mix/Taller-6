package co.edu.unbosque.taller_6.resources.pojos;

import co.edu.unbosque.taller_6.resources.OwnersResource;
import co.edu.unbosque.taller_6.resources.VetsResource;
import co.edu.unbosque.taller_6.resources.VisitsResource;

import javax.sound.midi.Soundbank;
import java.util.List;

/**
 * Class Visit
 */
public class Visit {
    private Integer visitId;
    private String created_at;
    private String type;
    private String description;
    private String vetUsername;
    private Integer petId;
    private Integer microchip;

    private VisitsResource visitsResource;
    private VetsResource vetResource;

    /**
     * Constructor
     */
    public Visit() {
    }

    /**
     * Constructor
     * @param visitId
     * @param created_at
     * @param type
     * @param description
     * @param vetUsername
     * @param petId
     */
    public Visit(Integer visitId, String created_at, String type, String description, String vetUsername, Integer petId) {
        this.visitId = visitId;
        this.created_at = created_at;
        this.type = type;
        this.description = description;
        this.vetUsername = vetUsername;
        this.petId = petId;
    }

    /**
     *
     * @param visitId
     * @param created_at
     * @param type
     * @param description
     * @param vetUsername
     * @param petId
     * @param microchip
     */
    public Visit(Integer visitId, String created_at, String type, String description, String vetUsername, Integer petId, Integer microchip) {
        this.visitId = visitId;
        this.created_at = created_at;
        this.type = type;
        this.description = description;
        this.vetUsername = vetUsername;
        this.petId = petId;
        this.microchip = microchip;
    }

    /**
     *
     * @return
     */
    public Integer getVisitId() {
        return visitId;
    }

    /**
     *
     * @param visitId
     */
    public void setVisitId(Integer visitId) {
        this.visitId = visitId;
    }

    /**
     *
     * @return
     */
    public String getCreated_at() {
        return created_at;
    }

    /**
     *
     * @param created_at
     */
    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }

    /**
     *
     * @return
     */
    public String getType() {
        return type;
    }

    /**
     *
     * @param type
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     *
     * @return
     */
    public String getDescription() {
        return description;
    }

    /**
     *
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     *
     * @return
     */
    public String getVetUsername() {
        return vetUsername;
    }

    /**
     *
     * @param vetUsername
     */
    public void setVetUsername(String vetUsername) {
        this.vetUsername = vetUsername;
    }

    /**
     *
     * @return
     */
    public Integer getPetId() {
        return petId;
    }

    /**
     *
     * @param petId
     */
    public void setPetId(Integer petId) {
        this.petId = petId;
    }

    /**
     *
     * @return
     */
    public Integer getMicrochip() {
        return microchip;
    }

    /**
     *
     * @param microchip
     */
    public void setMicrochip(Integer microchip) {
        this.microchip = microchip;
    }

    /**
     * Method to search by type
     * @param type
     * @return
     */
    public String searchType(String type) {

        visitsResource = new VisitsResource();
        visitsResource.list();
        String mensaje="";
        int contador =0;
        for (int i=0; i<visitsResource.getVisits().size();i++){
            if(type.equals(visitsResource.getVisits().get(i).type)){
                contador++;
                mensaje="El numero de visitas para el tipo de "+ visitsResource.getVisits().get(i).getType()+"Es: ";
            }
        }
        return mensaje +contador;

    }
//        visitsResource = new VisitsResource();
//        visitsResource.list();
//        int contador1 = 0, contador2 = 0, contador3 = 0, contador4 = 0, contador5 = 0, contador6 = 0;
//
//        for (int i = 0; i < visitsResource.getSterilization().size(); i++) {
//            if (visitsResource.getSterilization().get(i).equals(type)) {
//                contador1++;
//            }
//        }
//        for (int i = 0; i < visitsResource.getMicrochipImplantation().size(); i++) {
//            if (visitsResource.getMicrochipImplantation().get(i).equals(type)) {
//                contador2++;
//            }
//        }
//        for (int i = 0; i < visitsResource.getVaccination().size(); i++) {
//            if (visitsResource.getVaccination().get(i).equals(type)) {
//                contador3++;
//            }
//        }
//        for (int i = 0; i < visitsResource.getUrgency().size(); i++) {
//            if (visitsResource.getUrgency().get(i).equals(type)) {
//                contador4++;
//            }
//        }
//        for (int i = 0; i <visitsResource.getDeworming().size(); i++) {
//            if (visitsResource.getDeworming().get(i).equals(type)) {
//                contador5++;
//            }
//        }
//        for (int i = 0; i < visitsResource.getControl().size(); i++) {
//            if (visitsResource.getControl().get(i).equals(type)) {
//                contador6++;
//            }
//        }
//
//    String mensaje;
//        switch(type)
//
//    {
//        case "Sterilization": {
//            mensaje = "The number of sterilization-type visits is: " + contador1;
//            break;
//        }
//        case "MicrochipImplantation": {
//            mensaje = "The number of Microchip Implantation-type visits is: " + contador2;
//            break;
//        }
//        case "Vaccination": {
//            mensaje = "The number of Vaccination-type visits is: " + contador3;
//            break;
//        }
//        case "Deworming": {
//            mensaje = "The number of Deworming-type visits is: " + contador4;
//            break;
//        }
//        case "Urgency": {
//            mensaje = "The number of Urgency-type visits is: " + contador5;
//            break;
//        }
//        case "Control": {
//            mensaje = "The number of Control-type visits is: " + contador6;
//            break;
//        }
//        default: {
//            mensaje = "No existe ese tipo de consulta";
//            break;
//        }
//    }
//
//        return mensaje;
//}

    /**
     * Method for the number of visits according to id
     * @param vetId
     * @return
     */
    public String idVet(Integer vetId){
    vetResource = new VetsResource();
    vetResource.list();
    String mensaje="";
    int contador =0;
    for (int i=0; i<vetResource.getVets().size();i++){
        if(vetId.equals(vetResource.getVets().get(i).getVetId())){
            contador++;
           mensaje="El numero de visitas para la veterinaria: "+ vetResource.getVets().get(i).getName()+"Es: ";
        }
    }
    return mensaje +contador;

}

}

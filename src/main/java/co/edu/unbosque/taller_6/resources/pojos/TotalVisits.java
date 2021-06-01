package co.edu.unbosque.taller_6.resources.pojos;

import java.util.List;

public class TotalVisits {
    private List<String> sterilization;
    private List<String> microchipImplantation;
    private List<String> vaccination;
    private List<String> deworming;
    private List<String> urgency;
    private List<String> control;

    public TotalVisits(List<String> sterilization, List<String> microchipImplantation, List<String> vaccination, List<String> deworming, List<String> urgency, List<String> control) {
        this.sterilization = sterilization;
        this.microchipImplantation = microchipImplantation;
        this.vaccination = vaccination;
        this.deworming = deworming;
        this.urgency = urgency;
        this.control = control;
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

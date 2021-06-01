package co.edu.unbosque.taller_6.resources.pojos;

import java.util.List;

/**
 * Class TotalVisits
 */
public class TotalVisits {
    private List<String> sterilization;
    private List<String> microchipImplantation;
    private List<String> vaccination;
    private List<String> deworming;
    private List<String> urgency;
    private List<String> control;

    /**
     * Constructor
     * @param sterilization
     * @param microchipImplantation
     * @param vaccination
     * @param deworming
     * @param urgency
     * @param control
     */
    public TotalVisits(List<String> sterilization, List<String> microchipImplantation, List<String> vaccination, List<String> deworming, List<String> urgency, List<String> control) {
        this.sterilization = sterilization;
        this.microchipImplantation = microchipImplantation;
        this.vaccination = vaccination;
        this.deworming = deworming;
        this.urgency = urgency;
        this.control = control;
    }

    /**
     *
     * @return
     */
    public List<String> getSterilization() {
        return sterilization;
    }

    /**
     *
     * @param sterilization
     */
    public void setSterilization(List<String> sterilization) {
        this.sterilization = sterilization;
    }

    /**
     *
     * @return
     */
    public List<String> getMicrochipImplantation() {
        return microchipImplantation;
    }

    /**
     *
     * @param microchipImplantation
     */
    public void setMicrochipImplantation(List<String> microchipImplantation) {
        this.microchipImplantation = microchipImplantation;
    }

    /**
     *
     * @return
     */
    public List<String> getVaccination() {
        return vaccination;
    }

    /**
     *
     * @param vaccination
     */
    public void setVaccination(List<String> vaccination) {
        this.vaccination = vaccination;
    }

    /**
     *
     * @return
     */
    public List<String> getDeworming() {
        return deworming;
    }

    /**
     *
     * @param deworming
     */
    public void setDeworming(List<String> deworming) {
        this.deworming = deworming;
    }

    /**
     *
     * @return
     */
    public List<String> getUrgency() {
        return urgency;
    }

    /**
     *
     * @param urgency
     */
    public void setUrgency(List<String> urgency) {
        this.urgency = urgency;
    }

    /**
     *
     * @return
     */
    public List<String> getControl() {
        return control;
    }

    /**
     *
     * @param control
     */
    public void setControl(List<String> control) {
        this.control = control;
    }
}

package co.edu.unbosque.taller_6.resources.pojos;

/**
 * Class Case
 */
public class Case {
    private Integer caseId;
    private String created_at;
    private String type;
    private String description;
    private Integer petId;

    /**
     * Constructor
     */
    public Case() {

    }

    /**
     * Constructor
     *
     * @param caseId
     * @param created_at
     * @param type
     * @param description
     * @param petId
     */
    public Case(Integer caseId, String created_at, String type, String description, Integer petId) {
        this.caseId = caseId;
        this.created_at = created_at;
        this.type = type;
        this.description = description;
        this.petId = petId;
    }

    /**
     * @return
     */
    public Integer getCaseId() {
        return caseId;
    }

    /**
     * @param caseId
     */
    public void setCaseId(Integer caseId) {
        this.caseId = caseId;
    }

    /**
     * @return
     */
    public String getCreated_at() {
        return created_at;
    }

    /**
     * @param created_at
     */
    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }

    /**
     * @return
     */
    public String getType() {
        return type;
    }

    /**
     * @param type
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * @return
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return
     */
    public Integer getPetId() {
        return petId;
    }

    /**
     * @param petId
     */
    public void setPetId(Integer petId) {
        this.petId = petId;
    }
}

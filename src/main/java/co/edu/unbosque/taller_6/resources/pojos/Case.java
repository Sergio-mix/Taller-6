package co.edu.unbosque.taller_6.resources.pojos;

public class Case {
    private Integer caseId;
    private String created_at;
    private String type;
    private String description;
    private Integer petId;

    public Case(Integer caseId, String created_at, String type, String description, Integer petId) {
        this.caseId = caseId;
        this.created_at = created_at;
        this.type = type;
        this.description = description;
        this.petId = petId;
    }

    public Integer getCaseId() {
        return caseId;
    }

    public void setCaseId(Integer caseId) {
        this.caseId = caseId;
    }

    public String getCreated_at() {
        return created_at;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getPetId() {
        return petId;
    }

    public void setPetId(Integer petId) {
        this.petId = petId;
    }
}

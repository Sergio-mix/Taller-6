package co.edu.unbosque.taller_6.resources.pojos;

public class Visit {
    private Integer visitId;
    private String created_at;
    private String type;
    private String description;
    private Integer vetId;
    private Integer petId;

    public Visit(Integer visitId, String created_at, String type, String description, Integer vetId, Integer petId) {
        this.visitId = visitId;
        this.created_at = created_at;
        this.type = type;
        this.description = description;
        this.vetId = vetId;
        this.petId = petId;
    }

    public Integer getVisitId() {
        return visitId;
    }

    public void setVisitId(Integer visitId) {
        this.visitId = visitId;
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

    public Integer getVetId() {
        return vetId;
    }

    public void setVetId(Integer vetId) {
        this.vetId = vetId;
    }

    public Integer getPetId() {
        return petId;
    }

    public void setPetId(Integer petId) {
        this.petId = petId;
    }
}

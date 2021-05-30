package co.edu.unbosque.taller_6.resources.pojos;

public class ListCasesType {
    private  Integer registered;
    private String discriminated_by_type;


    public ListCasesType() {

    }

    public ListCasesType(Integer registered, String discriminated_by_type) {
        this.registered = registered;
        this.discriminated_by_type = discriminated_by_type;
    }

    public Integer getRegistered() {
        return registered;
    }

    public void setRegistered(Integer registered) {
        this.registered = registered;
    }

    public String getDiscriminated_by_type() {
        return discriminated_by_type;
    }

    public void setDiscriminated_by_type(String discriminated_by_type) {
        this.discriminated_by_type = discriminated_by_type;
    }
}

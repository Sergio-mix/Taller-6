package co.edu.unbosque.taller_6.resources.pojos;

/**
 * Class ListCasesType
 */
public class ListCasesType {
    private Integer registered;
    private String discriminated_by_type;

    /**
     * Constructor
     */
    public ListCasesType() {

    }

    /**
     * Constructor
     *
     * @param registered
     * @param discriminated_by_type
     */
    public ListCasesType(Integer registered, String discriminated_by_type) {
        this.registered = registered;
        this.discriminated_by_type = discriminated_by_type;
    }

    /**
     * @return
     */
    public Integer getRegistered() {
        return registered;
    }

    /**
     * @param registered
     */
    public void setRegistered(Integer registered) {
        this.registered = registered;
    }

    /**
     * @return
     */
    public String getDiscriminated_by_type() {
        return discriminated_by_type;
    }

    /**
     * @param discriminated_by_type
     */
    public void setDiscriminated_by_type(String discriminated_by_type) {
        this.discriminated_by_type = discriminated_by_type;
    }
}

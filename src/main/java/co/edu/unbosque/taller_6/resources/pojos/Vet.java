package co.edu.unbosque.taller_6.resources.pojos;

/**
 * Class vet
 */
public class Vet {

    private String username;
    private String name;
    private String address;
    private String neighborhood;
    private Integer vetId;

    /**
     * Constructor
     */
    public Vet(){}

    /**
     * Constructor
     * @param vetId
     * @param username
     * @param name
     * @param address
     * @param neighborhood
     */
    public Vet(Integer vetId,String username, String name, String address, String neighborhood) {
        this.username = username;
        this.name = name;
        this.address = address;
        this.neighborhood = neighborhood;
        this.vetId=vetId;
    }

    /**
     *
     * @return
     */
    public String getUsername() {
        return username;
    }

    /**
     *
     * @param username
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     *
     * @return
     */
    public String getAddress() {
        return address;
    }

    /**
     *
     * @param address
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     *
     * @return
     */
    public String getNeighborhood() {
        return neighborhood;
    }

    /**
     *
     * @param neighborhood
     */
    public void setNeighborhood(String neighborhood) {
        this.neighborhood = neighborhood;
    }

    /**
     *
     * @return
     */
    public Integer getVetId() {
        return vetId;
    }

    /**
     *
     * @param vetId
     */
    public void setVetId(Integer vetId) {
        this.vetId = vetId;
    }
}

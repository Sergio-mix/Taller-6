package resources.pojos;

public class Owner {
    private String userName;
    private Integer personId;
    private String name;
    private String address;
    private String neighborhood;

    public Owner() {
    }
    public Owner(String userName,Integer personId, String name, String address, String neighborhood){
        this.userName= userName;
        this.personId= personId;
        this.name= name;
        this.address= address;
        this.neighborhood= neighborhood;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Integer getPersonId() {
        return personId;
    }

    public void setPersonId(Integer personId) {
        this.personId = personId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getNeighborhood() {
        return neighborhood;
    }

    public void setNeighborhood(String neighborhood) {
        this.neighborhood = neighborhood;
    }
}

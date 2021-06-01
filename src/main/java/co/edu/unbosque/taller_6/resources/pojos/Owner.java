package co.edu.unbosque.taller_6.resources.pojos;

import co.edu.unbosque.taller_6.resources.OwnersResource;
import co.edu.unbosque.taller_6.resources.PetsResource;

import java.util.ArrayList;
import java.util.List;

/**
 * Class Owner
 */
public class Owner {
    private String userName;
    private Integer personId;
    private String name;
    private String address;
    private String neighborhood;
    private List<Pet> listPets = new ArrayList<>();
    private OwnersResource ownersResource;
    private PetsResource petsResource;

    /**
     * Constructor
     */
    public Owner() {
    }

    /**
     * Constructor
     * @param userName
     * @param personId
     * @param name
     * @param address
     * @param neighborhood
     */
    public Owner(String userName, Integer personId, String name, String address, String neighborhood) {
        this.userName = userName;
        this.personId = personId;
        this.name = name;
        this.address = address;
        this.neighborhood = neighborhood;
    }

    /**
     *
     * @return
     */
    public String getUserName() {
        return userName;
    }

    /**
     *
     * @param userName
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     *
     * @return
     */
    public Integer getPersonId() {
        return personId;
    }

    /**
     *
     * @param personId
     */
    public void setPersonId(Integer personId) {
        this.personId = personId;
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
    public List<Pet> getListPets() {
        return listPets;
    }

    /**
     *
     * @param listPets
     */
    public void setListPets(List<Pet> listPets) {
        this.listPets = listPets;
    }

    /**
     *
     * @param pets
     */
    public void addPet(List<Pet> pets) {
        listPets = pets;
    }

    /**
     * method to search for a person with their id
     * @param personId
     * @return
     */
    public String searchPersonId(Integer personId) {
        ownersResource = new OwnersResource();
        ownersResource.list();
        String mensaje = "";
        System.out.println(listPets.get(0).getOwnerId());
        System.out.println(personId);
        for (int i = 0; i < listPets.size(); i++) {
            if (listPets.get(i).getOwnerId().equals(personId)) {
                mensaje += "Propietario: " + ownersResource.getOwners().get(i).getName() + " " + "Pet ID: " + listPets.get(i).getPetId() + " " + "Microchip: " + listPets.get(i).getMicroChip() + " " + "Name: " + listPets.get(i).getName() + " " + "Species: " + listPets.get(i).getSpecies() + " " + "Race: " +
                        listPets.get(i).getRace() + " " + "Size: " + listPets.get(i).getSize() + " " + "Sex: " + listPets.get(i).getSex() + " " + "Picture: " + listPets.get(i).getPicture() + " " + "Owner ID: " + listPets.get(i).getOwnerId() + "\n";
            }
        }
        return mensaje;
    }

    /**
     * method to search for a pet by its microchip
     * @param microchip
     * @return
     */
    public String searchPetMicrochip(Integer microchip) {
        petsResource = new PetsResource();
        ownersResource= new OwnersResource();
        petsResource.list();
        ownersResource.list();

        String mensaje = "";
        for (int i = 0; i < listPets.size(); i++) {
            if (listPets.get(i).getMicroChip().equals(microchip)) {
                mensaje +="Mascota: "+listPets.get(i).getName()+"Propietario: "+ownersResource.getOwners().get(i).getName()+ "User name: " + ownersResource.getOwners().get(i).getUserName() + " " + "Person Id: " + ownersResource.getOwners().get(i).getPersonId() +" " + "Address: " + ownersResource.getOwners().get(i).getAddress() + " " + "Neighborhood: " +
                        ownersResource.getOwners().get(i).getNeighborhood()  + "\n" ;
            }
        }
        return mensaje;
    }
}
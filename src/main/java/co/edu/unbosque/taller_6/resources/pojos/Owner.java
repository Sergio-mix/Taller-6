package co.edu.unbosque.taller_6.resources.pojos;

import co.edu.unbosque.taller_6.resources.OwnersResource;
import co.edu.unbosque.taller_6.resources.PetsResource;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

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
     *
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
     * @return
     */
    public String getUserName() {
        return userName;
    }

    /**
     * @param userName
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * @return
     */
    public Integer getPersonId() {
        return personId;
    }

    /**
     * @param personId
     */
    public void setPersonId(Integer personId) {
        this.personId = personId;
    }

    /**
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * @return
     */
    public String getNeighborhood() {
        return neighborhood;
    }

    /**
     * @param neighborhood
     */
    public void setNeighborhood(String neighborhood) {
        this.neighborhood = neighborhood;
    }

    /**
     * @return
     */
    public List<Pet> getListPets() {
        return listPets;
    }

    /**
     * @param listPets
     */
    public void setListPets(List<Pet> listPets) {
        this.listPets = listPets;
    }

    /**
     * @param pets
     */
    public void addPet(List<Pet> pets) {
        listPets = pets;
    }

    /**
     * method to search for a person with their id
     *
     * @param personId personId
     * @return map with pet data
     */
    public Map searchPersonId(Integer personId) {
        ownersResource = new OwnersResource();
        ownersResource.list();

        Map m1 = new LinkedHashMap();
        for (int i = 0; i < listPets.size(); i++) {
            if (listPets.get(i).getOwnerId().equals(personId)) {
                m1.put("Propietario", ownersResource.getOwners().get(i).getName());
                m1.put("Pet ID", listPets.get(i).getPetId());
                m1.put("Microchip", listPets.get(i).getMicroChip());
                m1.put("Name", listPets.get(i).getName());
                m1.put("Species", listPets.get(i).getSpecies());
                m1.put("Race", listPets.get(i).getRace());
                m1.put("Size", listPets.get(i).getSize());
                m1.put("Sex", listPets.get(i).getSex());
                m1.put("Picture", listPets.get(i).getPicture());
                m1.put("Owner ID", listPets.get(i).getOwnerId());
            }
        }
        return m1;
    }

    /**
     * method to search for a pet by its microchip
     *
     * @param microchip pet microchip
     * @return map with owner data
     */
    public Map searchPetMicrochip(Integer microchip) {
        petsResource = new PetsResource();
        ownersResource = new OwnersResource();
        petsResource.list();
        ownersResource.list();

        Map m1 = new LinkedHashMap();

        for (int i = 0; i < listPets.size(); i++) {
            if (listPets.get(i).getMicroChip().equals(microchip)) {
                m1.put("Mascota", listPets.get(i).getName());
                m1.put("Propietario", ownersResource.getOwners().get(i).getName());
                m1.put("User name", ownersResource.getOwners().get(i).getUserName());
                m1.put("Person Id", ownersResource.getOwners().get(i).getPersonId());
                m1.put("Address", ownersResource.getOwners().get(i).getAddress());
                m1.put("Neighborhood", ownersResource.getOwners().get(i).getNeighborhood());
            }
        }
        return m1;
    }
}
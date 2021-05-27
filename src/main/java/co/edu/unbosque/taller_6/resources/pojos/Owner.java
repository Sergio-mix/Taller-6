package co.edu.unbosque.taller_6.resources.pojos;

import co.edu.unbosque.taller_6.resources.OwnersResource;
import co.edu.unbosque.taller_6.resources.PetsResource;

import java.util.ArrayList;
import java.util.List;

public class Owner {
    private String userName;
    private Integer personId;
    private String name;
    private String address;
    private String neighborhood;
    private List<Pet> listPets = new ArrayList<>();
    private OwnersResource ownersResource;
    private PetsResource petsResource;


    public Owner() {
    }

    public Owner(String userName, Integer personId, String name, String address, String neighborhood) {
        this.userName = userName;
        this.personId = personId;
        this.name = name;
        this.address = address;
        this.neighborhood = neighborhood;
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

    public List<Pet> getListPets() {
        return listPets;
    }

    public void setListPets(List<Pet> listPets) {
        this.listPets = listPets;
    }

    public void addPet(List<Pet> pets) {
        listPets = pets;
    }

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
}
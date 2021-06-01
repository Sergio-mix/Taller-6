package co.edu.unbosque.taller_6.resources.pojos;

/**
 * CLASS PET
 */
public class Pet {
    private Integer petId;
    private Integer microChip;
    private String name;
    private String species;
    private String race;
    private String size;
    private String sex;
    private String picture;
    private Integer ownerId;

    /**
     * Constructor
     */
    public Pet (){}

    /**
     * Constructor
     * @param petId
     * @param microChip
     * @param name
     * @param species
     * @param race
     * @param size
     * @param sex
     * @param picture
     * @param ownerId
     */
    public Pet(Integer petId, Integer microChip, String name, String species, String race, String size, String sex, String picture, Integer ownerId) {
        this.petId = petId;
        this.microChip = microChip;
        this.name = name;
        this.species = species;
        this.race = race;
        this.size = size;
        this.sex = sex;
        this.picture = picture;
        this.ownerId = ownerId;
    }

    /**
     *
     * @return
     */
    public Integer getPetId() {
        return petId;
    }

    /**
     *
     * @param petId
     */
    public void setPetId(Integer petId) {
        this.petId = petId;
    }

    /**
     *
     * @return
     */
    public Integer getMicroChip() {
        return microChip;
    }

    /**
     *
     * @param microChip
     */
    public void setMicroChip(Integer microChip) {
        this.microChip = microChip;
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
    public String getSpecies() {
        return species;
    }

    /**
     *
     * @param species
     */
    public void setSpecies(String species) {
        this.species = species;
    }

    /**
     *
     * @return
     */
    public String getRace() {
        return race;
    }

    /**
     *
     * @param race
     */
    public void setRace(String race) {
        this.race = race;
    }

    /**
     *
     * @return
     */
    public String getSize() {
        return size;
    }

    /**
     *
     * @param size
     */
    public void setSize(String size) {
        this.size = size;
    }

    /**
     *
     * @return
     */
    public String getSex() {
        return sex;
    }

    /**
     *
     * @param sex
     */
    public void setSex(String sex) {
        this.sex = sex;
    }

    /**
     *
     * @return
     */
    public String getPicture() {
        return picture;
    }

    /**
     *
     * @param picture
     */
    public void setPicture(String picture) {
        this.picture = picture;
    }

    /**
     *
     * @return
     */
    public Integer getOwnerId() {
        return ownerId;
    }

    /**
     *
     * @param ownerId
     */
    public void setOwnerId(Integer ownerId) {
        this.ownerId = ownerId;
    }
}

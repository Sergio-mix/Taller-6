package co.edu.unbosque.taller_6.resources.pojos;

import java.io.File;

/**
 * Class Image
 */
public class Image {


    private Integer petId;
    private String image;
    private String description;

    /**
     * Constructor
     */
    public Image() {

    }

    /**
     * Constructor
     * @param petId
     * @param image
     * @param description
     */
    public Image(Integer petId, String image, String description) {
        this.petId = petId;
        this.image = image;
        this.description = description;
    }

    /**
     *
     * @return
     */
    public String getImage() {
        return image;
    }

    /**
     *
     * @param image
     */
    public void setImage(String image) {
        this.image = image;
    }

    /**
     *
     * @return
     */
    public String getDescription() {
        return description;
    }

    /**
     *
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
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
}

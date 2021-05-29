package co.edu.unbosque.taller_6.resources.pojos;

import java.io.File;

public class Image {


    private Integer petId;
    private String image;
    private String description;


    public Image() {

    }

    public Image(Integer petId, String image, String description) {
        this.petId = petId;
        this.image = image;
        this.description = description;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getPetId() {
        return petId;
    }

    public void setPetId(Integer petId) {
        this.petId = petId;
    }
}

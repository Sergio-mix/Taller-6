package resources.pojos;

import javax.swing.*;
import java.awt.*;

public class Photography {

    private Integer petId;
    private String picture;


    public Photography(Integer petId, String picture) {
        this.petId = petId;
        this.picture = picture;
    }

    public Integer getPetId() {
        return petId;
    }

    public void setPetId(Integer petId) {
        this.petId = petId;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }
}

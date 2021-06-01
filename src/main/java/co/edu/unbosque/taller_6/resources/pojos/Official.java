package co.edu.unbosque.taller_6.resources.pojos;

/**
 * Class official
 */
public class Official {
    private String username;
    private String name;

    /**
     *
     * @param username
     * @param name
     */
    public Official(String username, String name) {
        this.username = username;
        this.name = name;
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
}

package co.edu.unbosque.taller_6.resources;

import co.edu.unbosque.taller_6.resources.pojos.Owner;
import co.edu.unbosque.taller_6.resources.pojos.Pet;
import com.github.cliftonlabs.json_simple.JsonObject;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Class ListPetsWithOwners
 */
@Path("/listPetsWithOwners")
public class PetsWithOwnersResource {
    private OwnersResource ownersResource = new OwnersResource();
    private PetsResource petsResource = new PetsResource();
    private Owner owner = new Owner();

    /**
     * method to get the pet list (get)
     *
     * @return json with pets
     */
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response listPets() {
        ownersResource.list();
        petsResource.list();
        owner.setListPets(petsResource.getPets());
        JsonObject json = new JsonObject();

        for (int i = 0; i < petsResource.getPets().size(); i++) {
            Map m1 = new LinkedHashMap();

            m1.put("Mascota", petsResource.getPets().get(i).getName());
            m1.put("User name", ownersResource.getOwners().get(i).getUserName());
            m1.put("Person Id", ownersResource.getOwners().get(i).getPersonId());
            m1.put("Name", ownersResource.getOwners().get(i).getName());
            m1.put("Address", ownersResource.getOwners().get(i).getAddress());
            m1.put("Neighborhood", ownersResource.getOwners().get(i).getNeighborhood());
            json.put("listPets-" + i, m1);
        }

        return Response.ok()
                .entity(json)
                .build();
    }

    /**
     * microchip search method (get)
     *
     * @param microchip pet microchip
     * @return json with pet owner parameters
     */
    @GET
    @Path("/microchip")
    @Produces(MediaType.APPLICATION_JSON)
    public Response listPetsMicrochip(@QueryParam("microchip") Integer microchip) {
        ownersResource.list();
        petsResource.list();
        owner.setListPets(petsResource.getPets());
        JsonObject json = new JsonObject();

        if (microchip != null && microchip > 0) {
            json.put(microchip.toString(), owner.searchPetMicrochip(microchip));
        }
        return Response.ok()
                .entity(json)
                .build();
    }

    /**
     * namePet search method (get)
     *
     * @param namePet namePet
     * @return json with pet owner parameters
     */
    @GET
    @Path("/namePet")
    @Produces(MediaType.APPLICATION_JSON)
    public Response listPetsNamePet(@QueryParam("namePet") String namePet) {
        ownersResource.list();
        petsResource.list();
        owner.setListPets(petsResource.getPets());
        int aux = 0;
        JsonObject json = new JsonObject();
        for (int i = 0; i < owner.getListPets().size(); i++) {
            if (owner.getListPets().get(i).getName().equals(namePet)) {
                Map m1 = new LinkedHashMap();

                m1.put("User name", ownersResource.getOwners().get(i).getUserName());
                m1.put("Person Id", ownersResource.getOwners().get(i).getPersonId());
                m1.put("Name", ownersResource.getOwners().get(i).getName());
                m1.put("Address", ownersResource.getOwners().get(i).getAddress());
                m1.put("Neighborhood", ownersResource.getOwners().get(i).getNeighborhood());
                json.put(namePet + "-" + (aux += 1), m1);
            }
        }
        return Response.ok()
                .entity(json)
                .build();
    }

    /**
     * species search method (get)
     *
     * @param species species
     * @return json with pet owner parameters
     */
    @GET
    @Path("/species")
    @Produces(MediaType.APPLICATION_JSON)
    public Response listPetsSpecie(@QueryParam("species") String species) {
        ownersResource.list();
        petsResource.list();
        owner.setListPets(petsResource.getPets());
        int aux = 0;
        JsonObject json = new JsonObject();
        for (int i = 0; i < owner.getListPets().size(); i++) {
            if (owner.getListPets().get(i).getSpecies().equals(species)) {
                Map m1 = new LinkedHashMap();

                m1.put("Mascota", owner.getListPets().get(i).getName());
                m1.put("User name", ownersResource.getOwners().get(i).getUserName());
                m1.put("Person Id", ownersResource.getOwners().get(i).getPersonId());
                m1.put("Name", ownersResource.getOwners().get(i).getName());
                m1.put("Address", ownersResource.getOwners().get(i).getAddress());
                m1.put("Neighborhood", ownersResource.getOwners().get(i).getNeighborhood());
                json.put(species + "-" + (aux += 1), m1);
            }
        }

        return Response.ok()
                .entity(json)
                .build();
    }

    /**
     * race search method (get)
     *
     * @param race race
     * @return json with pet owner parameters
     */
    @GET
    @Path("/race")
    @Produces(MediaType.APPLICATION_JSON)
    public Response listPetsRace(@QueryParam("race") String race) {
        ownersResource.list();
        petsResource.list();
        owner.setListPets(petsResource.getPets());
        int aux = 0;
        JsonObject json = new JsonObject();
        for (int i = 0; i < owner.getListPets().size(); i++) {
            if (owner.getListPets().get(i).getRace().equals(race)) {
                Map m1 = new LinkedHashMap();

                m1.put("Mascota", owner.getListPets().get(i).getName());
                m1.put("User name", ownersResource.getOwners().get(i).getUserName());
                m1.put("Person Id", ownersResource.getOwners().get(i).getPersonId());
                m1.put("Name", ownersResource.getOwners().get(i).getName());
                m1.put("Address", ownersResource.getOwners().get(i).getAddress());
                m1.put("Neighborhood", ownersResource.getOwners().get(i).getNeighborhood());
                json.put(race + "-" + (aux += 1), m1);
            }
        }
        return Response.ok()
                .entity(json)
                .build();
    }

    /**
     * size search method (get)
     *
     * @param size size
     * @return json with pet owner parameters
     */
    @GET
    @Path("/size")
    @Produces(MediaType.APPLICATION_JSON)
    public Response listPetsSize(@QueryParam("size") String size) {
        ownersResource.list();
        petsResource.list();
        owner.setListPets(petsResource.getPets());
        int aux = 0;
        JsonObject json = new JsonObject();
        for (int i = 0; i < owner.getListPets().size(); i++) {
            if (owner.getListPets().get(i).getSize().equals(size)) {

                Map m1 = new LinkedHashMap();

                m1.put("Mascota", owner.getListPets().get(i).getName());
                m1.put("User name", ownersResource.getOwners().get(i).getUserName());
                m1.put("Person Id", ownersResource.getOwners().get(i).getPersonId());
                m1.put("Name", ownersResource.getOwners().get(i).getName());
                m1.put("Address", ownersResource.getOwners().get(i).getAddress());
                m1.put("Neighborhood", ownersResource.getOwners().get(i).getNeighborhood());
                json.put(size + "-" + (aux += 1), m1);
            }
        }
        return Response.ok()
                .entity(json)
                .build();
    }

    /**
     * size search method (get)
     *
     * @param sex sex
     * @return json with pet owner parameters
     */
    @GET
    @Path("/sex")
    @Produces(MediaType.APPLICATION_JSON)
    public Response listPetsSex(@QueryParam("sex") String sex) {
        ownersResource.list();
        petsResource.list();
        owner.setListPets(petsResource.getPets());
        int aux = 0;
        JsonObject json = new JsonObject();
        for (int i = 0; i < owner.getListPets().size(); i++) {
            if (owner.getListPets().get(i).getSex().equals(sex)) {
                Map m1 = new LinkedHashMap();

                m1.put("Mascota", owner.getListPets().get(i).getName());
                m1.put("User name", ownersResource.getOwners().get(i).getUserName());
                m1.put("Person Id", ownersResource.getOwners().get(i).getPersonId());
                m1.put("Name", ownersResource.getOwners().get(i).getName());
                m1.put("Address", ownersResource.getOwners().get(i).getAddress());
                m1.put("Neighborhood", ownersResource.getOwners().get(i).getNeighborhood());
                json.put(sex + "-" + (aux += 1), m1);
            }
        }
        return Response.ok()
                .entity(json)
                .build();
    }
}

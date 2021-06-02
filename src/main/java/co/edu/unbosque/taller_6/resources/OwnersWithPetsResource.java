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
 * Class Owner Whit Pets Resource
 */
@Path("/listOwnersWithPets")
public class OwnersWithPetsResource {
    private OwnersResource ownersResource = new OwnersResource();
    private PetsResource petsResource = new PetsResource();
    private Owner owner = new Owner();

    /**
     * method to list pets
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
        for (int i = 0; i < ownersResource.getOwners().size(); i++) {
            Map m1 = new LinkedHashMap();
            m1.put("Propietario", ownersResource.getOwners().get(i).getName());
            m1.put("Pet ID", owner.getListPets().get(i).getPetId());
            m1.put("Microchip", owner.getListPets().get(i).getMicroChip());
            m1.put("Name", owner.getListPets().get(i).getName());
            m1.put("Species", owner.getListPets().get(i).getSpecies());
            m1.put("Race", owner.getListPets().get(i).getRace());
            m1.put("Size", owner.getListPets().get(i).getSize());
            m1.put("Sex", owner.getListPets().get(i).getSex());
            m1.put("Picture", owner.getListPets().get(i).getPicture());
            m1.put("Owner ID", owner.getListPets().get(i).getOwnerId());

            json.put("listPets-" + i, m1);
        }

        return Response.ok()
                .entity(json)
                .build();
    }

    @GET
    @Path("/personId")
    @Produces(MediaType.APPLICATION_JSON)
    public Response listPetsOwner(@QueryParam("personId") Integer personId) {
        ownersResource.list();
        petsResource.list();
        owner.setListPets(petsResource.getPets());

        JsonObject json = new JsonObject();
        if (personId != null && personId > 0) {
            json.put(personId.toString(), owner.searchPersonId(personId));
        }

        return Response.ok()
                .entity(json)
                .build();
    }

    @GET
    @Path("/nameOwner")
    @Produces(MediaType.APPLICATION_JSON)
    public Response listPetsOwner(@QueryParam("nameOwner") String nameOwner) {
        ownersResource.list();
        petsResource.list();
        int aux = 0;
        owner.setListPets(petsResource.getPets());

        JsonObject json = new JsonObject();
        for (int i = 0; i < ownersResource.getOwners().size(); i++) {
            if (ownersResource.getOwners().get(i).getName().equals(nameOwner)) {
                Map m1 = new LinkedHashMap();
                m1.put("Pet ID", owner.getListPets().get(i).getPetId());
                m1.put("Microchip", owner.getListPets().get(i).getMicroChip());
                m1.put("Name", owner.getListPets().get(i).getName());
                m1.put("Species", owner.getListPets().get(i).getSpecies());
                m1.put("Race", owner.getListPets().get(i).getRace());
                m1.put("Size", owner.getListPets().get(i).getSize());
                m1.put("Sex", owner.getListPets().get(i).getSex());
                m1.put("Picture", owner.getListPets().get(i).getPicture());
                m1.put("Owner ID", owner.getListPets().get(i).getOwnerId());

                json.put("nameOwner-" + (aux += 1), m1);
            }
        }

        return Response.ok()
                .entity(json)
                .build();
    }

    @GET
    @Path("/neighborhood")
    @Produces(MediaType.APPLICATION_JSON)
    public Response listPetsNeighborhood(@QueryParam("neighborhood") String neighborhood) {
        ownersResource.list();
        petsResource.list();
        int aux = 0;
        owner.setListPets(petsResource.getPets());

        JsonObject json = new JsonObject();
        for (int i = 0; i < ownersResource.getOwners().size(); i++) {
            if (ownersResource.getOwners().get(i).getNeighborhood().equals(neighborhood)) {
                Map m1 = new LinkedHashMap();
                m1.put("Propietario", ownersResource.getOwners().get(i).getName());
                m1.put("Pet ID", owner.getListPets().get(i).getPetId());
                m1.put("Microchip", owner.getListPets().get(i).getMicroChip());
                m1.put("Name", owner.getListPets().get(i).getName());
                m1.put("Species", owner.getListPets().get(i).getSpecies());
                m1.put("Race", owner.getListPets().get(i).getRace());
                m1.put("Size", owner.getListPets().get(i).getSize());
                m1.put("Sex", owner.getListPets().get(i).getSex());
                m1.put("Picture", owner.getListPets().get(i).getPicture());
                m1.put("Owner ID", owner.getListPets().get(i).getOwnerId());

                json.put("listPets-" + i, m1);
            }
        }

        return Response.ok()
                .entity(json)
                .build();
    }

}

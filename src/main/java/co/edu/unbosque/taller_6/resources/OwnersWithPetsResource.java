package co.edu.unbosque.taller_6.resources;
import co.edu.unbosque.taller_6.resources.pojos.Owner;
import co.edu.unbosque.taller_6.resources.pojos.Pet;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/listOwnersWithPets")
public class OwnersWithPetsResource {
    private OwnersResource ownersResource = new OwnersResource();
    private PetsResource petsResource = new PetsResource();
    private Owner owner = new Owner();
    private Pet pet;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response listPets() {
        ownersResource.list();
        petsResource.list();
        owner.setListPets(petsResource.getPets());
        String mensaje = "";

        for (int i = 0; i < ownersResource.getOwners().size(); i++) {
//            mensaje += "Propietario:" + ownersResource.getOwners().get(i).getName() + " " + "Pet ID: " + owner.getListPets().get(i).getPetId() + " " + "Microchip: " + owner.getListPets().get(i).getMicroChip() + " " + "Name: " + owner.getListPets().get(i).getName() + " " + "Species: " + owner.getListPets().get(i).getSpecies() + " " + "Race: " +
//                    owner.getListPets().get(i).getRace() + " " + "Size: " + owner.getListPets().get(i).getSize() + " " + "Sex: " + owner.getListPets().get(i).getSex() + " " + "Picture: " + owner.getListPets().get(i).getPicture() + " " + "Owner ID: " + owner.getListPets().get(i).getOwnerId() + "\n";
         mensaje +=
            "{\"Propietario\": \"owners.get(i).getName()\", \"Mascota\": \"owner.getListPets().get(i).getName()\"}";
        }

        return Response.ok()
                .entity(mensaje)
                .build();
    }

    @GET
    @Path("/personId")
    @Produces(MediaType.APPLICATION_JSON)
    public Response listPetsOwner(@QueryParam("personId") Integer personId) {
        ownersResource.list();
        petsResource.list();
        String mensaje = "";
        owner.setListPets(petsResource.getPets());
        if (personId != null && personId > 0) {
            mensaje += owner.searchPersonId(personId);
        }
        return Response.ok()
                .entity(mensaje)
                .build();
    }

    @GET
    @Path("/nameOwner")
    @Produces(MediaType.APPLICATION_JSON)
    public Response listPetsOwner(@QueryParam("nameOwner") String nameOwner) {
        ownersResource.list();
        petsResource.list();
        String mensaje = "";
        owner.setListPets(petsResource.getPets());
        System.out.println(owner.getListPets().size());
        for (int i = 0; i < ownersResource.getOwners().size(); i++) {
            if (ownersResource.getOwners().get(i).getName().equals(nameOwner)) {
                mensaje += "Pet ID: " + owner.getListPets().get(i).getPetId() + " " + "Microchip: " + owner.getListPets().get(i).getMicroChip() + " " + "Name: " + owner.getListPets().get(i).getName() + " " + "Species: " + owner.getListPets().get(i).getSpecies() + " " + "Race: " +
                        owner.getListPets().get(i).getRace() + " " + "Size: " + owner.getListPets().get(i).getSize() + " " + "Sex: " + owner.getListPets().get(i).getSex() + " " + "Picture: " + owner.getListPets().get(i).getPicture() + " " + "Owner ID: " + owner.getListPets().get(i).getOwnerId() + "\n";
            }
        }
        return Response.ok()
                .entity(mensaje)
                .build();
    }

    @GET
    @Path("/neighborhood")
    @Produces(MediaType.APPLICATION_JSON)
    public Response listPetsNeighborhood(@QueryParam("neighborhood") String neighborhood) {
        ownersResource.list();
        petsResource.list();
        String mensaje = "";
        String mensajeDef = "";
        owner.setListPets(petsResource.getPets());
        System.out.println(owner.getListPets().size());
        for (int i = 0; i < ownersResource.getOwners().size(); i++) {
            if (ownersResource.getOwners().get(i).getNeighborhood().equals(neighborhood)) {
                mensaje += "Propietario:" + ownersResource.getOwners().get(i).getName() + " " + "Pet ID: " + owner.getListPets().get(i).getPetId() + " " + "Microchip: " + owner.getListPets().get(i).getMicroChip() + " " + "Name: " + owner.getListPets().get(i).getName() + " " + "Species: " + owner.getListPets().get(i).getSpecies() + " " + "Race: " +
                        owner.getListPets().get(i).getRace() + " " + "Size: " + owner.getListPets().get(i).getSize() + " " + "Sex: " + owner.getListPets().get(i).getSex() + " " + "Picture: " + owner.getListPets().get(i).getPicture() + " " + "Owner ID: " + " " + owner.getListPets().get(i).getOwnerId() + "\n";
            }
        }
        return Response.ok()
                .entity(mensaje)
                .build();
    }
}

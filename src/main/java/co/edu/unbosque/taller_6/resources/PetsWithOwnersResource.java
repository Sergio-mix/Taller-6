package co.edu.unbosque.taller_6.resources;

import co.edu.unbosque.taller_6.resources.pojos.Owner;
import co.edu.unbosque.taller_6.resources.pojos.Pet;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * Class ListPetsWithOwners
 */
@Path("/listPetsWithOwners")
public class PetsWithOwnersResource {
    private OwnersResource ownersResource = new OwnersResource();
    private PetsResource petsResource = new PetsResource();
    private Owner owner = new Owner();
    private Pet pet;

    /**
     * Metodo get
     * @return
     */
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response listPets() {
        ownersResource.list();
        petsResource.list();
        owner.setListPets(petsResource.getPets());
        String mensaje = "";

        for (int i = 0; i < petsResource.getPets().size(); i++) {
            mensaje += "Mascota:" + petsResource.getPets().get(i).getName() + " " + "User name: " + ownersResource.getOwners().get(i).getUserName() + " " + "Person Id: " + ownersResource.getOwners().get(i).getPersonId() + " " + "Name: " + ownersResource.getOwners().get(i).getName() + " " + "Address: " + ownersResource.getOwners().get(i).getAddress() + " " + "Neighborhood: " +
                    ownersResource.getOwners().get(i).getNeighborhood()  + "\n";

//         mensaje +=
//            "{\"Propietario\": \"owners.get(i).getName()\", \"Mascota\": \"owner.getListPets().get(i).getName()\"}";
        }

        return Response.ok()
                .entity(mensaje)
                .build();
    }

    /**
     * Metodo get microchip
     * @param microchip
     * @return
     */
    @GET
    @Path("/microchip")
    @Produces(MediaType.APPLICATION_JSON)
    public Response listPetsMicrochip(@QueryParam("microchip") Integer microchip) {
        ownersResource.list();
        petsResource.list();
        owner.setListPets(petsResource.getPets());
        System.out.println("ENTROOOOOO"+petsResource.getPets().size());
        String mensaje ="";
        if (microchip != null && microchip > 0) {
            mensaje += owner.searchPetMicrochip(microchip);
        }
        return Response.ok()
                .entity(mensaje)
                .build();
    }

    /**
     * Metodo get for name
     * @param namePet
     * @return
     */
    @GET
    @Path("/namePet")
    @Produces(MediaType.APPLICATION_JSON)
    public Response listPetsNamePet(@QueryParam("namePet") String namePet) {
        ownersResource.list();
        petsResource.list();
        String mensaje = "";
        owner.setListPets(petsResource.getPets());
        System.out.println(owner.getListPets().size());
        for (int i = 0; i < owner.getListPets().size(); i++) {
            if (owner.getListPets().get(i).getName().equals(namePet)) {
                mensaje += "User name: " + ownersResource.getOwners().get(i).getUserName() + " " + "Person Id: " + ownersResource.getOwners().get(i).getPersonId() + " " + "Name: " + ownersResource.getOwners().get(i).getName() + " " + "Address: " + ownersResource.getOwners().get(i).getAddress() + " " + "Neighborhood: " +
                        ownersResource.getOwners().get(i).getNeighborhood()  + "\n";
            }
        }
        return Response.ok()
                .entity(mensaje)
                .build();
    }

    /**
     * metodo get species
     * @param species
     * @return
     */
    @GET
    @Path("/species")
    @Produces(MediaType.APPLICATION_JSON)
    public Response listPetsSpecie(@QueryParam("species") String species) {
        ownersResource.list();
        petsResource.list();
        String mensaje = "";
        owner.setListPets(petsResource.getPets());
        for (int i = 0; i < owner.getListPets().size(); i++) {
            if (owner.getListPets().get(i).getSpecies().equals(species)) {
                mensaje += "Mascota: "+owner.getListPets().get(i).getName()+" "+"User name: " + ownersResource.getOwners().get(i).getUserName() + " " + "Person Id: " + ownersResource.getOwners().get(i).getPersonId() + " " + "Name: " + ownersResource.getOwners().get(i).getName() + " " + "Address: " + ownersResource.getOwners().get(i).getAddress() + " " + "Neighborhood: " +
                        ownersResource.getOwners().get(i).getNeighborhood()  + "\n";
            }
        }
        return Response.ok()
                .entity(mensaje)
                .build();
    }

    /**
     * Metodo get race
     * @param race
     * @return
     */
    @GET
    @Path("/race")
    @Produces(MediaType.APPLICATION_JSON)
    public Response listPetsRace(@QueryParam("race") String race) {
        ownersResource.list();
        petsResource.list();
        String mensaje = "";
        owner.setListPets(petsResource.getPets());
        for (int i = 0; i < owner.getListPets().size(); i++) {
            if (owner.getListPets().get(i).getRace().equals(race)) {
                mensaje += "Mascota: "+owner.getListPets().get(i).getName()+" "+"User name: " + ownersResource.getOwners().get(i).getUserName() + " " + "Person Id: " + ownersResource.getOwners().get(i).getPersonId() + " " + "Name: " + ownersResource.getOwners().get(i).getName() + " " + "Address: " + ownersResource.getOwners().get(i).getAddress() + " " + "Neighborhood: " +
                        ownersResource.getOwners().get(i).getNeighborhood()  + "\n";
            }
        }
        return Response.ok()
                .entity(mensaje)
                .build();
    }

    /**
     * Metodo get size
     * @param size
     * @return
     */
    @GET
    @Path("/size")
    @Produces(MediaType.APPLICATION_JSON)
    public Response listPetsSize(@QueryParam("size") String size) {
        ownersResource.list();
        petsResource.list();
        String mensaje = "";
        owner.setListPets(petsResource.getPets());
        for (int i = 0; i < owner.getListPets().size(); i++) {
            if (owner.getListPets().get(i).getSize().equals(size)) {
                mensaje += "Mascota: "+owner.getListPets().get(i).getName()+" "+"User name: " + ownersResource.getOwners().get(i).getUserName() + " " + "Person Id: " + ownersResource.getOwners().get(i).getPersonId() + " " + "Name: " + ownersResource.getOwners().get(i).getName() + " " + "Address: " + ownersResource.getOwners().get(i).getAddress() + " " + "Neighborhood: " +
                        ownersResource.getOwners().get(i).getNeighborhood()  + "\n";
            }
        }
        return Response.ok()
                .entity(mensaje)
                .build();
    }

    /**
     * Metodo get Sex
     * @param sex
     * @return
     */
    @GET
    @Path("/sex")
    @Produces(MediaType.APPLICATION_JSON)
    public Response listPetsSex(@QueryParam("sex") String sex) {
        ownersResource.list();
        petsResource.list();
        String mensaje = "";
        owner.setListPets(petsResource.getPets());
        for (int i = 0; i < owner.getListPets().size(); i++) {
            if (owner.getListPets().get(i).getSex().equals(sex)) {
                mensaje += "Mascota: "+owner.getListPets().get(i).getName()+" "+"User name: " + ownersResource.getOwners().get(i).getUserName() + " " + "Person Id: " + ownersResource.getOwners().get(i).getPersonId() + " " + "Name: " + ownersResource.getOwners().get(i).getName() + " " + "Address: " + ownersResource.getOwners().get(i).getAddress() + " " + "Neighborhood: " +
                        ownersResource.getOwners().get(i).getNeighborhood()  + "\n";
            }
        }
        return Response.ok()
                .entity(mensaje)
                .build();
    }
}

package co.edu.unbosque.taller_6.resources;

import com.github.cliftonlabs.json_simple.JsonObject;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * Class TotalPets
 */
@Path("/totalPets")
public class TotalPetsResource {
    private PetsResource petsResource;

    /**
     * metodo get owners Total (get)
     *
     * @return json with the information of the pets discriminated by different parameters
     */
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response totalOwners() {
        petsResource = new PetsResource();
        petsResource.list();
        int contador = 0, contador0 = 0, contador1 = 0, contador01 = 0, contador2 = 0, contador21 = 0, contador3 = 0, contador31 = 0, microchip = 0, esterilizados = 3;
        JsonObject json = new JsonObject();

        for (int i = 0; i < petsResource.getPets().size(); i++) {
            if (petsResource.getPets().get(i).getSpecies().equals("Canino")) {
                contador++;
            }
            if (petsResource.getPets().get(i).getSpecies().equals("Felino")) {
                contador0++;
            }
            if (petsResource.getPets().get(i).getRace().equals("Doberman")) {
                contador01++;
            }
            if (petsResource.getPets().get(i).getRace().equals("Ragdoll")) {
                contador1++;
            }
            if (petsResource.getPets().get(i).getSize().equals("Grande")) {
                contador2++;
            }
            if (petsResource.getPets().get(i).getSize().equals("Mediano")) {
                contador21++;
            }
            if (petsResource.getPets().get(i).getSex().equals("Macho")) {
                contador3++;
            }
            if (petsResource.getPets().get(i).getSex().equals("Hembra")) {
                contador31++;
            }
            if (petsResource.getPets().get(i).getMicroChip() != null)
                microchip++;
        }

        json.put("El numero de mascotas registradas es", petsResource.getPets().size());
        json.put("El numero de mascotas que son de especie canino es", contador);
        json.put("El numero de mascotas que son de especie felino es", contador0);
        json.put("El numero de mascotas que son de raza Ragdoll es", contador1);
        json.put("El numero de mascotas que son de raza Doberman es", contador01);
        json.put("El numero de mascotas que son de tamaño grande es", contador2);
        json.put("El numero de mascotas que son de tamaño mediano es", contador21);
        json.put("El numero de mascotas que son de sexo macho", contador3);
        json.put("El numero de mascotas que son de sexo hembra", contador31);
        json.put("El numero de mascotas que tienen microchip es", microchip);
        json.put("El numero de mascotas esterilizadas es", esterilizados);

        return Response.ok()
                .entity(json)
                .build();
    }
}

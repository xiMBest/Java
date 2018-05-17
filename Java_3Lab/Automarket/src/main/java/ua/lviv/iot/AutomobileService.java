package ua.lviv.iot;

import javax.enterprise.context.SessionScoped;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

@Path("/automarkets")
@SessionScoped
public class AutomobileService implements Serializable{
    private static Map<Integer, Automobile> automobileMap = new HashMap<>();
    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Automobile getAutomobile(@PathParam("id") Integer id) {
        return automobileMap.get(id);
    }

    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public Response createAutomobile(Automobile automobile) {
        automobileMap.put(automobile.getId(), automobile);
        return Response.status(200).entity("Good").build();
    }

    @DELETE
    @Path("/{id}")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response deleteAutomobile(@PathParam("id") Integer id) {
        automobileMap.remove(id);
        return Response.status(200).entity("Good").build();
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public Response updateAutomobile(Automobile automobile) {
        automobileMap.put(automobile.getId(), automobile);
        return Response.status(200).entity("Good").build();
    }

}
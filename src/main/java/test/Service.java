/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 *
 * @author daniel_hernandez
 */
@Path("demo")
public class Service {
    
    @GET
    @Path("/find")
    @Produces(MediaType.TEXT_PLAIN)
    public Response find() {
        return Response.ok("hola mundo").build();
    }
    
}

package org.devanshu;

import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

import java.util.Arrays;
import java.util.List;

@Path("aliens")
public class AlienResource {

    AlienRepository repo = new AlienRepository();

//    @GET
//    @Produces(MediaType.APPLICATION_XML)

    // Returning only one Alien object in the page
//    public Alien getAlien(){
//        System.out.println();
//        Alien a1 = new Alien();
//        a1.setName("Devanshu");
//        a1.setPoints(100);
//        return a1;
//    }

//     Returning the list of aliens
//    public List<Alien> getAlien() {
//        System.out.println("Get Alien Called");
//        Alien a1 = new Alien();
//        a1.setName("Devanshu");
//        a1.setPoints(100);
//
//        Alien a2 = new Alien();
//        a2.setName("Neha");
//        a2.setPoints(60);
//
//
//        List<Alien> aliens = Arrays.asList(a1, a2);
//
//        return aliens;
//    }

    // Fetching data from the database => AlienRepository/AlienDAO
    @GET
    @Produces({MediaType.APPLICATION_JSON , MediaType.APPLICATION_XML})
    public List<Alien> getAlien(){
        System.out.println("Aliens Called");
        return repo.getAliens();
    }

    @GET
    @Path("alien/{id}")
    @Produces({MediaType.APPLICATION_XML , MediaType.APPLICATION_JSON})
    public Alien getAlien(@PathParam("id") int id){
        return repo.getAlien(id);
    }


    @POST
    @Path("alien")
    @Produces({MediaType.APPLICATION_XML , MediaType.APPLICATION_JSON})
    public Alien creteAlien(Alien a){
        System.out.println(a);
        repo.create(a);
        return a;
    }
}
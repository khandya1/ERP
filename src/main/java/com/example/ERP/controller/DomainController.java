package com.example.ERP.controller;

import com.example.ERP.beans.Domain;
import com.example.ERP.services.DomainService;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;

@Path("domain")
public class DomainController {

    @POST
    @Path("/display")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response getDomain() throws URISyntaxException {
        System.out.println("helllo");
        DomainService domainService= new DomainService();
        List<Domain> domain = new ArrayList<Domain>();
        domain  = domainService.fetchDomain();
        // System.out.println(courses.);
        if(domain == null){
            return Response.noContent().build();
        }
        System.out.println(domain.size());
        return Response.ok().entity(domain).build();
    }
}

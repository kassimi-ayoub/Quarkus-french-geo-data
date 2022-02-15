package org.acme.service;

import org.acme.data.Commune;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;
import org.jboss.resteasy.annotations.jaxrs.PathParam;
import org.jboss.resteasy.annotations.jaxrs.QueryParam;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import java.util.Set;

@RegisterRestClient(configKey = "geo-api")
@Path("communes")
public interface CommuneService {

    //PathParam ==> https://sfihdskfuhsdfh/{pathparam}
    //QueryParam ==> https://sdfhsjfdfgdjf?id={id}&nom={nom}
    @GET
    Set<Commune> getCommunes();
}

package org.acme;

import org.acme.data.Commune;
import org.acme.service.CommuneService;
import org.eclipse.microprofile.rest.client.inject.RestClient;
import org.jboss.resteasy.annotations.jaxrs.PathParam;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import java.util.Set;

@Path("/frenchGeo")
public class CommuneResource {

    @Inject
    @RestClient
    CommuneService communeService;

    @GET
    public Set<Commune> getCommune(){
        return communeService.getCommunes();
    }
}

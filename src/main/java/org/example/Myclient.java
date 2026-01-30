package org.example;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.HeaderParam;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.core.Response;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;


@RegisterRestClient(baseUri = "https://example.com")
@Path("")
public interface Myclient {

    @GET
    @Path("/")
    Response getData(@HeaderParam("Authorization") String auth);
}

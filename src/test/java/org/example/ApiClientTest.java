package org.example;

import io.quarkus.test.junit.QuarkusTest;
import jakarta.inject.Inject;
import org.eclipse.microprofile.rest.client.inject.RestClient;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@QuarkusTest
public class ApiClientTest {

    @Inject
    @RestClient
    Myclient apiClient;

    @Test
    public void testGetData() {
        // Test the API client with a sample request
        String authToken = "Bearer superSecretToken";
        var response = apiClient.getData(authToken);
        
        assertNotNull(response);
        assertEquals(200, response.getStatus());
        
        // Read and verify the response body
        String body = response.readEntity(String.class);
        assertNotNull(body);
        System.out.println("Response body: " + body);
    }
}

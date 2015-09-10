package pl.mloza.base.rest;

import org.springframework.http.client.ClientHttpResponse;
import org.springframework.web.client.DefaultResponseErrorHandler;
import org.springframework.web.client.RestClientException;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by scroot on 10.09.2015.
 */
public class CustomErrorHandler extends DefaultResponseErrorHandler {
    public void handleError(ClientHttpResponse response) throws IOException {
        throw new RestClientException(new BufferedReader(new InputStreamReader(response.getBody())).readLine());
    }
}

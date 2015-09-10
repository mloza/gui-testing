package pl.mloza.base.config;

import com.google.common.collect.Lists;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpHeaders;
import org.springframework.http.client.ClientHttpRequestInterceptor;
import org.springframework.web.client.RestTemplate;
import pl.mloza.base.rest.CustomConverter;
import pl.mloza.base.rest.CustomErrorHandler;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class BaseRawClient {

    @Bean
    public RestTemplate restTemplate(@Value("${base.api.key}") String baseApiKey){
        List<ClientHttpRequestInterceptor> interceptors = new ArrayList<>();
        interceptors.add((httpRequest, bytes, clientHttpRequestExecution) -> {
            HttpHeaders headers = httpRequest.getHeaders();
            headers.add("Authorization", "Bearer " + baseApiKey);
            headers.add("Accept", "application/json");
            return clientHttpRequestExecution.execute(httpRequest, bytes);
        });

        RestTemplate restTemplate = new RestTemplate();
        restTemplate.setInterceptors(interceptors);
        restTemplate.setMessageConverters(Lists.newArrayList(new CustomConverter()));
        restTemplate.setErrorHandler(new CustomErrorHandler());

        return restTemplate;
    }
}

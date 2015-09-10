package pl.mloza.base.config;

import com.getbase.Client;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BaseApi {

    @Bean
    public Client baseClient(@Value("${base.api.key}") String baseApiKey) {
        return new Client(new com.getbase.Configuration.Builder()
                .accessToken(baseApiKey)
                .verbose()
                .build());
    }

}

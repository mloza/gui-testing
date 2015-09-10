package pl.mloza.base.rest;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.commons.io.IOUtils;
import org.springframework.http.HttpInputMessage;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Type;

public class CustomConverter extends MappingJackson2HttpMessageConverter {

    private ObjectMapper objectMapper = new ObjectMapper();

    @Override
    public Object read(Type type, Class<?> contextClass, HttpInputMessage inputMessage) throws IOException, HttpMessageNotReadableException {
        InputStream istream = inputMessage.getBody();
        String responseString = IOUtils.toString(istream);
        try {
            return this.objectMapper.convertValue(this.objectMapper.readTree(responseString).get("data"), getJavaType(type, contextClass));
        } catch (Exception ex) {
            throw new HttpMessageNotReadableException(responseString);
        }
    }
}
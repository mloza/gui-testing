package pl.mloza.base.rest;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Envelope<T> {

    @JsonProperty("data")
    T data;

    @SuppressWarnings("unchecked")
    public static <T> Envelope createEnvelope(T data) {
        return new Envelope().withData(data);
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Envelope withData(T data) {
        this.data = data;
        return this;
    }
}

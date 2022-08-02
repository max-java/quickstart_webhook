package com.tutrit.quickstartwebhook;


import org.springframework.util.MultiValueMap;

public class Dto {

    Object data;
    MultiValueMap<String, String> headers;

    public Dto() {
    }

    public Dto(final Object data, final MultiValueMap<String, String> headers) {
        this.data = data;
        this.headers = headers;
    }

    public Object getData() {
        return data;
    }

    public void setData(final Object data) {
        this.data = data;
    }

    public MultiValueMap<String, String> getHeaders() {
        return headers;
    }

    public void setHeaders(final MultiValueMap<String, String> headers) {
        this.headers = headers;
    }
}

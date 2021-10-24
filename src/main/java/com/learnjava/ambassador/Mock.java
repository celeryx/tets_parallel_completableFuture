package com.learnjava.ambassador;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class Mock {

    private RestTemplate restTemplate = new RestTemplate();

    public ResponseEntity getUsers() {

        String url = new StringBuilder().append("http://localhost:3001/users").toString();
        HttpHeaders headers = new HttpHeaders();
        HttpEntity request = new HttpEntity(headers);
        ResponseEntity re = restTemplate.exchange(url, HttpMethod.GET, request, String.class);
        return re;
    }
}

package com.bhuvnesh.restTemplateDemo;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class RestTemplateProvider
{
    RestTemplate rest = new RestTemplate();

    public UserData getUserData()
    {
        return rest.getForObject("http://localhost:8080/restApi/getData",
                                      UserData.class);
    }

    public ResponseEntity<UserData> postUserData(UserData userData)
    {
        return rest.postForEntity("http://localhost:8080/restApi/postData",
                                      userData,
                                      UserData.class);
    }
}

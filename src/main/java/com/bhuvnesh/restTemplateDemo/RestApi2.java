package com.bhuvnesh.restTemplateDemo;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping(path = "/restApi2",
                produces = "application/json")
public class RestApi2
{
    RestTemplate rest = new RestTemplate();

    @GetMapping(path = "/getData2")
    public UserData getUserData()
    {
        return rest.getForObject("http://localhost:8080/restApi1/getData1",
                                      UserData.class);
    }

    @PostMapping(path = "/postData2")
    public ResponseEntity<UserData> postUserData(@RequestBody UserData userData)
    {
        System.out.println(userData.getId());
        System.out.println(userData.getUserName());
        System.out.println(userData.getData());

        return rest.postForEntity("http://localhost:8080/restApi1/postData1",
                                      userData,
                                      UserData.class);
    }
}

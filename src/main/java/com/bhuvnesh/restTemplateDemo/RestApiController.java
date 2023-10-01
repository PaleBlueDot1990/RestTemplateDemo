package com.bhuvnesh.restTemplateDemo;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/restApi",
                produces = "application/json")
public class RestApiController
{
    @GetMapping(path = "/getData")
    public UserData get()
    {
        UserData userData = new UserData();
        userData.setId("1");
        userData.setUserName("Bhuvnesh Bhuwan");
        userData.setData("Data Sent by Rest-API");

        return userData;
    }

    @PostMapping(path = "/postData")
    public ResponseEntity<UserData> post(@RequestBody UserData userData)
    {
        HttpHeaders headers = new HttpHeaders();
        return new ResponseEntity<>(userData,
                                    headers,
                                    HttpStatus.CREATED);
    }
}

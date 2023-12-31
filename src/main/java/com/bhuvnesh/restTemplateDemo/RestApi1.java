package com.bhuvnesh.restTemplateDemo;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/restApi1",
                produces = "application/json")
public class RestApi1
{
    @GetMapping(path = "/getData1")
    public UserData get()
    {
        UserData userData = new UserData();
        userData.setId("1");
        userData.setUserName("Bhuvnesh Bhuwan");
        userData.setData("Rest Template Demo");

        return userData;
    }

    @PostMapping(path = "/postData1")
    public ResponseEntity<UserData> post(@RequestBody UserData userData)
    {
        HttpHeaders headers = new HttpHeaders();
        return new ResponseEntity<>(userData,
                                    headers,
                                    HttpStatus.CREATED);
    }
}

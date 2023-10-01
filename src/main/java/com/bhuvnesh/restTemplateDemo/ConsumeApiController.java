package com.bhuvnesh.restTemplateDemo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path = "/api")
public class ConsumeApiController
{
    @Autowired
    RestTemplateProvider restTemplateProvider;

    @GetMapping(path = "/get")
    public String get(Model model)
    {
        model.addAttribute("user",
                            restTemplateProvider.getUserData());
        model.addAttribute("model",
                           new UserData());

        return "GetData";
    }

    @PostMapping(path = "/post")
    public String post(@ModelAttribute("model") UserData userData, Model model)
    {
        ResponseEntity<UserData> response = restTemplateProvider.postUserData(userData);

        model.addAttribute("user", response.getBody());

        model.addAttribute("headers",
                           response.getHeaders() + " " + response.getStatusCode());

        return "PostData";
    }
}

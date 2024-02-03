package com.example.demo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.view.RedirectView;

@Slf4j
@Controller
public class WebController {

    @GetMapping("/login")
    public String login(){
        log.info("Redirecting");
        return "redirect:/oauth2/authorization/azure";
    }

//    @GetMapping("/logout")
//    public String logout(){
//        log.info("Logging out");
//        return "redirect:https://login.microsoftonline.com/1a4c120c-a869-44c9-a51b-74538a67d4dd/oauth2/v2.0/logout";
//    }

}

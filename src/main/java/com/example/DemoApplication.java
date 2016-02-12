package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@Controller
@SpringBootApplication
@RequestMapping("/")
public class DemoApplication {
    @RequestMapping(path="/")
    String home(Model model) {
    	return "index";
    }

    @RequestMapping("/oauthcallback")
    String oauthcallback() {
      return "oauthcallback";
    }

   
    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }
}
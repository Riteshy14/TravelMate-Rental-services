package com.TravelMate.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class pageController {

  @RequestMapping("/home")
  public String home() {

    System.err.println("hello from page controller");
    return "home";

  }

  @RequestMapping(value="/do-register", method=RequestMethod.POST)
      public String precessRegister() {
          System.out.println("precessing register");

          //fetch the data
          // userform class
          //validate form
          // save to database
          // message registration succesful
          // redirect to login page

          return "redirect:/register";
      }

  // procession register

}

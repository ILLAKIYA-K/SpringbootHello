package com.example.helloworld;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
@RestController
public class hello{
   
   @GetMapping("/")
   public String welcome(){
      return "Hi I am Illaksh\n This was my first SpringBoot Web application";
   }
}
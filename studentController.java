package com.springboot.thymeleaf.studentModel;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@Controller
public class studentController {

@GetMapping("/log")
public String student(Model m1) {

    student s1=new student();

    m1.addAttribute("student", s1);
    return"log";
}
@PostMapping("/processform")
public String pro(@ModelAttribute("student") student s1) {
   System.out.println("student is "+s1.getFirstname()+" "+s1.getLastname());    
    return "confirmform";
}





}

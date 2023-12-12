package com.ems.controller;

import com.ems.entity.Employee;
import com.ems.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class EmsController {

    @Autowired
    private EmpService empService;
    @GetMapping("/home")
    public String home(){
        return "index";
    }

    @GetMapping("/addEmp")
    public String addEmp(){
        return "addEmp";
    }

    @PostMapping("/register")
    public String empReg(@ModelAttribute Employee emp){
        empService.addEmp(emp);
        return "redirect:/home";
    }
}

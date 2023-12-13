package com.ems.controller;

import com.ems.entity.Employee;
import com.ems.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;
import java.util.Optional;

@Controller
public class EmsController {

    @Autowired
    private EmpService empService;
    @GetMapping("/")
    public String home(Model model){

        List<Employee> emp = empService.getAllEmp();

        model.addAttribute("emp",emp);

        return "index";
    }

    @GetMapping("/addEmp")
    public String addEmp(){
        return "addEmp";
    }

    @PostMapping("/register")
    public String empReg(@ModelAttribute Employee emp){
        empService.addEmp(emp);
        return "redirect:/";
    }
//
//    @GetMapping("/editemp")
//    public String editEmp(@PathVariable() int id,Model model){
//        Optional<Employee> empById = empService.getEmpById(id);
//
//        model.addAttribute("emp",empById);
//
//        return "edit";
//    }
}

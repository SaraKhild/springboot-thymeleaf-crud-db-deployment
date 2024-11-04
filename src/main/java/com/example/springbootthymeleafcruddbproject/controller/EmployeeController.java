package com.example.springbootthymeleafcruddbproject.controller;


import com.example.springbootthymeleafcruddbproject.entity.Employee;
import com.example.springbootthymeleafcruddbproject.service.EmployeeSerivce;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/employees")
public class EmployeeController {

    @Autowired
    private EmployeeSerivce ES;


    @GetMapping("/list")
    public String listEmployee (Model model){

        List<Employee> employees = ES.findAll();
        model.addAttribute("modelemployee",employees);

        return "list-employees";
    }

    @GetMapping("/showFormAdd")
    public String showFormAdd(Model theModel){
        //create model attriabute to bind form data
        Employee employees= new Employee();
        theModel.addAttribute("modelemployee", employees);
        return "employee-form";
    }


    @PostMapping("/save")
    public String saveEmployee(@ModelAttribute("modelemployee") Employee employee){

        //save it into DB
        ES.save(employee);
        //redirect to request mapping /employees/lis
        return "redirect:/employees/list";
    }

    @GetMapping("/showFormUpdate")
    public String showFormUpdate(@RequestParam("employeeId") int id , Model theModel) {

        //get employee from service
        Employee employee = ES.findById(id);
        //set employee as model attribute  to pre-populate the form
        theModel.addAttribute("modelemployee", employee);

        //send over to our form
        return "employee-form";
    }

     @GetMapping("/delete")
     public  String delete(@RequestParam("employeeId") int id){

         //delete employee
          ES.deleteById(id);

          //redirect
         return "redirect:/employees/list";
        }




}

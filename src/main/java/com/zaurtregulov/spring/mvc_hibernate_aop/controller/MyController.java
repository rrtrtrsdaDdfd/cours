package com.zaurtregulov.spring.mvc_hibernate_aop.controller;

import com.zaurtregulov.spring.mvc_hibernate_aop.DAO.EmployeeDao;
import com.zaurtregulov.spring.mvc_hibernate_aop.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class MyController {
    @Autowired
    private EmployeeDao employeeDao;

    @RequestMapping("/")
    public String showEmployees(Model model) {
        List<Employee> employeeList = employeeDao.employeeList();
        model.addAttribute("allEmps", employeeList);


        return "all";
    }
}

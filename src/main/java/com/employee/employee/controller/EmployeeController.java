package com.employee.employee.controller;

import com.employee.employee.model.Employee;
import com.employee.employee.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;
    /*
    * Endpoints
    * /employee  post
    * /employee  get all
    * /employee/id get by id
    * /employee/id  put
    * /employee/id delete
    * */
    @GetMapping("/employee")
    public List<Employee>getAllEmployee(){
        return this.employeeService.getAllEmployee();
    }
    @GetMapping("employee/{id}")
    public Employee getEmployee(@PathVariable String id){
        return this.employeeService.getEmployee(Integer.parseInt(id));
    }
    @PostMapping("/employee")
    public String createEmployee(@RequestBody Employee employee){
        return this.employeeService.createEmployee(employee);
    }
    @PutMapping("/employee/{id}")
    public Employee updateEmployee(@RequestBody Employee employee){
        return this.employeeService.updateEmployee(employee);
    }
    @DeleteMapping("/employee/{id}")
    public void deleteEmployee(@PathVariable String id){
        this.employeeService.deleteEmployee(Integer.parseInt(id));
    }

}

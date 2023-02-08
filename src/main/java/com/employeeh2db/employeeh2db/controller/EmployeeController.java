package com.employeeh2db.employeeh2db.controller;

import com.employeeh2db.employeeh2db.model.Employee;
import com.employeeh2db.employeeh2db.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;
    @GetMapping("/employee")
    public ResponseEntity<List<Employee>> getAllEmployee(){
        return this.employeeService.getAllEmployee();
    }
    @PostMapping("/employee")
    public ResponseEntity<Employee> postEmployee(@RequestBody Employee employee){
        return this.employeeService.postEmployee(employee);
    }
    @GetMapping("/employee/{id}")
    public ResponseEntity<Employee> getEmployee(@PathVariable Integer id){
        return this.employeeService.getEmployee(id);
    }
    @PutMapping("/employee")
    public ResponseEntity<Employee> updateEmployee(@RequestBody Employee employee){
        return this.employeeService.updateEmployee(employee);
    }
    @DeleteMapping("/employee/{id}")
    public ResponseEntity<HttpStatus> deleteEmployee(@PathVariable Integer id){
        return this.employeeService.deleteEmployee(id);
    }
    @GetMapping("/employee/age/{age}")
    public ResponseEntity<List<Employee>> findAllByAge(@PathVariable Integer age){
        return this.employeeService.findAllByAge(age);
    }
}

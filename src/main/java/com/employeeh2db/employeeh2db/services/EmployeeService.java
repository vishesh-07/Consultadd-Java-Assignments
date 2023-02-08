package com.employeeh2db.employeeh2db.services;

import com.employeeh2db.employeeh2db.model.Employee;
import com.employeeh2db.employeeh2db.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {
    @Autowired
    EmployeeRepository employeeRepository;

    //post
    public ResponseEntity<Employee> postEmployee(Employee employee) {
        try {
            return new ResponseEntity<>(employeeRepository.save(employee), HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    // get all
    public ResponseEntity<List<Employee>> getAllEmployee() {
        try {
            List<Employee> list = employeeRepository.findAll();
            if (list.isEmpty()) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }
            return new ResponseEntity<>(list, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    // get Particular
    public ResponseEntity<Employee> getEmployee(Integer id) {
        Optional<Employee> employee = employeeRepository.findById(id);
        if (employee.isPresent()) {
            return new ResponseEntity<>(employee.get(), HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
    //put
    public ResponseEntity<Employee> updateEmployee(Employee employee) {
        try {
            return new ResponseEntity<>(employeeRepository.save(employee), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    //delete
    public ResponseEntity<HttpStatus> deleteEmployee(Integer id) {
        try {
            Optional<Employee> employee = employeeRepository.findById(id);
            if (employee.isPresent()) {
                employeeRepository.delete(employee.get());
            }
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    public ResponseEntity<List<Employee>> findAllByAge(Integer age){
        try {
            List<Employee> list = employeeRepository.findAll();
            List<Employee>employees=new ArrayList<>();
            for(Employee employee:list){
                if(employee.getAge()==age){
                    employees.add(employee);
                }
            }
            if (employees.isEmpty()) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }
            return new ResponseEntity<>(employees, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}

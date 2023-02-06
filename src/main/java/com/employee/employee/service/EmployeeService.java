package com.employee.employee.service;

import com.employee.employee.model.Employee;
import com.employee.employee.repository.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepo employeeRepo;
    //create
    public String createEmployee(Employee employee){
        if(this.employeeRepo.existsById(employee.getId())){
            return "Employee with Employee Id "+employee.getId()+" already exists";
        }else{
            this.employeeRepo.save(employee);
            return "Employee Details Saved Successfully";
        }
    }
    //get all
    public List<Employee> getAllEmployee(){
        return this.employeeRepo.findAll();
    }
    //get single
    public Employee getEmployee(int id){
        System.out.println(id);
//        return null;
//        System.out.println(this.employeeRepo.getReferenceById());
        var val=this.employeeRepo.findById(id);
        if(val.isPresent()){
            return val.get();
//            System.out.println(val.get());
        }
        return null;
//        return this.employeeRepo.getById(id);
    }
    //update an employee
    public Employee updateEmployee(Employee employee){
        if(this.employeeRepo.existsById(employee.getId())){
            this.employeeRepo.save(employee);
            return employee;
        }
        return null;
    }
    //delete employee
    public void deleteEmployee(int id){
        this.employeeRepo.deleteById(id);
    }
}

package com.employee.employee.service;

import com.employee.employee.model.Employee;
import com.employee.employee.repository.EmployeeRepo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.mockito.Mockito.when;

@SpringBootTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class EmployeeServiceTest {
    @Mock
    EmployeeRepo employeeRepo;
    @InjectMocks
    EmployeeService employeeService;
    Employee employee;
    @BeforeEach
    public void setUp() {
        this.employee = new Employee(1, "Vivek Verma", "HR", 40000);
    }
    @Test
    void testCreateEmployee(){
        Employee employee = new Employee(1, "Aman Verma", "IT", 50000);
        when(employeeRepo.existsById(employee.getId())).thenReturn(false);
        String result = employeeService.createEmployee(employee);
        Assertions.assertEquals(result, "Employee Details Saved Successfully");
    }
    @Test
    void testGetAllEmployee(){
        List<Employee> employees = new ArrayList<>();
        Employee employee = new Employee(1, "Aman Verma", "IT", 50000);
        employees.add(employee);
        when(employeeRepo.findAll()).thenReturn(employees);
        List<Employee> allEmployees = employeeService.getAllEmployee();
        Assertions.assertTrue(allEmployees.size() > 0);
    }
    @Test
    void testGetEmployee(){
        Employee employee = new Employee(1, "Aman Verma", "IT", 50000);
        Assertions.assertThrows(NullPointerException.class,()->{
           employeeService.getEmployee(employee.getId());
        });
    }
    @Test
    void testUpdateEmployee(){
        Optional<Employee> employee = Optional.of(this.employee);
        Employee emp = new Employee(1, "Ravi Teja", "IT", 70000);
        when(employeeRepo.findById(this.employee.getId())).thenReturn(employee);
        String op = employeeService.updateEmployee(emp);
        Assertions.assertEquals(op, "Updated");
    }
    @Test
    void testDeleteEmployee(){
        when(employeeRepo.existsById(this.employee.getId())).thenReturn(true);
        String result = employeeService.deleteEmployee(this.employee.getId());
        System.out.println(result);
        Assertions.assertEquals(result, "Deleted");
    }
}

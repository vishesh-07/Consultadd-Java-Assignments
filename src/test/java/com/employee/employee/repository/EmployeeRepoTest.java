package com.employee.employee.repository;

import com.employee.employee.model.Employee;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class EmployeeRepoTest {
    @Autowired
    private EmployeeRepo employeeRepo;
    private Employee employee;
//    @BeforeEach
//    public void setUp(){
//        this.employee = new Employee(1, "Ravi Verma", "IT", 80000);
//    }
    @Test
    public void testCreateEmployee()
    {
        Employee employee = new Employee(1, "Aman Verma", "IT", 50000);
        Employee savedEmployee = employeeRepo.save(employee);
        Assertions.assertNotNull(savedEmployee);
        Assertions.assertEquals(savedEmployee.getId(), employee.getId());
    }
    @Test
    public void testFindAllBySalary() {
        Employee employee = new Employee(1, "Aman Verma", "IT", 50000);
        employeeRepo.save(employee);
        List<Employee> salary = employeeRepo.getAllBySalary(50000);
        Assertions.assertNotNull(salary);
        Assertions.assertTrue(salary.size()>0);
    }
}

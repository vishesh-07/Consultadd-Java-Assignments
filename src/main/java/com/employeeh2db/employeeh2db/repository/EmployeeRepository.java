package com.employeeh2db.employeeh2db.repository;

import com.employeeh2db.employeeh2db.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee,Integer> {
    public ResponseEntity<List<Employee>> findAllByAge(Integer age);
}

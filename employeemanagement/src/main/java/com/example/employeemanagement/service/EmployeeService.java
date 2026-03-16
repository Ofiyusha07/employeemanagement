package com.example.employeemanagement.service;

import com.example.employeemanagement.model.Employee;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeService {

    private List<Employee> employees = new ArrayList<>();

    public List<Employee> getAllEmployees() {
        return employees;
    }

    public Employee addEmployee(Employee employee) {
        employees.add(employee);
        return employee;
    }

    public Employee updateEmployee(Long id, Employee updatedEmployee) {
        for (Employee e : employees) {
            if (e.getId().equals(id)) {
                e.setName(updatedEmployee.getName());
                e.setPosition(updatedEmployee.getPosition());
                e.setSalary(updatedEmployee.getSalary());
                return e;
            }
        }
        return null;
    }

    public void deleteEmployee(Long id) {
        employees.removeIf(e -> e.getId().equals(id));
    }
}
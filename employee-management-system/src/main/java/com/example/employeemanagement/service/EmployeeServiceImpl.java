package com.example.employeemanagement.service;

import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.employeemanagement.entity.Employee;
import com.example.employeemanagement.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepository repo;

    public Employee saveEmployee(Employee employee) {
        return repo.save(employee);
    }

    public List<Employee> getAllEmployees() {
        return repo.findAll();
    }

    public Employee getEmployeeById(Long id) {
        return repo.findById(id)
                .orElseThrow(() -> new RuntimeException("Employee not found"));
    }

    public Employee updateEmployee(Long id, Employee emp) {
        Employee e = getEmployeeById(id);

        e.setName(emp.getName());
        e.setEmail(emp.getEmail());
        e.setDepartment(emp.getDepartment());
        e.setSalary(emp.getSalary());

        return repo.save(e);
    }

    public void deleteEmployee(Long id) {
        repo.deleteById(id);
    }
}
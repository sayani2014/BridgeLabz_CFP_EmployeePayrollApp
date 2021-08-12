package com.bridgelabz.employeepayroll.service;

import com.bridgelabz.employeepayroll.dto.EmployeeDTO;
import com.bridgelabz.employeepayroll.entity.Employee;

import java.util.List;

public interface IEmployeeService {
    EmployeeDTO addEmployee(EmployeeDTO employeeDTO);
    List<EmployeeDTO> getEmployee();
    EmployeeDTO getEmployeeByID(int id);
    EmployeeDTO updateEmployeeDetails(int id, EmployeeDTO employeeDTO);
    void deleteEmployee(int id);

    List<Employee> getEmployeeByDepartment(String department);
}

package com.bridgelabz.employeepayroll.service;

import com.bridgelabz.employeepayroll.dto.EmployeeDTO;
import com.bridgelabz.employeepayroll.entity.Employee;
import com.bridgelabz.employeepayroll.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    /**
     * Purpose : Ability to achieve all employee details from the DB.
     * @return
     */

    public List<EmployeeDTO> getEmployee() {
        return employeeRepository.findAll().stream().map(employee -> {
            return new EmployeeDTO(employee.getEmpId(), employee.getEmpName(), employee.getEmpAddress(),
                    employee.getEmpSalary(), employee.getEmpMobileNo(), employee.getEmpEmail());
        }).collect(Collectors.toList());
    }

    /**
     * Purpose : Ability to add employee in the DB.
     * @param employeeDTO
     * @return
     */

    public EmployeeDTO addEmployee(EmployeeDTO employeeDTO) {
        Employee employee = new Employee();
        employee.setEmpName(employeeDTO.getEmpName());
        employee.setEmpAddress(employeeDTO.getEmpAddress());
        employee.setEmpSalary(employeeDTO.getEmpSalary());
        employee.setEmpMobileNo(employeeDTO.getEmpMobileNo());
        employee.setEmpEmail(employeeDTO.getEmpEmail());
        employeeRepository.save(employee);
        return employeeDTO;
    }

    /**
     * Purpose : Ability to fetch details of a particular employee based on ID
     * @param id
     * @return
     */

    public Employee getEmployeeByID(int id) {
        Employee employee = findEmployeeById(id);
        return employee;
    }

    //    Ability to update a particular attribute of an employee based on ID
    //    public Employee updateEmployeeDetails(int id, String phone) {
    //        Employee employee = findEmployeeById(id);
    //        employee.setEmpMobileNo(phone);
    //        employeeRepository.save(employee);
    //        return employee;
    //    }

    /**
     * Purpose : Ability to updates all details of a particular employee based on ID
     * @param id
     * @param employee
     * @return
     */

    public Employee updateEmployeeDetails(int id, Employee employee) {
        Employee employeeDetails = findEmployeeById(id);
        employeeDetails.setEmpName(employee.getEmpName());
        employeeDetails.setEmpSalary(employee.getEmpSalary());
        employeeDetails.setEmpAddress(employee.getEmpAddress());
        employeeDetails.setEmpMobileNo(employee.getEmpMobileNo());
        employeeDetails.setEmpEmail(employee.getEmpEmail());
        employeeRepository.save(employeeDetails);
        return employee;
    }

    /**
     * Purpose : Ability to delete a particular employee based on ID
     * @param id
     * @return
     */

    public String deleteEmployee(int id) {
        Employee employee = findEmployeeById(id);
        employeeRepository.delete(employee);
        return "Employee deleted successfully";
    }

    /**
     * Purpose : Ability to find an employee based on ID
     * @param id
     * @return
     */

    private Employee findEmployeeById(int id) {
        return employeeRepository.findAll().stream()
                .filter(greetingElement -> greetingElement.getEmpId() == id).findFirst()
                .orElseThrow(() -> new RuntimeException("Unable to find any employee"));
    }
}

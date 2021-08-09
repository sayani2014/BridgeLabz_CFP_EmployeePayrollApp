package com.bridgelabz.employeepayroll.dto;

import lombok.Data;

@Data
public class EmployeeDTO {
    private int empId;
    private String empName;
    private String empAddress;
    private double empSalary;
    private String empMobileNo;
    private String empEmail;
    
    public EmployeeDTO(int empId, String empName, String empAddress, double empSalary, String empMobileNo, String empEmail) {
        this.empId = empId;
        this.empName = empName;
        this.empAddress = empAddress;
        this.empSalary = empSalary;
        this.empMobileNo = empMobileNo;
        this.empEmail = empEmail;
    }
}

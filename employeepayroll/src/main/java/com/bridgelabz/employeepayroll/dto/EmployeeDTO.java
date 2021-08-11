package com.bridgelabz.employeepayroll.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeDTO {
    private int empId;
    @NotEmpty(message = "Employee Name cannot be null")
    @Pattern(regexp = "^[A-Z][a-zA-z\\s]{2,}$", message = "Employee Name Invalid")
    private String empName;
    @Pattern(regexp = "^[A-Z][a-zA-z0-9\\s]{1,}$", message = "Employee Address Invalid")
    private String empAddress;
    @Min(value = 10000, message = "Min Wage should be more than 10000")
    private double empSalary;
    @Pattern(regexp = "^[0-9]{10}$", message = "Employee Phone Number Invalid")
    private String empMobileNo;
    @Pattern(regexp = "^[\\w!#$%&'*+/=?`{|}~^-]+(?:\\.[\\w!#$%&'*+/=?`{|}~^-]+)*" +
            "@(?:([0-9-]{1}|[a-zA-Z]{3,5})\\.)+[a-zA-Z]{2,3}$", message = "Employee Email Invalid")
    private String empEmail;
}

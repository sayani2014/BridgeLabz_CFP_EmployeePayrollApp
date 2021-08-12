package com.bridgelabz.employeepayroll.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.*;
import java.time.LocalDate;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeDTO {
    private int empId;

    @NotEmpty(message = "Employee Name cannot be null")
    @Pattern(regexp = "^[A-Z][a-zA-z\\s]{2,}$", message = "Employee Name Invalid")
    private String empName;

    @Pattern(regexp = "Male|Female", message = "Gender needs to be male or female")
    private String empGender;

    @Min(value = 10000, message = "Min Wage should be more than 10000")
    private double empSalary;

    @NotEmpty(message = "StartDate should not be Empty")
    private String startDate;

    @NotEmpty(message = "Note cannot be empty")
    private String note;

    @NotEmpty(message = "Profile Pic cannot be empty")
    private String profilePic;

    @NotEmpty(message = "Department should not be empty")
    private List<String> department;
}

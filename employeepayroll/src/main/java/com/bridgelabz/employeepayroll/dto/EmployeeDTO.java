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
    
    @NotEmpty(message = "Employee Name cannot be null")
    @Pattern(regexp = "^[A-Z][a-zA-z\\s]{2,}$", message = "Employee Name Invalid")
    private String empName;

    @Pattern(regexp = "Male|Female", message = "Gender needs to be male or female")
    private String empGender;

    @Min(value = 10000, message = "Min Wage should be more than 10000")
    private double empSalary;

    @JsonFormat(pattern = "dd MMM yyyy")
    @NotNull(message = "StartDate should not be Empty")
    @PastOrPresent(message = "StartDate should be past or today's date")
    private LocalDate startDate;

    @NotBlank(message = "Note cannot be empty")
    private String note;

    @NotBlank(message = "Profile Pic cannot be empty")
    private String profilePic;

    @NotNull(message = "Department should not be empty")
    private List<String> department;
}

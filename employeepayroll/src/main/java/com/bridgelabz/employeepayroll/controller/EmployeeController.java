/**
 * Create a Employee Payroll Spring Project to cater to REST Request.
 * Create a Rest Controller to demonstrate the various HTTP Methods.
 *
 * @author : SAYANI KOLEY
 * @since : 09.08.2021
 */

package com.bridgelabz.employeepayroll.controller;

import com.bridgelabz.employeepayroll.dto.EmployeeDTO;
import com.bridgelabz.employeepayroll.entity.Employee;
import com.bridgelabz.employeepayroll.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    /**
     * Purpose : Ability to use GET HTTP method to fetch all data from the DB
     * @return
     */

    @GetMapping(value = "/getEmployee")
    public ResponseEntity<List<EmployeeDTO>> getEmployee() {
        return new ResponseEntity<>(employeeService.getEmployee(), HttpStatus.OK);
    }

    /**
     * Purpose : Ability to use POST HTTP method to save data in the DB
     * @param employee
     * @return
     */

    @PostMapping(value = "/addEmployee")
    public ResponseEntity<EmployeeDTO> addEmployee(@RequestBody EmployeeDTO employee) {
        return new ResponseEntity<>(employeeService.addEmployee(employee), HttpStatus.OK);
    }

    /**
     * Purpose : Ability to use GET HTTP method to fetch data from the DB according to the Employee ID
     * @param id
     * @return
     */

    @GetMapping(value = "/getEmployeeByID")
    public ResponseEntity<Employee> getEmployeeByID(@RequestParam(name = "id") int id) {
        return new ResponseEntity<>(employeeService.getEmployeeByID(id), HttpStatus.OK);
    }

    /**
     * Purpose : Ability to use PUT HTTP method to update all data in the DB based on Employee ID
     * @param id
     * @param employee
     * @return
     */

    @PutMapping(value = "/updateEmployee")
    public ResponseEntity<Employee> updateGreeting(@RequestParam(name = "id") int id,
                                                   @RequestBody Employee employee) {
        return new ResponseEntity<>(employeeService.updateEmployeeDetails(id, employee), HttpStatus.OK);
    }

    //    Ability to update a single attribute in the DB based on id
    //    public ResponseEntity<Employee> updateGreeting(@RequestParam(name = "id") int id,
    //                                                   @RequestParam(name = "phone") String phone) {
    //        return new ResponseEntity<>(employeeService.updateEmployeeDetails(id, phone), HttpStatus.OK);
    //    }

    /**
     * Purpose : Ability to use DELETE HTTP method to delete data from the DB
     * @param id
     * @return
     */

    @DeleteMapping(value = "/deleteEmployee")
    public ResponseEntity<String> deleteEmployee(@RequestParam(name = "id") int id) {
        return new ResponseEntity<>(employeeService.deleteEmployee(id), HttpStatus.OK);
    }
}

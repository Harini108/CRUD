package com.javaapi.controller;

import java.util.List;  
import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.web.bind.annotation.DeleteMapping;  
import org.springframework.web.bind.annotation.GetMapping;  
import org.springframework.web.bind.annotation.PathVariable;  
import org.springframework.web.bind.annotation.PostMapping;  
import org.springframework.web.bind.annotation.PutMapping;  
import org.springframework.web.bind.annotation.RequestBody;  
import org.springframework.web.bind.annotation.RestController;  
import com.javaapi.model.employee; 
import com.javaapi.service.employeeservice;  
//mark class as Controller  
@RestController  
public class employeecontroller   
{  
//autowire the Employee Service class  
@Autowired  
employeeservice empserv;  
//creating a get mapping that retrieves all the employees detail from the database   
@GetMapping("/employee")  
private List<employee> getAllEmp()   
{  
return empserv.getAllEmp();  
}  
//creating a get mapping that retrieves the detail of a specific employee
@GetMapping("/employee/{empid}")  
private employee getEmp(@PathVariable("empid") int empid)   
{  
return empserv.getEmpById(empid);  
}  
//creating a delete mapping that deletes a specified employee  
@DeleteMapping("/employee/{empid}")  
private void deleteEmp(@PathVariable("empid") int empid)   
{  
empserv.delete(empid);  
}  
//creating post mapping that post an employee detail in the database  
@PostMapping("/emp")  
private int saveEmp(@RequestBody employee emp)   
{  
empserv.saveOrUpdate(emp);  
return emp.getEmpid();  
}  
//creating put mapping that updates the employee detail   
@PutMapping("/emp")  
private employee update(@RequestBody employee emp)   
{  
empserv.saveOrUpdate(emp);  
return emp;  
}  
}  


package com.javaapi.service;

import java.util.ArrayList;  
import java.util.List;  
import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.stereotype.Service;  
import com.javaapi.model.employee;  
import com.javaapi.repository.employeerepository;  
//defining the business logic  
@Service  
public class employeeservice   
{  
@Autowired  
employeerepository emprep;  
//getting all books record by using the method findaAll() of CrudRepository  
public List<employee> getAllEmp()   
{  
List<employee> emp = new ArrayList<employee>();  
emprep.findAll().forEach(emp1 -> emp.add(emp1));  
return emp;  
}  
//getting a specific record by using the method findById() of CrudRepository  
public employee getEmpById(int empid)   
{  
return emprep.findById(empid).get();  
}  
//saving a specific record by using the method save() of CrudRepository  
public void saveOrUpdate(employee emp)   
{  
emprep.save(emp);  
}  
//deleting a specific record by using the method deleteById() of CrudRepository  
public void delete(int empid)   
{  
emprep.deleteById(empid);  
}  
//updating a record  
public void update(employee emp, int empid)   
{  
emprep.save(emp);  
}  
}  

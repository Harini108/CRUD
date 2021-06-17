package com.javaapi.repository;

import org.springframework.data.repository.CrudRepository;
import com.javaapi.model.employee;
public interface employeerepository extends CrudRepository<employee,Integer>
{

}

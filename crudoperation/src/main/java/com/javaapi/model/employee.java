package com.javaapi.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table

public class employee
{
	@Id
	@Column
	private int empid;
	@Column
	private String empname;
	@Column
	private int phn;
	@Column
	private int salary;
	public int getEmpid()
	{
		return empid;
	}
    public void setEmpid(int empid)
    {
    	this.empid = empid;
    }
    public String getEmpname()
    {
    	return empname;
    }
    public void setEmpname(String empname)
    {
    	this.empname = empname;
    }
    public int getPhone()
    {
    	return phn;
    }
    public void setPhone(int phn)
    {
    	this.phn = phn;
    }
    public int getSalary()
    {
    	return salary;
    }
    public void setSalary(int salary)
    {
    	this.salary = salary;
    }
 }

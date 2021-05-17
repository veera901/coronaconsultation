package com.coronaconsultation.services;

import java.util.Optional;

import com.coronaconsultation.entities.Department;

public interface IDepartmentMaster {
	
    public Department createDepartment(Department department) ;
	
	public Department updateDepartment(Department department);
	
	public Optional<Department>  findById(int id);

}

package com.coronaconsultation.services;



import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coronaconsultation.entities.Department;
import com.coronaconsultation.exception.DepartmenException;
//import com.coronaconsultation.entities.DepartmenException;
import com.coronaconsultation.repository.DepartmentRepository;

@Service
public class DepartmentMasterImpl implements IDepartmentMaster {
	@Autowired
	private DepartmentRepository repo;

	@Override
	public Department createDepartment(Department department) {
	
		return repo.save(department);
	}

	@Override
	public Department updateDepartment(Department department) {
		 if(repo.existsById(department.getId())) {
			 return  repo.save(department);
		 }
		 else {
			 return null;
		}
	}

	@Override
	public Optional<Department> findById(int id) {
		return repo.findById(id);
		
	}

	}

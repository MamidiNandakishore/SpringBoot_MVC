package com.cg.EmployeeManagementSystem_Boot_MVC.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.EmployeeManagementSystem_Boot_MVC.entity.Employee;
import com.cg.EmployeeManagementSystem_Boot_MVC.repository.EmployeeRepository;
@Service
public class EmployeeServiceImp implements EmployeeService {
	@Autowired
	private EmployeeRepository repo; 
	@Override
	public List<Employee> getAllEmployee() {
		List<Employee> e= repo.findAll();
		return e;
	}

	@Override
	public Employee getEmployeeById(long id) {
		Employee e=repo.findById(id).get();
		return e;
	}

	@Override
	public void saveEmployee(Employee e) {
		 repo.save(e);
		
	}

	@Override
	public Employee updateEmployee(long id,Employee e) {
		Employee e1=repo.findById(id).get();
		e1.setName(e.getName());
		e1.setEmail(e.getEmail());
		e1.setDepartment(e.getDepartment());
		e1.setMob_num(e.getMob_num());
		return repo.save(e);
	}

	@Override
	public void deleteEmployee(long id) {
		Employee e=repo.findById(id).get();
		repo.delete(e);
	}
	
}

package com.montrealcollege.exercise16.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.montrealcollege.exercise16.dao.AddDepartmentDao;
import com.montrealcollege.exercise16.model.AddDepartment;

@Service("addDepartmentService")
@Transactional
public class AddDepartmentServiceImpl implements AddDepartmentService{
	
	@Autowired
	AddDepartmentDao dao;

	@Override
	public void saveDepartment(AddDepartment addDep) {
		dao.saveDepartment(addDep);
		
	}

	@Override
	public List<AddDepartment> retrieveAllDepartments() {
		return dao.retrieveAllDepartments();
		
	}

}

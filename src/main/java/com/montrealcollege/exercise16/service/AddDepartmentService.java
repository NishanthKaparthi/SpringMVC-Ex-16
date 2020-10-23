package com.montrealcollege.exercise16.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.montrealcollege.exercise16.model.AddDepartment;

public interface AddDepartmentService {
	void saveDepartment(AddDepartment addDep);
    List<AddDepartment> retrieveAllDepartments(); 

}

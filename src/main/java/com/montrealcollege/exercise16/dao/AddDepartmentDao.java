package com.montrealcollege.exercise16.dao;

import java.util.List;

import com.montrealcollege.exercise16.model.AddDepartment;

public interface AddDepartmentDao {
	public void saveDepartment(AddDepartment addDep);
	public List<AddDepartment> retrieveAllDepartments();
}

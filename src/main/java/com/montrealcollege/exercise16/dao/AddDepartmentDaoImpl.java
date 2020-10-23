package com.montrealcollege.exercise16.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.springframework.stereotype.Repository;

import com.montrealcollege.exercise16.model.AddDepartment;

@Repository("addDepartmentDao")
public class AddDepartmentDaoImpl extends AbstractDao<Integer, AddDepartment> implements AddDepartmentDao {

	@Override
	public void saveDepartment(AddDepartment addDep) {
		persist(addDep);
		
	}

	@Override
	public List<AddDepartment> retrieveAllDepartments() {
		Criteria criteria = createEntityCriteria();
        return (List<AddDepartment>) criteria.list();
	}

}

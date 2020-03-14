package com.abc.employee.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.abc.employee.dao.entity.EmployeeEntity;

@Repository
public interface EmployeeDao extends CrudRepository<EmployeeEntity,Integer> {

}

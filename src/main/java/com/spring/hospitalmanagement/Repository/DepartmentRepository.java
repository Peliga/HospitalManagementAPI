package com.spring.hospitalmanagement.Repository;

import com.spring.hospitalmanagement.Model.Department;
import org.springframework.data.repository.CrudRepository;

public interface DepartmentRepository extends CrudRepository<Department, Integer> {
}

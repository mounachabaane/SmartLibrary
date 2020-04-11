package com.libray.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.libray.models.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
	

}

package com.demo.crudApplication.repository;

import com.demo.crudApplication.model.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department, Long> {
}

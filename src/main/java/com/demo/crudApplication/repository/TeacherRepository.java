package com.demo.crudApplication.repository;

import com.demo.crudApplication.model.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeacherRepository extends JpaRepository<Teacher, Long> {
}


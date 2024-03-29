package com.library.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.library.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer>{
	
	@Query("from Student where name like :n%")
	List<Student> getStudentByName(@Param("n") String name);
	
	
	@Query("from Student where year =:y ")
	List<Student>  getStudentByYear(@Param("y") int year);
	
	@Query("from Student where branch like :b%")
	List<Student>  getStudentByBranch(@Param("b") String branch);
	
	

}
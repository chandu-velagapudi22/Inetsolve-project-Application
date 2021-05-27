package com.example.demo.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.InetSolveStudentData;

public interface InetsolveStudentRepository extends JpaRepository<InetSolveStudentData, Serializable> {

	public InetSolveStudentData findByStudentName(String studentName);

	public InetSolveStudentData findByCourse(String courseName);

	public InetSolveStudentData findByEmail(String enterEmail);

	public InetSolveStudentData findByPassword(String password);
}

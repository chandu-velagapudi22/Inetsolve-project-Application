package com.example.demo.Dao;

import org.springframework.stereotype.Repository;

import com.example.demo.entity.InetSolveStudentData;

@Repository
public interface InetSolveStudentDao {

	public InetSolveStudentData saveData(InetSolveStudentData inetSolveStudentData);

	public InetSolveStudentData getDataByStudentId(Integer id);

	public InetSolveStudentData getDataByStudentName(String name);

	public InetSolveStudentData getDataByStudentCourse(String courseName);;

	public InetSolveStudentData getDataByStudentEmail(String email);

	public InetSolveStudentData getDataByStudentPassword(String password);

}

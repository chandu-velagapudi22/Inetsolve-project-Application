package com.example.demo.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Dao.InetSolveStudentDao;
import com.example.demo.entity.InetSolveStudentData;
import com.example.demo.repository.InetsolveStudentRepository;

@Service
public class InetSolveStudentService implements InetSolveStudentDao {
	@Autowired
	private InetsolveStudentRepository repository;

	@Override
	public InetSolveStudentData saveData(InetSolveStudentData inetSolveStudentData) {

		if (inetSolveStudentData != null) {
			InetSolveStudentData studentData = repository.save(inetSolveStudentData);
			return studentData;
		} else
			throw new RuntimeException("No data is their to save the student ");
	}

	@Override
	public InetSolveStudentData getDataByStudentId(Integer id) {
		if (id != null) {
			Optional<InetSolveStudentData> findById = repository.findById(id);
			InetSolveStudentData inetSolveStudentData = findById.get();
			return inetSolveStudentData;
		} else {
			throw new RuntimeException("Based on this id::" + id + "  ::No data is founded ");
		}

	}

	@Override
	public InetSolveStudentData getDataByStudentName(String name) {
		if (name != null) {
			InetSolveStudentData findByStudentName = repository.findByStudentName(name);
			return findByStudentName;
		} else {
			throw new RuntimeException("Based on this name::" + name + "  ::No data is founded ");
		}
	}

	@Override
	public InetSolveStudentData getDataByStudentCourse(String courseName) {
		if (courseName != null & courseName.equals("")) {
			InetSolveStudentData findByCourse = repository.findByCourse(courseName);
			return findByCourse;
		} else {
			throw new RuntimeException("Based on this name::" + courseName + "  ::No Courses is founded ");
		}
	}

	@Override
	public InetSolveStudentData getDataByStudentEmail(String email) {
		if (email != null & !email.contains("@")) {
			InetSolveStudentData findByEmail = repository.findByEmail(email);
			return findByEmail;
		} else {
			throw new RuntimeException("Based on this name::" + email + "  ::No Email is founded ");
		}
	}

	@Override
	public InetSolveStudentData getDataByStudentPassword(String password) {
		if (password != null) {
			InetSolveStudentData findByPassword = repository.findByPassword(password);
			return findByPassword;
		} else {
			throw new RuntimeException("Based on this password::" + password + "  ::No password is founded ");
		}
	}

}

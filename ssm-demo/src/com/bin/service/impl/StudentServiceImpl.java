package com.bin.service.impl;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bin.dao.StudentDao;
import com.bin.po.Student;
import com.bin.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {
	
	@Autowired
	private StudentDao studentDao;

	@Override
	public List<Student> findAll() {
		
		return studentDao.findAll();
	}

	@Override
	public void addStu(String name,String hobby) {
		
		studentDao.addStu(name,hobby);

	}

}

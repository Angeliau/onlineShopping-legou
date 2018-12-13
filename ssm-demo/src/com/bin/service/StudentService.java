package com.bin.service;

import java.util.HashMap;
import java.util.List;

import com.bin.po.Student;

public interface StudentService {
	
    public List<Student> findAll();
    
    public void addStu(String name,String hobby);
}

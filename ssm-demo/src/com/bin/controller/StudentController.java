package com.bin.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.bin.po.Student;
import com.bin.service.StudentService;

/**
 * 
 * @ClassName:  StudentController     
 * @Description:  Student's web view
 * @author: xb    
 * @date:   2018年11月19日 下午5:44:36   
 * @version V1.0
 */
@Controller
public class StudentController {
	
	@Autowired
	private StudentService studentService;
	
	
	@RequestMapping("/findAll")
	public ModelAndView findAll(){
		List<Student> stuLists = studentService.findAll();
		
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("stuLists", stuLists);
		modelAndView.setViewName("jsp/listStu.jsp");
		
		return modelAndView;
	}
	
	@RequestMapping("/add")
	public String add(String name,String hobby){
		studentService.addStu(name, hobby);
		return "findAll";
	}
}

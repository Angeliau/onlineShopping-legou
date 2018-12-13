package com.bin.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.bin.po.Student;

/**
 * 
 * @ClassName:  StudentDao     
 * @Description:  Student持久层接口
 * @author: xb    
 * @date:   2018年11月19日 下午5:27:43   
 * @version V1.0
 */
public interface StudentDao {
	
    public List<Student> findAll();
    
    public void addStu(String name,String hobby);
    
    //public void addStu(@Param(value="name")String name,@Param(value="hobby")String hobby);
}

package com.bin.po;

/**
 * 
 * @ClassName:  Student     
 * @Description:  学生实体类
 * @author: xb    
 * @date:   2018年11月19日 下午5:08:18   
 * @version V1.0
 */
public class Student {
	
	//学生编号
	private int id;
	//学生姓名
	private String name;
	//兴趣爱好
	private String hobby;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getHobby() {
		return hobby;
	}
	public void setHobby(String hobby) {
		this.hobby = hobby;
	}
	
}

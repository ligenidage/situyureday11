package com.situ.day2;

public class Student {
    private String name;
    private int age;
    private String className;
    
    
    
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}
	
	public void study(){
		System.out.println(name + "正在" + className + "xuexi" );
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", className="
				+ className + "]";
	}

    
	}
    


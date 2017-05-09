package com.situ.day2;

public class StudentDemo {
	public static void main(String[] args) {
		Student student = new Student();
		student.setName( "lige");
		student.setAge (21);
		student.setClassName ("java1305班");
		
		System.out.println("name:" + student.getName());
		System.out.println("age:" + student.getAge());
		System.out.println("className" + student.getClassName());
		
		System.out.println(student);
		student.study();
		
	}	
}

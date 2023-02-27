package com.schoolattendance.model;


	public class Student {
	    private String name;
	    private int age;
	    private String gender;
	    private String className;
	    
	    public Student(String name, int age, String gender, String className) {
	        this.name = name;
	        this.age = age;
	        this.gender = gender;
	        this.className = className;
	    }
	    
	    public String getName() {
	        return name;
	    }
	    
	    public int getAge() {
	        return age;
	    }
	    
	    public String getGender() {
	        return gender;
	    }
	    
	    public String getClassName() {
	        return className;
	    }
	}


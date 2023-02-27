package com.schoolattendance.model;

import java.time.LocalDate;
import java.util.ArrayList;

import java.util.List;

import java.util.stream.Collectors;

public class School {
	    private List<Student> students;
	    private List<Attendance> attendance;
	   
	    public School() {
	        students = new ArrayList<>();
	        attendance = new ArrayList<>();
	    }
	    
	    
	  
	    public void addStudent(Student student) {
	        students.add(student);
	    }
	    
	    public void recordAttendance(Student student, LocalDate date, AttendanceStatus status) {
	        attendance.add(new Attendance(student, date, status));
	    } 
    
	    public List<Student> getStudents() {
	        return students;
	    }
	    
	    public List<Attendance> getAttendance() {
	        return attendance;
	  
	    }
	    
	    public List<Attendance> getAttendanceByStudent(Student student) {
	        return attendance.stream().filter(a -> a.getStudent().equals(student)).collect(Collectors.toList());
	 
	        }
	    
	
	    
	    public List<Attendance> getAttendanceByDate(LocalDate date) {
	        return attendance.stream().filter(a -> a.getDate().equals(date)).collect(Collectors.toList());
	    }
	}
	   


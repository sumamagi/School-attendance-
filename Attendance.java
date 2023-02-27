package com.schoolattendance.model;

import java.time.LocalDate;
import com.schoolattendance.controller.AttendanceControl;

public class Attendance {
	    private Student student;
	    private LocalDate date;
	    private AttendanceStatus status;
	    
	    public Attendance(Student student, LocalDate date, AttendanceStatus status) {
	        this.student = student;
	        this.date = date;
	        this.status = status;
	    }
	    
	    public Student getStudent() {
	        return student;
	    }
	    
	    public LocalDate getDate() {
	        return date;
	    }
	    
	    public AttendanceStatus getStatus() {
	        return status;
	    }
	}


	   
	


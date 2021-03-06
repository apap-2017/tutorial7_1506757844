package com.example.service;

import java.util.List;

import com.example.model.CourseModel;
import com.example.model.StudentModel;

public interface StudentService
{
	CourseModel selectCourse(String id_course);
	
    StudentModel selectStudent (String npm);

    List<StudentModel> selectAllStudents ();

    void addStudent (StudentModel student);

    void deleteStudent (String npm);
    
    void updateStudent (StudentModel student);
    
    
}

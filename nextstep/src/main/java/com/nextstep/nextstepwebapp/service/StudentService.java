package com.nextstep.nextstepwebapp.service;

import com.nextstep.nextstepwebapp.model.Student;

import java.util.List;

public interface StudentService {
    public  void saveStudent(Student student);
    public List<Student> getStudentList();
}

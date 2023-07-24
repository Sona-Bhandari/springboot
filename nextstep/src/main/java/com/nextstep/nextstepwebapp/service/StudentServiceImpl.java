package com.nextstep.nextstepwebapp.service;

import com.nextstep.nextstepwebapp.model.Student;
import com.nextstep.nextstepwebapp.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class StudentServiceImpl  implements  StudentService{
    @Autowired
   StudentRepository studentRepository;

    @Transactional
    public void saveStudent(Student student) {

        studentRepository.save(student);
    }

    @Override
    public List<Student> getStudentList() {
        return studentRepository.findAll();
    }
}

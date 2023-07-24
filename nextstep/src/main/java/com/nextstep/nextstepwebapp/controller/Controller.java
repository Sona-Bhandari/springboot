package com.nextstep.nextstepwebapp.controller;

import com.nextstep.nextstepwebapp.model.Student;
import com.nextstep.nextstepwebapp.response.Apiresponse;
import com.nextstep.nextstepwebapp.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
public class Controller {
    @Autowired
    StudentService studentService;

    @PostMapping("/saveStudent")

    public ResponseEntity<Apiresponse> saveStudent(@RequestBody Student student) {
        if (student != null) {
            studentService.saveStudent(student);
            Apiresponse apiresponse = new Apiresponse("success", 200);
            return ResponseEntity.status(HttpStatus.OK).body(apiresponse);
        } else {
            Apiresponse apiresponse = new Apiresponse("failurer", 400);
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(apiresponse);
        }
    }

    @GetMapping("studentDetail")
    public ResponseEntity<Apiresponse> getStudentDetail() {
        List<Student> studentList = studentService.getStudentList();
        if (!studentList.isEmpty()) {
            Apiresponse apiresponse = new Apiresponse("success", 200, studentList);
            return ResponseEntity.status(HttpStatus.OK).body(apiresponse);
        } else {
            Apiresponse apiresponse = new Apiresponse("failurer", 400);
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(apiresponse);
        }
    }
}

package com.nextstep.nextstepwebapp.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.nextstep.nextstepwebapp.model.Student;

import java.util.List;

public class Apiresponse {
    @JsonProperty("status")
    private String status;
    @JsonProperty("status_code")

    private int statusCode;
    @JsonProperty("student_list")
private List<Student> studentList;
    public Apiresponse(String status, int statusCode) {
        this.status = status;
        this.statusCode = statusCode;
    }

    public Apiresponse(String status, int statusCode, List<Student> studentList) {
        this.status = status;
        this.statusCode = statusCode;
        this.studentList = studentList;
    }
}

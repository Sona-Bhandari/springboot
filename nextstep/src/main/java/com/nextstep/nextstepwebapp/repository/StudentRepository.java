package com.nextstep.nextstepwebapp.repository;

import com.nextstep.nextstepwebapp.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student,Long> {

}

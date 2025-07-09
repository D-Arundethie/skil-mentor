package com.skillmentor.root.dao;

import com.skillmentor.root.dto.StudentDTO;
import com.skillmentor.root.util.DatabaseConnection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class StudentDAOImpl implements StudentDAO{
    @Autowired
    private DatabaseConnection databaseConnection;

    @Override
    public StudentDTO createStudent(StudentDTO studentDTO) {
        return studentDTO;
    }

    @Override
    public List<StudentDTO> getAllStudents() {
        return List.of();
    }

    @Override
    public StudentDTO getStudentById(Integer id) {
        return null;
    }

    @Override
    public StudentDTO updateStudentById(Integer id) {
        return null;
    }

    @Override
    public StudentDTO deleteStudentById(Integer id) {
        return null;
    }
}

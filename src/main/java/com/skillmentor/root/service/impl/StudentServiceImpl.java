package com.skillmentor.root.service.impl;

import com.skillmentor.root.dto.StudentDTO;
import com.skillmentor.root.repository.StudentRepository;
import com.skillmentor.root.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    StudentRepository studentRepository;

    @Override
    public StudentDTO createStudent(StudentDTO studentDTO) {
        StudentDTO studentDTO1 = studentRepository.createStudent(studentDTO);
        return studentDTO1;
    }

    @Override
    public List<StudentDTO> getAllStudents() {
        return studentRepository.getAllStudents();
    }

    @Override
    public StudentDTO getStudentById(Integer id) {
        return studentRepository.getStudentById(id);
    }

    @Override
    public StudentDTO updateStudentById(Integer id) {
        return studentRepository.getStudentById(id);
    }

    @Override
    public StudentDTO deleteStudentById(Integer id) {
        return null;
    }
}

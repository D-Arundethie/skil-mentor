package com.skillmentor.root.repository;

import com.skillmentor.root.dto.StudentDTO;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Repository
public class StudentRepository {
    private List<StudentDTO> students = new ArrayList<>();

    public StudentDTO createStudent(StudentDTO studentDTO) {
        students.add(studentDTO);
        return studentDTO;
    }

    public List<StudentDTO> getAllStudents(){
        return students;
    }

    public StudentDTO getStudentById(Integer id) {
        Optional<StudentDTO> studentDTOOptional = students.stream()
                .filter(student -> Objects.equals(student.getStudentId(), id))
                .findFirst();
        return studentDTOOptional.orElse(null);
    }

    public StudentDTO updateStudentById(StudentDTO studentDTO) {
        Optional<StudentDTO> studentDTO1 = students.stream()
                .filter(stu -> stu.getStudentId().equals(studentDTO.getStudentId())).findFirst();
        StudentDTO updatedStudent = studentDTO1.orElse(null);
        updatedStudent.setFirstName(studentDTO.getFirstName());
        students.add(1, updatedStudent);
        return updatedStudent;
    }

    public StudentDTO deleteStudentById(StudentDTO studentDTO) {
        students.remove(studentDTO.getStudentId());
        return studentDTO;
    }


}

package com.skillmentor.root.controller;

import com.skillmentor.root.dto.StudentDTO;
import com.skillmentor.root.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/student")
public class StudentController {
    @Autowired
    private StudentService studentService;

    @PostMapping()
    public ResponseEntity<StudentDTO> createStudent(@RequestBody StudentDTO studentDTO) {
        studentService.createStudent(studentDTO);
        return new ResponseEntity<>(studentDTO, HttpStatus.OK);
    }

    @GetMapping()
    public ResponseEntity<List<StudentDTO>> getAllStudents(
            @RequestParam(required = false) List<String> addresses,
            @RequestParam(required = false) List<Integer> ages
    ){
        List<StudentDTO> studentDTOS = studentService.getAllStudents(addresses, ages);
        return new ResponseEntity<>(studentDTOS, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<StudentDTO> findStudentById(@PathVariable Integer id) {
        StudentDTO Student = studentService.getStudentById(id);
        return new ResponseEntity<>(Student, HttpStatus.OK);
    }

    @PutMapping()
    public ResponseEntity<StudentDTO> updateStudent(@RequestBody StudentDTO studentDTO){
        studentService.updateStudentById(studentDTO.getStudentId());
        return new ResponseEntity<>(studentDTO, HttpStatus.OK);
        }

    @DeleteMapping("/{id}")
    public ResponseEntity<StudentDTO> deleteStudent(@PathVariable Integer id) {
        StudentDTO deleteStudentById = studentService.getStudentById(id);
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
}

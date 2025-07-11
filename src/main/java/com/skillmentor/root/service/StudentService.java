package com.skillmentor.root.service;

import com.skillmentor.root.dto.StudentDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface StudentService {
    /**
     * Creates a new student.
     *
     * @param studentDTO the data transfer object containing student details
     * @return the created StudentDTO
     */
    StudentDTO createStudent(StudentDTO studentDTO);


    /**
     * Retrieves all students, optionally filtered by addresses and ages.
     *
     * @param addresses a list of addresses to filter students by (optional)
     * @param ages a list of ages to filter students by (optional)
     * @return a list of StudentDTOs matching the criteria
     */
    List<StudentDTO> getAllStudents(List<String> addresses, List<Integer> ages);

    /**
     * Retrieves a student by their ID.
     *
     * @param id the ID of the student
     * @return the StudentDTO corresponding to the given ID
     */
    StudentDTO getStudentById(Integer id);

    /**
     * Updates an existing student.
     *
     * @param id the ID of the student to update
     * @return the updated StudentDTO
     */
    StudentDTO updateStudentById(Integer id);

    StudentDTO updateStudentById(StudentDTO studentDTO);

    /**
     * Deletes a student by their ID.
     *
     * @param id the ID of the student to delete
     * @return the deleted StudentDTO
     */
    StudentDTO deleteStudentById(Integer id);
}

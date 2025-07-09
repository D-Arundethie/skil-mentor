package com.skillmentor.root.dao;

import com.skillmentor.root.dto.StudentDTO;

import java.util.List;

public interface StudentDAO {
    /**
     * Creates a new student.
     *
     * @param studentDTO the data transfer object containing student details
     * @return the created StudentDTO
     */
    StudentDTO createStudent(StudentDTO studentDTO);


    /**
     * Retrieves all students.
     *
     * @return a list of StudentDTOs
     */
    List<StudentDTO> getAllStudents();

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

    /**
     * Deletes a student by their ID.
     *
     * @param id the ID of the student to delete
     * @return the deleted StudentDTO
     */
    StudentDTO deleteStudentById(Integer id);

}

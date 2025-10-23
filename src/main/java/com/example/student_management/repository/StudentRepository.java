package com.example.student_management.repository;

import com.example.student_management.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Collection;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {
    // recheche par etudiant ( kayn ta save , findAll , delete , findById
    Student findById(int id);
    // requette personalise
    @Query("select YEAR (s.dateNaissance), COUNT (s) from Student s group by year (s.dateNaissance)")
    Collection<Object[]> findNbrStudentByYear();

}

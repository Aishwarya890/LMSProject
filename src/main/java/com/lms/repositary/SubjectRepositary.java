package com.lms.repositary;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.lms.entity.TablSubject;

public interface SubjectRepositary  extends JpaRepository<TablSubject, Long>{

//	   @Query("SELECT s.studentId, CONCAT(s.firstName, ' ', s.lastName) AS studentName, " +
//	           "s.division ,s.standard, ts.subjectName, ts.teacherName " +
//	           "FROM Student s JOIN TablSubject ts ON ts.studentId = s.id " +
//	           "WHERE ts.subjectName = :subjectName")
//	    List<Object[]> findStudentSubjectDetails(@Param("subjectName") String subjectName);

}

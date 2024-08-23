package com.qcm.questionservice.repositories;

import com.qcm.questionservice.entities.Question;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuestionRepository extends JpaRepository<Question, Long> {
}

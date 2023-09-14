package com.telusko.quizApp.service;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.telusko.quizApp.model.Question;

@Repository
public interface QuestionDao extends JpaRepository<Question, Integer>{

	public List<Question> findByCategory(String category);
}

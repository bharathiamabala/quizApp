package com.telusko.quizApp.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.telusko.quizApp.model.Question;

@Service
public class QuestionService {

	@Autowired
	QuestionDao questionDao;

	public ResponseEntity<List<Question>> getAllQuestions() {
		try {
			return new ResponseEntity<>(questionDao.findAll(), HttpStatus.OK);
		} catch (Exception e) {
			e.printStackTrace();
		}
       return new ResponseEntity<>(new ArrayList<Question>(), HttpStatus.BAD_REQUEST);
	}

	public List<Question> getDataByCategory(String category) {
		return questionDao.findByCategory(category);
	}

	public void addResponse(Question question) {
		questionDao.save(question);
	}

}

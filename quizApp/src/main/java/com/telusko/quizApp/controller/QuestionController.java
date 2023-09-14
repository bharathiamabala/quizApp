package com.telusko.quizApp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.telusko.quizApp.model.Question;
import com.telusko.quizApp.service.QuestionService;

@RestController
@RequestMapping("Question")
public class QuestionController {
	@Autowired
	QuestionService questionService;
	
	@GetMapping("allQuestions")
	@ResponseBody
	public ResponseEntity<List<Question>> getAllQuestions() {
		return questionService.getAllQuestions();
	}
	
	@GetMapping("category/{category}")
	@ResponseBody
	public List<Question> getDataByCategory(@PathVariable String category){
		return questionService.getDataByCategory(category);
	}

	@PostMapping("add")
	public String addQuestion(@RequestBody Question question) {
		questionService.addResponse(question);
		return "Success";
	}
}

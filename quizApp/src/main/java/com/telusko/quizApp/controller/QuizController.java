package com.telusko.quizApp.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("Quiz")
public class QuizController {
	
	@PostMapping("create")
	@ResponseBody
	public String createQuiz(@RequestParam String category, @RequestParam int numQ,
			@RequestParam String question) {
		return "success";
		
	}

}

package com.telusko.quizApp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Question {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String category;
	private String difficultLevel;
	private String optional1;
	private String optional2;
	private String optional3;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getDifficultLevel() {
		return difficultLevel;
	}

	public void setDifficultLevel(String difficultLevel) {
		this.difficultLevel = difficultLevel;
	}

	public String getOptional1() {
		return optional1;
	}

	public void setOptional1(String optional1) {
		this.optional1 = optional1;
	}

	public String getOptional2() {
		return optional2;
	}

	public void setOptional2(String optional2) {
		this.optional2 = optional2;
	}

	public String getOptional3() {
		return optional3;
	}

	public void setOptional3(String optional3) {
		this.optional3 = optional3;
	}

}

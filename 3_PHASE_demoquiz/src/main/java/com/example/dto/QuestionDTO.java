package com.example.dto;

import java.util.List;

import com.example.dto.QuestionDTO.CreatedBy;

public interface QuestionDTO {
	
	Long getId();
	CreatedBy getCreatedBy();
	String getQuestionText();
	String getCorrectAnswer();
	List<String> getAnswers();
	
	public interface CreatedBy {
		String getUsername();
	}

}

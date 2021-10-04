package com.fatou.survey3.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.fatou.survey3.Survey;
import com.fatou.survey3.model.Question;
import com.fatou.survey3.service.SurveyService;

@RestController
public class SurveyController {
	
	@Autowired
	private SurveyService diagne;
	
	@GetMapping("/surveys")
	public List<Survey> retrieveAllSurvey(){
		return diagne.retrieveAllSurveys();
		
	}
	@GetMapping("/surveys/{surveyId}/questions")
	public List<Question> retrieveAllQuestions(@PathVariable String surveyId){
		return diagne.retrieveQuestions(surveyId);
	}
	@GetMapping("/surveys/{surveyId}/questions/{questionId}")
	public Question retrieveOneQuestion(@PathVariable String surveyId, @PathVariable String questionId){
		return diagne.retrieveQuestion(surveyId, questionId);
	}
	
	
}

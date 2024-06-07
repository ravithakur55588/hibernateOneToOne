package com.univ;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "ques_table")
public class Question {
	
	@Id
	private int qid;
	private String question;
	
	@OneToOne
	private Answer answer;

	//default constructor
	public Question() {
		super();
		// TODO Auto-generated constructor stub
	}

	//parameterized constructor
	public Question(int qid, String question, Answer answer) {
		super();
		this.qid = qid;
		this.question = question;
		this.answer = answer;
	}

	//Getter - setter methods
	public int getQid() {
		return qid;
	}

	public void setQid(int qid) {
		this.qid = qid;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public Answer getAnswer() {
		return answer;
	}

	public void setAnswer(Answer answer) {
		this.answer = answer;
	}
	
}

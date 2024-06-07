package com.univ;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ans_table")
public class Answer {
	
	@Id
	private int aid;
	private String answer;
	
	//default constructor
	public Answer() {
		super();
		// TODO Auto-generated constructor stub
	}

	//parameterized constructor
	public Answer(int aid, String answer) {
		super();
		this.aid = aid;
		this.answer = answer;
	}

	//Getter - setter methods
	public int getAid() {
		return aid;
	}

	public void setAid(int aid) {
		this.aid = aid;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}
	
	
}

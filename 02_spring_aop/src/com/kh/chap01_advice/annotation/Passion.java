package com.kh.chap01_advice.annotation;

public class Passion {

	private int score;	// 열정 점수
	
	public Passion(int score) {
		this.score = score;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	@Override
	public String toString() {
		return "Passion [score=" + score + "]";
	}
	
}

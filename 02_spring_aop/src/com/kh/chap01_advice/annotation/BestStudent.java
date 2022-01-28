package com.kh.chap01_advice.annotation;

import org.springframework.stereotype.Component;

@Component
public class BestStudent implements Student{

	@Override
	public AchievementResult study(Passion passion) throws Exception {	
		// 오버라이드 한 메소드에 예외 발생 시켰기 때문에 Student 객체에도 예외 발생시켜줘야됨 
		
		if(passion.getScore() != 10) {
			throw new Exception("BestStudent는 열정이 MAX여야 합니다. 열정이 부족합니다! 다시 열정을 가지고 오세요!");
		}
		
		int understandingScore = 0;					// 이해도
		int satisfactionScore = 0; 					// 만족도
		double employeementRate = 0.0; 				// 취업률
		int passionScore = passion.getScore();		// 열정
		int difficulty = 10;						// 난이도
		
		for(int i = 1; i <= 6; i++) {
			System.out.println(i + "교시 수업을 열심히 듣습니다. 하지만 너무 어렵습니다.");
			System.out.println("이해도와 만족도가 열정에 비례하여 자꾸 떨어집니다.");
			understandingScore -= difficulty + passionScore;
			satisfactionScore -= difficulty + passionScore;
			
			System.out.println("하지만 신기하게 취업률은 올라가고 있습니다.");
			employeementRate += difficulty * passionScore;
			
			if(i ==  3) {
				System.out.println("밥을 먹으며 오늘 수업 내용을 떠올려봅니다. 밥을 코로 먹는지 입으로 먹는지 모르겠습니다.");
				employeementRate *= 2;
			}
		}
		
		return new AchievementResult(understandingScore, satisfactionScore, employeementRate);
	}
}

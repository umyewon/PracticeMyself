package com.kh.chap01_advice.xmlconfig;

public class NormalStudent implements Student{

	@Override
	public AchievementResult study(Passion passion) throws Exception {	
		// 오버라이드 한 메소드에 예외 발생 시켰기 때문에 Student 객체에도 예외 발생시켜줘야됨 
		
		if(passion.getScore() <= 0) {
			throw new Exception("열정이 부족합니다! 다시 열정을 가지고 오세요!");
		}
		
		int understandingScore = 0;					// 이해도
		int satisfactionScore = 0; 					// 만족도
		double employeementRate = 0.0; 				// 취업률
		int passionScore = passion.getScore();		// 열정
		int difficulty = 5;							// 난이도
		
		for(int i = 1; i <= 6; i++) {
			System.out.println(i + "교시 수업을 열심히 듣습니다. 오~ 프로그래밍이 뭔지 알 것 같습니다!");
			System.out.println("이해도와 만족도가 열정에 비례하여 자꾸 올라갑니다.");
			understandingScore += difficulty + passionScore;
			satisfactionScore += difficulty + passionScore;
			
			System.out.println("하지만 신기하게 취업률은 생각보다 오르지 않습니다. 취업난이 심각한가 봅니다.");
			employeementRate += difficulty + passionScore;
			
			if(i ==  3) {
				System.out.println("넷플릭스를 보면서 밥을 먹습니다. 역시 밥 친구~ 스트레스가 풀립니다.");
				understandingScore /= 2;
				satisfactionScore *= 2;
				employeementRate /= 2;
			}
		}
		
		return new AchievementResult(understandingScore, satisfactionScore, employeementRate);
	}

}

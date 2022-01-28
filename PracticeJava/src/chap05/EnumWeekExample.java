package chap05;

import java.util.Calendar;

public class EnumWeekExample {

	public static void main(String[] args) {

		// 열거 타입 변수 선언
		Week today = null;
		
		// 현재 날짜 리턴
		Calendar cal = Calendar.getInstance();
		int week = cal.get(Calendar.DAY_OF_WEEK);	// 오늘 요일 정수로 리턴 (1은 일요일, 2는 월요일..)
		System.out.println(week);
		
		switch(week) {
		case 1 : today = Week.SUNDAY; break;
		case 2 : today = Week.MONDAY; break;
		case 3 : today = Week.TUESDAY; break;
		case 4 : today = Week.WEDNSDAY; break;
		case 5 : today = Week.THURSDAY; break;
		case 6 : today = Week.FRIDAY; break;
		case 7 : today = Week.SATURDAY; break;
		}
		
		System.out.println("오늘 요일 : " + today);
		
		if(today == Week.WEDNSDAY) {
			System.out.println("오늘은 수요일,,");
		} else {
			System.out.println("오늘은 수요일이 아냐");
		}
		
		
		
		
	}

}

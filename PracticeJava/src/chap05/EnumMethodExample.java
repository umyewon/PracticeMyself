package chap05;

public class EnumMethodExample {

	public static void main(String[] args) {

		Week today = Week.SUNDAY;
		String name = today.name();  // 열거 객체의 문자열 리턴
		System.out.println(name);	 // SUNDAY
		
		int ordinal = today.ordinal();	// 열거 객체의 순번 리턴 (0부터 시작)
		System.out.println(ordinal);	// 6
		
		
		Week day1 = Week.MONDAY;
		Week day2 = Week.WEDNSDAY;
		int result1 = day1.compareTo(day2);	// 열거 객체를 비교해서 순번 차이를 리턴
		System.out.println(result1);	// 0 - 2 = -2
		
		int result2 = day2.compareTo(day1);
		System.out.println(result2); // 2 - 0 = 2
		
		Week weekDay = Week.valueOf("SUNDAY");
		if(weekDay == Week.SATURDAY || weekDay == Week.SUNDAY) {
			System.out.println("주말 이군요");
		} else {
			System.out.println("평일 이군요");
		}
		
		Week[] days = Week.values();
		for(Week day : days) {
			System.out.println(day);
		}
		
	}

}

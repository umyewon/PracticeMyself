package chap05;

public class EnumMethodExample {

	public static void main(String[] args) {

		Week today = Week.SUNDAY;
		String name = today.name();  // ���� ��ü�� ���ڿ� ����
		System.out.println(name);	 // SUNDAY
		
		int ordinal = today.ordinal();	// ���� ��ü�� ���� ���� (0���� ����)
		System.out.println(ordinal);	// 6
		
		
		Week day1 = Week.MONDAY;
		Week day2 = Week.WEDNSDAY;
		int result1 = day1.compareTo(day2);	// ���� ��ü�� ���ؼ� ���� ���̸� ����
		System.out.println(result1);	// 0 - 2 = -2
		
		int result2 = day2.compareTo(day1);
		System.out.println(result2); // 2 - 0 = 2
		
		Week weekDay = Week.valueOf("SUNDAY");
		if(weekDay == Week.SATURDAY || weekDay == Week.SUNDAY) {
			System.out.println("�ָ� �̱���");
		} else {
			System.out.println("���� �̱���");
		}
		
		Week[] days = Week.values();
		for(Week day : days) {
			System.out.println(day);
		}
		
	}

}

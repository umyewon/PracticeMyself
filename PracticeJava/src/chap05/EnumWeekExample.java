package chap05;

import java.util.Calendar;

public class EnumWeekExample {

	public static void main(String[] args) {

		// ���� Ÿ�� ���� ����
		Week today = null;
		
		// ���� ��¥ ����
		Calendar cal = Calendar.getInstance();
		int week = cal.get(Calendar.DAY_OF_WEEK);	// ���� ���� ������ ���� (1�� �Ͽ���, 2�� ������..)
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
		
		System.out.println("���� ���� : " + today);
		
		if(today == Week.WEDNSDAY) {
			System.out.println("������ ������,,");
		} else {
			System.out.println("������ �������� �Ƴ�");
		}
		
		
		
		
	}

}

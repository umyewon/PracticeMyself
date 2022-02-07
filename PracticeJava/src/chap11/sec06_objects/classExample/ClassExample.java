package chap11.sec06_objects.classExample;

public class ClassExample {

	public static void main(String[] args) {
		Car car = new Car();
		Class clazz1 = car.getClass();
		
		System.out.println("------��ü�κ��� ���------");
		System.out.println(clazz1.getName());		   // ��Ű���� + Ŭ������
		System.out.println(clazz1.getSimpleName());    // Ŭ������
		System.out.println(clazz1.getPackageName());   // ��Ű����
		
		System.out.println();
		System.out.println("------���ڿ��κ��� ���------");
		try {
			Class clazz2 = Class.forName("chap11.sec06_objects.classExample.Car");   // ��Ű���� + Ŭ������ Ǯ�� �ۼ��ؾߵ�
			System.out.println(clazz2.getName());		   // ��Ű���� + Ŭ������
			System.out.println(clazz2.getSimpleName());    // Ŭ������
			System.out.println(clazz2.getPackageName());   // ��Ű����
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}

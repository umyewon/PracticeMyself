package chap11.sec06_objects.classExample;

public class ClassExample {

	public static void main(String[] args) {
		Car car = new Car();
		Class clazz1 = car.getClass();
		
		System.out.println("------객체로부터 얻기------");
		System.out.println(clazz1.getName());		   // 패키지명 + 클래스명
		System.out.println(clazz1.getSimpleName());    // 클래스명
		System.out.println(clazz1.getPackageName());   // 패키지명
		
		System.out.println();
		System.out.println("------문자열로부터 얻기------");
		try {
			Class clazz2 = Class.forName("chap11.sec06_objects.classExample.Car");   // 패키지명 + 클래스명 풀로 작성해야됨
			System.out.println(clazz2.getName());		   // 패키지명 + 클래스명
			System.out.println(clazz2.getSimpleName());    // 클래스명
			System.out.println(clazz2.getPackageName());   // 패키지명
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}

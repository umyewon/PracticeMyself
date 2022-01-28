package chap06;

public class SingletonExample {

	public static void main(String[] args) {

		// Singleton obj1 = new Singleton();
		// Singleton obj2 = new Singleton();
		/* Singleton 클래스의 생성자는 private 접근 제한자로 외부에서 접근할 수 없게 
		 * 막아뒀기 때문에 사용 불가 */
		
		Singleton obj1 = Singleton.getInstance();
		Singleton obj2 = Singleton.getInstance();
		
		if(obj1 == obj2) {
			System.out.println("같은 singleton 객체입니다.");
		} else {
			System.out.println("다른 singleton 객체입니다.");
		}
	}

}

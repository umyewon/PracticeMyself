package chap11.sec06_finalize;

public class FinalizeExample {

	public static void main(String[] args) {
		Counter counter = null;
		
		for(int i = 1; i <= 50; i++) {
			counter = new Counter(i);
			counter = null;		// 생성과 동시에 쓰레기 객체로 만들어버림
			System.gc(); 		// 가비지 콜렉터를 빨리 실행시키기 위해 직접 호출
		}
		
		/* 결과
		 * - 순서대로 소멸시키지 않고 무작위로 소멸시킴
		 * */
		
	}

}

package chap11.sec06_objects;

public class ExitExample {

	public static void main(String[] args) {

		/* 자바 보안 관리자 설정 - 17버전 이후 사용 x
		System.setSecurityManager(new SecurityManager() {
			@Override
			public void checkExit(int status) {
				if(status != 5) {  // 5가 아닐 경우 종료 안 되게
					throw new SecurityException();
				}
			}
		}); 
		*/
		
		for(int i = 0; i < 10; i++) {
			System.out.println(i);
		
			try {
				System.exit(i);
			} catch (SecurityException e) {
				
			}
		}
		// 실행 순서 : System.exit(i) -> checkExit(int status) -> new SecurityException() -> catch(SecurityException e)
		
	}

}

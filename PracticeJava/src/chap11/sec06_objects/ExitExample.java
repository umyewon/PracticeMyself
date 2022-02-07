package chap11.sec06_objects;

public class ExitExample {

	public static void main(String[] args) {

		/* �ڹ� ���� ������ ���� - 17���� ���� ��� x
		System.setSecurityManager(new SecurityManager() {
			@Override
			public void checkExit(int status) {
				if(status != 5) {  // 5�� �ƴ� ��� ���� �� �ǰ�
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
		// ���� ���� : System.exit(i) -> checkExit(int status) -> new SecurityException() -> catch(SecurityException e)
		
	}

}

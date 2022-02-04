package chap10;

public class TryWithResourcesExample {

	public static void main(String[] args) {

		try(FileInputStream fis = new FileInputStream("file.txt")) {
			
			fis.read(); 
			// close()를 실행하지 않았지만 자동으로 실행 됨 

			throw new Exception();
		} catch(Exception e) {
			System.out.println("예외 처리 코드가 실행되었습니다.");
		}
		
		
	}

}

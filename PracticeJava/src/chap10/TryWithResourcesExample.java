package chap10;

public class TryWithResourcesExample {

	public static void main(String[] args) {

		try(FileInputStream fis = new FileInputStream("file.txt")) {
			
			fis.read(); 
			// close()�� �������� �ʾ����� �ڵ����� ���� �� 

			throw new Exception();
		} catch(Exception e) {
			System.out.println("���� ó�� �ڵ尡 ����Ǿ����ϴ�.");
		}
		
		
	}

}

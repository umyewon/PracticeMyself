package chap10;

public class FileInputStream implements AutoCloseable {	// try~with~resources �� ����ϱ� ���� 
	private String file;
	
	public FileInputStream (String file) {
		this.file = file;
	}

	public void read() {
		System.out.println(file +"�� �н��ϴ�.");
	}
	
	@Override
	public void close() throws Exception {
		System.out.println(file + "�� �ݽ��ϴ�.");
	}

}

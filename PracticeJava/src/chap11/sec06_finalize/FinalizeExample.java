package chap11.sec06_finalize;

public class FinalizeExample {

	public static void main(String[] args) {
		Counter counter = null;
		
		for(int i = 1; i <= 50; i++) {
			counter = new Counter(i);
			counter = null;		// ������ ���ÿ� ������ ��ü�� ��������
			System.gc(); 		// ������ �ݷ��͸� ���� �����Ű�� ���� ���� ȣ��
		}
		
		/* ���
		 * - ������� �Ҹ��Ű�� �ʰ� �������� �Ҹ��Ŵ
		 * */
		
	}

}

package chap07.fieldPolymorphism;

public class Tire {
	public int maxRotation;	// �ִ� ȸ���� (�ʰ� �� Ÿ�̾� ��ü �ʿ�)
	public int accumulatedRotation;	// ���� ȸ����
	public String location;	// Ÿ�̾��� ��ġ
	
	public Tire(String location, int maxRotation) {
		this.location = location;
		this.maxRotation = maxRotation;
	}
	
	public boolean roll() {
		++accumulatedRotation;
		if(accumulatedRotation < maxRotation) {
			System.out.println(location + "Tire ���� : " + (maxRotation - accumulatedRotation));
			return true;
		} else {
			System.out.println("***" + location + "Tire��ũ***");
			return false;
		}
	}
	
}

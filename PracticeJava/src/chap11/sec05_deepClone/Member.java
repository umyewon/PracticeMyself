package chap11.sec05_deepClone;

import java.util.Arrays;

public class Member implements Cloneable{
	public String name;
	public int age;
	public int[] scores;
	public Car car;
	
	public Member(String name, int age, int[] scores, Car car) {
		super();
		this.name = name;
		this.age = age;
		this.scores = scores;
		this.car = car;
	}
	
	// ���� ���� - ����Ÿ�Ե��� ���� �־���ߵ�
	@Override
	protected Object clone() throws CloneNotSupportedException {
		Member cloned = (Member) super.clone();  // super�� ������ ������ �Ʒ��� clone�� ����Ǿ� stackoverflow �߻��� super�� �ٿ� Object Ŭ������ clone�� ������Ѿߵ�
		cloned.scores = Arrays.copyOf(this.scores, this.scores.length);	 // => �迭�� �����ϴ� copyOf �޼ҵ�
		cloned.car = new Car(this.car.model);	// ���� Member��ü�� Car Ŭ������ ������ �����͸�(this.car.model) ���ο� Car ��ü�� �־���
	
		return cloned;
	}
	
	public Member getMember() {
		Member cloned = null;
		try {
			cloned = (Member) clone();   // ������ �������� clone()�޼ҵ� ����Ǿ� ���� ������ �߻�
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}	
	 
		return cloned;
	}
	
}

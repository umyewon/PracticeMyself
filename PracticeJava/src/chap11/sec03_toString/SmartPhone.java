package chap11.sec03_toString;

public class SmartPhone {
	private String company;
	private String os;
	
	public SmartPhone(String company, String os) {
		this.company = company;
		this.os = os;
	}
	
	// toString ¿Á¡§¿«
	@Override
	public String toString() {
		return company + ", " + os;
	}
}

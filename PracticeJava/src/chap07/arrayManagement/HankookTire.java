package chap07.arrayManagement;

public class HankookTire extends Tire {

	public HankookTire(String location, int maxRotation) {
		super(location, maxRotation);
	}

	@Override
	public boolean roll() {
		++accumulatedRotation;
		if(accumulatedRotation < maxRotation) {
			System.out.println(location + "HankookTire ¼ö¸í : " + (maxRotation - accumulatedRotation));
			return true;
		} else {
			System.out.println("***" + location + "HankookTireÆãÅ©***");
			return false;
		}
	}
}

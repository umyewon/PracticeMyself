package chap11.sec06_objects.reflecction;

public class Car {
	private String model;
	private String owner;
	
	public Car() {}
	
	public Car(String model, String owner) {
		super();
		this.model = model;
		this.owner = owner;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getOwner() {
		return owner;
	}

	private void setOwner(String owner) {
		this.owner = owner;
	}
	
}

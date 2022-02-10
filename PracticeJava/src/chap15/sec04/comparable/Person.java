package chap15.sec04.comparable;

public class Person implements Comparable<Person>{
	public String name;
	public int age;
	
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	// age 비교 (오름차순)
	@Override
	public int compareTo(Person o) {
		if(age < o.age) {
			return -1;
		} else if(age == o.age) {
			return 0;
		} else {
			return 1;
		}
	}

}

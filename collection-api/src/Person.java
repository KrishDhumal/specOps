
public class Person  {
	private String name;
	private int age;
	
	public Person() {
	}
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}

	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	
	/*public int compareTo(Person p) {
		return this.age - p.age;
	}*/
}



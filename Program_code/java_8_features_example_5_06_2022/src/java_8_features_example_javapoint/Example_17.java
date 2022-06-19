package java_8_features_example_javapoint;

import java.util.function.*;

class Student {
	private int id;
	private String name;
	private double age;

	public Student(int id, String name, double age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getAge() {
		return age;
	}

	public void setAge(double age) {
		this.age = age;
	}

	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + "]";

	}
}

public class Example_17 {

	public static void main(String[] args) {
		Supplier stusup=()->new Student(101,"java",29);
		Student student=(Student)stusup.get();
		System.out.println(student);
	}
}

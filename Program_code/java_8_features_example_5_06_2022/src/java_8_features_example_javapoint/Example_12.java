package java_8_features_example_javapoint;

interface FunctionalInterfaceRule {
	public void Say();//single abstract method

	default void show() {
		// this is default method
	}

	public static void display() {
		// this is static method
	}
}

public class Example_12 {

	public static void main(String[] args) {
	}
}

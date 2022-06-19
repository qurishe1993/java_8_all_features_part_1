package java_8_features_example_javapoint;

@FunctionalInterface
interface SaySomething3 {
	void say(String message);
}

public class Example_13 implements SaySomething3 {
	public void say(String message) {
		System.out.println(message);
	}
	public static void main(String[] args) {
		Example_13 e = new Example_13();
		e.say("hello");
	}
}

package java_8_features_example_javapoint;

interface SaySomething {
	public String say();
}

public class Example_3 {

	public static void main(String[] args) {
		SaySomething s = () -> {
			return "i have nothing to say";
		};

		System.out.println(s.say());
	}
}

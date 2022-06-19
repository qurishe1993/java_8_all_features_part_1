package java_8_features_example_javapoint;

@FunctionalInterface
interface SaySomething2 {
	String say(String message);
}

public class Example_8 {
	public static void main(String[] args) {
		// we can pass multiple statements in lambda expression
		SaySomething2 person = (message) -> {
			String str1 = "i would like to say";
			String str2 = str1 + message;
			return str2;
		};

		System.out.println(person.say(",hi everyone"));
	}
}

package java_8_features_example_javapoint;

interface SaySomething1 {
	public String say(String name);
}

public class Example_4 {
	public static void main(String[] args) {
		SaySomething1 s = (name) -> {
			return "Hello" + name + "Programming";
		};

		System.out.println(s.say(" java "));
	}
}

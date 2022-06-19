package java_8_features_example_javapoint;

interface Addable {
	public int add(int a, int b);
}

public class Example_6 {
	public static void main(String[] args) {
		Addable ad = (int a, int b) -> {
			return (a + b);
		};
		System.out.println("the result = " + ad.add(345, 505));
	}
}

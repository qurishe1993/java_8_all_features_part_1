package java_8_features_example_javapoint;

interface Summition {
	public int Sum(int a, int b);
}

public class Example_5 {
	public static void main(String[] args) {

		/*--here , lambda expression use without data type--*/
		Summition s = (a, b) -> (a + b);
		System.out.println("result is = " + s.Sum(13, 12));

		/*--here , lambda expression use with data type--*/
		Summition s1 = (int a, int b) -> (a + b);
		System.out.println("result is = " + s1.Sum(15, 12));

		/*--here , lambda expression use changing variable--*/
		Summition s2 = (int f, int g) -> (f + g);
		System.out.println("result is = " + s.Sum(25, 12));
	}
}

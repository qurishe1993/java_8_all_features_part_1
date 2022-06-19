package java_8_features_example_javapoint;
import java.util.function.*;

public class Example_14 {

	public static void main(String[] args) {
		Predicate<Integer> p = i -> i % 2 == 0;
		System.out.println(p.test(4));
		System.out.println(p.test(5));
	}
}

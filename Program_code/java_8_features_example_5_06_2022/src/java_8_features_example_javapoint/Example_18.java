package java_8_features_example_javapoint;
import java.util.function.*;
public class Example_18 {

	public static void main(String[] args) {
		BiConsumer<Integer, Integer> bicon=(a,b)->System.out.println(a+b);
		bicon.accept(10, 5);
	}
}

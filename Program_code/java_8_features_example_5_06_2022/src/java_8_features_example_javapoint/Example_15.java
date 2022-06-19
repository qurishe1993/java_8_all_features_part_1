package java_8_features_example_javapoint;
import java.util.function.*;

public class Example_15 {
	public static void main(String[] args) {
		
		Function<Integer, Integer> f=i->i*i;
		System.out.println("The Square = " +f.apply(4));
		System.out.println("The Square = " +f.apply(5));
	}
}

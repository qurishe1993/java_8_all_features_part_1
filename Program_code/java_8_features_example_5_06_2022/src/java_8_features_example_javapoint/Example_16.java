package java_8_features_example_javapoint;
import java.util.function.*;

public class Example_16 {
	public static void main(String[] args) {
		Consumer<String> con = x -> System.out.println(x);
		con.accept("java");
	}
}

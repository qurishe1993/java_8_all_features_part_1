package java_8_features_example_javapoint;

import java.util.*;

public class Example_7 {

	public static void main(String[] args) {
		List<String> list = new ArrayList();
		list.add("hello");
		list.add("java");
		list.add("programming");
		list.add("language");

		list.forEach(n->System.out.println(n));
	}
}

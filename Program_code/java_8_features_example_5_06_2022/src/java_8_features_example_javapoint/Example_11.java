package java_8_features_example_javapoint;

import java.util.*;
import java.util.stream.*;

class Product1 {
	int id;
	String name;
	double price;

	public Product1(int id, String name, double price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}
}

public class Example_11 {

	public static void main(String[] args) {
		List<Product1> list = new ArrayList<Product1>();
		// adding list value
		list.add(new Product1(101, "Dell", 25000));
		list.add(new Product1(105, "Asus", 65000));
		list.add(new Product1(104, "Monitor", 6500));
		list.add(new Product1(103, "keyboard", 350));
		list.add(new Product1(102, "Ram", 1200));

		// using lambda to filter data
		Stream<Product1> filter_data = list.stream().filter(p -> p.price > 300 && p.price < 25000);

		filter_data.forEach(product -> System.out.println(product.id + " " + product.name + " " + product.price));

	}
}

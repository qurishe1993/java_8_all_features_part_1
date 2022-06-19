package java_8_features_example_javapoint;

import java.util.*;

class Product5 {
	int id;
	String name;
	double price;

	public Product5(int id, String name, double price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}
}

public class Example_21 {

	public static void main(String[] args) {
		List<Product5> product_list = new ArrayList<Product5>();
		// adding list value
		product_list.add(new Product5(101, "Dell", 25000));
		product_list.add(new Product5(105, "Asus", 65000));
		product_list.add(new Product5(104, "Monitor", 6500));
		product_list.add(new Product5(103, "keyboard", 350));
		product_list.add(new Product5(102, "Ram", 1200));
		
		// This is more compact approach for filtering data
		product_list.stream()
		.filter(p->p.price==25000)
		.forEach(p->System.out.println(p.name));
	}
}

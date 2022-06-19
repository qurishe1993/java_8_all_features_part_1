package java_8_features_example_javapoint;

import java.util.*;

class Product {
	int id;
	String name;
	double price;

	public Product(int id, String name, double price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}
}

public class Example_10 {
	public static void main(String[] args) {

		List<Product> list = new ArrayList<Product>();
		// add the product in list
		list.add(new Product(101, "Dell", 25000));
		list.add(new Product(105, "Asus", 65000));
		list.add(new Product(104, "Monitor", 6500));
		list.add(new Product(103, "keyboard", 350));
		list.add(new Product(102, "Ram", 1200));

		System.out.println("Sorting on the basis of name");
		
		//here, used lambda expression
		Collections.sort(list, (p1, p2) -> {
			return p1.name.compareTo(p2.name);
		});

		for (Product p : list) {
			System.out.println(p.id + " " + p.name + " " + p.price);
		}
	}
}

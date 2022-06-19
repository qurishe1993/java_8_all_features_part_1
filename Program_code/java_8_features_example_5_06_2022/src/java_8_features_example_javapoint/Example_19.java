package java_8_features_example_javapoint;

import java.util.*;

class Product3 {
	int id;
	String name;
	double price;

	public Product3(int id, String name, double price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}
}

public class Example_19 {

	public static void main(String[] args) {
		List<Product3> product_list = new ArrayList<Product3>();
		// adding list value
		product_list.add(new Product3(101, "Dell", 25000));
		product_list.add(new Product3(105, "Asus", 65000));
		product_list.add(new Product3(104, "Monitor", 6500));
		product_list.add(new Product3(103, "keyboard", 350));
		product_list.add(new Product3(102, "Ram", 1200));

		List<Double> product_price_list = new ArrayList<Double>();

		// filtering data from list
		for (Product3 product : product_list) {
			if (product.price < 30000) {
				// adding price to product_price_list
				product_price_list.add(product.price);
			}
		}

		System.out.println(product_price_list);

	}
}

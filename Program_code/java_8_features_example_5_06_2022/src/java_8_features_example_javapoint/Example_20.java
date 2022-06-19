package java_8_features_example_javapoint;
import java.util.*;
import java.util.stream.Collectors;

class Product4{
	int id; 
	String name;
	double price;
	public Product4(int id, String name, double price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}
}
public class Example_20 {

	public static void main(String[] args) {
		List<Product4> product_list = new ArrayList<Product4>();
		// adding list value
		product_list.add(new Product4(101, "Dell", 25000));
		product_list.add(new Product4(105, "Asus", 65000));
		product_list.add(new Product4(104, "Monitor", 6500));
		product_list.add(new Product4(103, "keyboard", 350));
		product_list.add(new Product4(102, "Ram", 1200));
		
		List<Double> product_price_list=product_list.stream()
				.filter(p->p.price<30000)//filtering data
				.map(p->p.price)//fetching data
				.collect(Collectors.toList());//collecting as list
		System.out.println(product_price_list);
	}
}

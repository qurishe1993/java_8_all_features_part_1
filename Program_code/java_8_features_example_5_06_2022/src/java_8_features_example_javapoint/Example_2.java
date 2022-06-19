package java_8_features_example_javapoint;

/*--firstly we declare a interface which name is Drawable2--*/
/*--and this example have a one single abstract method--*/

interface Drawable2 {
	public void draw();
}

public class Example_2 {

	public static void main(String[] args) {
		int width = 10;

		// here used in lambda expression
		Drawable2 d = () -> {
			System.out.println("Drawing : " + width);
		};

		d.draw();
	}
}

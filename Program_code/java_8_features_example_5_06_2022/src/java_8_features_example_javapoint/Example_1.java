package java_8_features_example_javapoint;

/*--firstly we declare a interface which name is Drawable--*/
/*--and this example have a one single abstract method--*/
interface Drawable1 {
	public void draw();
}

public class Example_1 {

	public static void main(String[] args) {
		int width = 10;
		/*--without lambda , Drawable1 implementation using anonymous class--*/
		Drawable1 d = new Drawable1() {
			public void draw() {
				System.out.println("Drawing : " + width);
			}
		};
		d.draw();
	}
}

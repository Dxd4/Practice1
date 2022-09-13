package Practice1.Shapes;

public class Main {
	public static void main(String[] args) {
		Shape[] shapes = new Shape[2];
		shapes[0] = new Circle("red",1,2);
		shapes[1] = new Rectangle("blue", 1,2,3,4);

		for (Shape shape : shapes) {
			shape.draw();
		}
	}
}

package Practice1.Shapes;

public class Circle extends Shape {
	private int x;
	private int y;

	public Circle(String color, int x, int y) {
		super(color);
		this.x = x;
		this.y = y;
	}

	public int getx() {
		return x;
	}

	public void setx(int x) {
		this.x = x;
	}

	public int gety() {
		return y;
	}

	public void sety(int y) {
		this.y = y;
	}

	@Override
	public void draw() {
		System.out.printf("Circle color: %s, x: %d, y: %d\n", this.getColor(), this.getx(), this.gety());
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		Circle circle = (Circle) o;

		if (x != circle.x) return false;
		return y == circle.y;
	}

}

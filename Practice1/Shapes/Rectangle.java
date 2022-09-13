package Practice1.Shapes;

public class Rectangle extends Shape {
	private int x;
	private int y;
	private int height;
	private int width;

	public Rectangle(String color, int x, int y, int height, int width) {
		super(color);
		this.x = x;
		this.y = y;
		this.height = height;
		this.width = width;
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

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	@Override
	public void draw() {
		System.out.printf("Rectangle color: %s, x: %d, y: %d, height: %d, width: %d\n", this.getColor(), this.getx(), this.gety(), this.getHeight(), this.getWidth());
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		Rectangle rectangle = (Rectangle) o;

		if (x != rectangle.x) return false;
		if (y != rectangle.y) return false;
		if (height != rectangle.height) return false;
		return width == rectangle.width;
	}
}

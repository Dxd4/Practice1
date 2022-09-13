package Practice1.Shapes;

public class Rectangle extends Shape {
	private int top;
	private int left;
	private int height;
	private int width;

	public Rectangle(String color, int top, int left, int height, int width) {
		super(color);
		this.top = top;
		this.left = left;
		this.height = height;
		this.width = width;
	}

	public int getTop() {
		return top;
	}

	public void setTop(int top) {
		this.top = top;
	}

	public int getLeft() {
		return left;
	}

	public void setLeft(int left) {
		this.left = left;
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
		System.out.printf("Rectangle color: %s, top: %d, left: %d, height: %d, width: %d\n", this.getColor(), this.getTop(), this.getLeft(), this.getHeight(), this.getWidth());
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		Rectangle rectangle = (Rectangle) o;

		if (top != rectangle.top) return false;
		if (left != rectangle.left) return false;
		if (height != rectangle.height) return false;
		return width == rectangle.width;
	}
}

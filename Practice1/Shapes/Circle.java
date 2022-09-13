package Practice1.Shapes;

public class Circle extends Shape {
	private int xCenter;
	private int yCenter;

	public Circle(String color, int xCenter, int yCenter) {
		super(color);
		this.xCenter = xCenter;
		this.yCenter = yCenter;
	}

	public int getxCenter() {
		return xCenter;
	}

	public void setxCenter(int xCenter) {
		this.xCenter = xCenter;
	}

	public int getyCenter() {
		return yCenter;
	}

	public void setyCenter(int yCenter) {
		this.yCenter = yCenter;
	}

	@Override
	public void draw() {
		System.out.printf("Circle color: %s, xCenter: %d, yCenter: %d\n", this.getColor(), this.getxCenter(), this.getyCenter());
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		Circle circle = (Circle) o;

		if (xCenter != circle.xCenter) return false;
		return yCenter == circle.yCenter;
	}

}

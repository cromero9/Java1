public class TestInterface {

	public static void main(String[] args) {

		
		Rectangle r = new Rectangle(5, 7.5);
		Circle c = new Circle(10);
		System.out.println("Rectangle area: " + r.getArea());
		System.out.println("Circle area: " + c.getArea());

		if (c.equals(r)){
			System.out.println("The areas are equal");
		}

		if (c.isGreater(r)){
			System.out.println("Area of the circle is greater than area of the rectangle");
		}

		if (c.isLess(r)){
			System.out.println("Area of the circle is smaller than area of the rectangle");
		}
	}
}

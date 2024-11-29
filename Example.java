
public class Example {

	public static void main(String[] args) {
		CircleImpl obj=new CircleImpl();
		obj.setRadius(45.6);
		System.out.println("Radius :"+obj.getRadius());
		System.out.println("Area of circle :"+obj.aoc());
		obj.setLength(10.24);
		obj.setWidth(11.23);
		System.out.println("Length :"+obj.getLength());
		System.out.println("Width :"+obj.getWidth());
		System.out.println("Area of rectangle :"+obj.aor());

	}

}


public class FinalTest {
	public static void main(String[] args) {
		Circle c1 = new Circle(23.3f);
		System.out.println(c1.calculateArea());
		
		Oval o1 = new Oval(23, 43);
		System.out.println(o1.calculateArea());
	}
}


class Circle{
	final float PI = 3.14f;
	float radius;
	
	public Circle(float radius) {
		this.radius = radius;
	}
	
	public float calculateArea() {
		return PI * radius * radius;
	}
	
	public final void fillColor() {
		System.out.println("filling the color!");
	}
}

final class Oval extends Circle{
	float verticalRadius;
	
	public Oval(float radius, float verticalRadius) {
		super(radius);
		this.verticalRadius = verticalRadius;
	}
	
	public float calculateArea() {
		return  PI * radius * verticalRadius;
	}
	
}



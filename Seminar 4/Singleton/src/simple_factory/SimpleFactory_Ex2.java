package simple_factory;

public class SimpleFactory_Ex2 {
}

interface Shape{
	void draw();
}

class Circle implements Shape{
	@Override
	public void draw() {System.out.println("Circle");};
}

class Square implements Shape{
	@Override
	public void draw() {System.out.println("Square");}
}

class ShapeFactory{
	public static Shape createShape(String type) {
		if("Circle".equalsIgnoreCase(type)) {
			return new Circle();
		} else if("Square".equalsIgnoreCase(type)) {
			return new Square();
		} else {
			throw new IllegalArgumentException("Invalid shape type");
		}
	}
}

class MainEx2{
	public static void main(String[] args) {
		Shape circle = ShapeFactory.createShape("Circle");
		circle.draw();
		
		Shape square = ShapeFactory.createShape("Square");
		square.draw();
	}
}

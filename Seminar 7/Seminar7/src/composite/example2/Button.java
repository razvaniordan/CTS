package composite.example2;

public class Button implements GUIComponent {
	public Button() {}
	
	@Override
	public void draw() {
		System.out.println("Draw: " + this);
	}
	
}

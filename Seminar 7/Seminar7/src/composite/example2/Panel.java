package composite.example2;

import java.util.ArrayList;
import java.util.List;

public class Panel implements GUIComponent {
	private List<GUIComponent> items = new ArrayList<>();
	
	public Panel() {}
	
	public void addComponent(GUIComponent component) {
		items.add(component);
	}
	@Override
	public void draw() {
		System.out.println("Panel: " + this);
		for(GUIComponent component : items) {
			component.draw();
		}
	}
	
}

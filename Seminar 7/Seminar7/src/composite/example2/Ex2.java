package composite.example2;

public class Ex2 {

	public static void main(String[] args) {
		
		Button button1 = new Button();
		Button button2 = new Button();
		Button button3 = new Button();
		
		Panel panel = new Panel();
		
		panel.addComponent(button1);
		panel.addComponent(button2);
		panel.addComponent(button3);
		
		panel.draw();
	}

}

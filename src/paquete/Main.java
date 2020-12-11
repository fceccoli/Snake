package paquete;

public class Main {

	public static void main(String[] args) {
		Window window = Window.getWindow();
		
		window.setLocationRelativeTo(null);
		
		Thread thread = new Thread(window);
		thread.start();
	}
	
}

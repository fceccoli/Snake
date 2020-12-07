package paquete;

import java.awt.image.BufferedImage;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.io.File;

import javax.imageio.ImageIO;

public class MenuScene extends Scene{
	
	
	public KL keyListener;
	public BufferedImage title, play, playPressed, exit, exitPressed;
	
	public MenuScene(KL keyListener) {
		this.keyListener = keyListener;
		
		
		try {
			BufferedImage spritesheet = ImageIO.read(new File("assets/menuSprite.png"));
			title = spritesheet.getSubimage(0, 242, 960, 240);
			play = spritesheet.getSubimage(0, 121, 261, 121);
			playPressed = spritesheet.getSubimage(264, 121, 261, 121);
			exit = spritesheet.getSubimage(0, 0, 233, 93);
			exitPressed = spritesheet.getSubimage(264, 0, 233, 93);
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	
	@Override
	public void update(double dt) {
		if (keyListener.isKeyPressed(KeyEvent.VK_UP)) {
			System.out.println("Up arrow is pressed");
		}
		
	}

	@Override
	public void draw(Graphics g) {
		g.setColor(Color.GREEN);
		g.fillRect(0, 0, Constants.SCREEN_WIDTH, Constants.SCREEN_HEIGHT);
		
		g.drawImage(title, 40, 40, 300, 100, null);
	}

}
 
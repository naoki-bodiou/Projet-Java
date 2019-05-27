package model.Entity;

import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Wall extends Entity{
/** The Boolean isvisible */
	private boolean isvisible;
	
	/**
	 * Constructor of the Wall class initializes the parameters of the Level's Wall.
	 * 
	 *  @param X 
	 *  	Used to initializes the position X
	 *  @param Y
	 *  	Used to initializes the position Y
	 */
		public Wall(int X, int Y) {
		this.isMovable = false;
		this.canBeDestroyed = false;
		this.canBePushed = false;
		try {
			spritePath = ImageIO.read(new File("C:\\Users\\Naoki\\Desktop\\Projet JAVA CESI\\ressource\\wall.png"));
			}catch(IOException e) {
				e.printStackTrace();
			}
		this.posX = X;
		this.posY = Y;
	}
		
}

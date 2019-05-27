package model.Entity;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Character extends Entity{
	
	/**
	 * Constructor of the Diamond class initializes the parameters of the Diamond.
	 * 
	 *  @param X 
	 *  	Used to initializes the position X
	 *  @param Y
	 *  	Used to initializes the position Y
	 */
	
	public Character(int X, int Y) {
		this.isMovable = true;
		this.canBeDestroyed = true;
		this.canBePushed = false;
		try {
			this.spritePath = ImageIO.read(new File("C:\\Users\\Naoki\\Desktop\\Projet JAVA CESI\\ressource\\character.png"));
			}catch(IOException e) {
				e.printStackTrace();
			}
		this.posX = X;
		this.posY = Y;
	}
}

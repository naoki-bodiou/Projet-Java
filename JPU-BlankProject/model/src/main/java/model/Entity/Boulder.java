package model.Entity;
/**
 * 
 * @author Naoki
 *
 */
public class Boulder extends Entity
{
	/**
	 * Constructor of the Boulder object.
	 * 
	 * @param x
	 * 		The horizontal position.
	 * @param y
	 * 		The vertical position.
	 */
	public Boulder(int x, int y) 
	{
		this.canBeDestroyed = false;
		this.isMobile = false;
		this.canBePushed = false;
		this.spritePath = "/main/resources/boulder.png";
		
		this.posX = x;
		this.posY = y;		
	}
}
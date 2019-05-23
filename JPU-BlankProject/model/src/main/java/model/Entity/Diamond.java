package model.Entity;
/**
 * 
 * @author Naoki
 *
 */
public class Diamond extends Entity
{
	/**
	 * Constructor of the Diamond object.
	 * 
	 * @param x
	 * 		The horizontal position.
	 * @param y
	 * 		The vertical position.
	 */
	public Diamond(int x, int y)
	{
		this.canBeDestroyed = true;
		this.isMobile = false;
		this.canBePushed = false;
		this.spritePath = "/main/resources//diamond.png";
		
		this.posX = x;
		this.posY = y;	
	}
}
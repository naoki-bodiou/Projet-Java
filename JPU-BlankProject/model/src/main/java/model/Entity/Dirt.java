package model.Entity;
/**
 * 
 * @author Naoki
 *
 */
public class Dirt extends Entity
{
	/**
	 * Constructor of the Dirt object.
	 * 
	 * @param x
	 * 		The horizontal position.
	 * @param y
	 * 		The vertical position.
	 */
	public Dirt(int x, int y)
	{
		this.canBeDestroyed = true;
		this.isMobile = false;
		this.canBePushed = false;
		
		this.posX = x;
		this.posY = y;
	}
}
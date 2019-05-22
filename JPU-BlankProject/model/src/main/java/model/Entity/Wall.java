package model.Entity;
/**
 * 
 * @author Naoki
 *
 */
public class Wall extends Entity
{
	/**
	 * Constructor of the Wall Object.
	 * 
	 * @param x
	 *		The horizontal position.
	 * @param y
	 * 		The vertical position.
	 */
	public Wall(int x, int y)
	{
		this.canBeDestroyed = false;
		this.isMobile = false;
		this.canBePushed = false;
		
		this.posX = x;
		this.posY = y;
	}
}
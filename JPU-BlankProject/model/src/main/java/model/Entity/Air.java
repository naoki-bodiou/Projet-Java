package model.Entity;
/**
 * 
 * @author Naoki
 *
 */
public class Air extends Entity 
{
	/**
	 * Constructor of the Air object.
	 * 
	 * @param x
	 * 		The horizontal position.
	 * @param y
	 * 		The vertical position.
	 */
	public Air(int x, int y)
	{
		this.canBeDestroyed = true;
		this.isMobile = false;
		this.canBePushed = false;
		
		this.posX = x;
		this.posY = y;
	}
}
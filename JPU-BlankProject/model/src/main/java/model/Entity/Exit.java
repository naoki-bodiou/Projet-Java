package model.Entity;
/**
 * 
 * @author Naoki
 *
 */
public class Exit extends Entity
{
	public boolean isVisible;
	
	/**
	 * Constructor of the Exit object.
	 * 
	 * @param x
	 * 		The horizontal position.
	 * @param y
	 * 		The vertical position.
	 */
	public Exit(int x, int y)
	{
		this.canBeDestroyed = true;
		this.isMobile = false;
		this.canBePushed = false;
		this.isVisible = false;
		
		this.posX = x;
		this.posY = y;
	}
}
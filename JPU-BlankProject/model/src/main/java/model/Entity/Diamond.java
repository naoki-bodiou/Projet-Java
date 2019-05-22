package model.Entity;

public class Diamond extends Entity
{
	public Diamond(int x, int y)
	{
		this.canBeDestroyed = true;
		this.isMobile = false;
		this.canBePushed = false;
		
		this.posX = x;
		this.posY = y;	
	}
}
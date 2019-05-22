package model.Entity;

public class Air extends Entity 
{
	public Air(int x, int y)
	{
		this.canBeDestroyed = true;
		this.isMobile = false;
		this.canBePushed = false;
		
		this.posX = x;
		this.posY = y;
	}
}
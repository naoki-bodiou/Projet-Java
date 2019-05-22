package model.Entity;

public class Exit extends Entity
{
	public boolean isVisible;
	
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
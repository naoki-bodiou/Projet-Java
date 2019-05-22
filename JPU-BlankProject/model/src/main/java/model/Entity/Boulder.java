package model.Entity;

public class Boulder extends Entity
{
	public Boulder(int x, int y) 
	{
		this.canBeDestroyed = false;
		this.isMobile = false;
		this.canBePushed = false;
		
		this.posX = x;
		this.posY = y;		
	}
}
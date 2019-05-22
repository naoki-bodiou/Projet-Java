package model.Entity;

public class Dirt extends Entity
{
	public Dirt(int x, int y)
	{
		this.canBeDestroyed = true;
		this.isMobile = false;
		this.canBePushed = false;
		
		this.posX = x;
		this.posY = y;
	}
}
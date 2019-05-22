package model.Entity;

public class Wall extends Entity
{
	public Wall(int x, int y)
	{
		this.canBeDestroyed = false;
		this.isMobile = false;
		this.canBePushed = false;
		
		this.posX = x;
		this.posY = y;
	}
}
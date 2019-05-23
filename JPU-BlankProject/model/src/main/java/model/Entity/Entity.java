package model.Entity;
/**
 * 
 * @author Naoki
 *
 */
public abstract class Entity 
{
	public boolean isMobile;
	public boolean canBePushed;
	public boolean canBeDestroyed;
	public String spritePath;
	
	public int posX;
	public int posY;
	
	public Entity()
	{
		
	}
}
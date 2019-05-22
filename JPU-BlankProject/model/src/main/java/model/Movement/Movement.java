package model.Movement;
import model.Entity.Entity;
/**
 * 
 * @author Naoki
 *
 */
public class Movement 
{
	public Movement()
	{
		
	}
	/**
	 * checkIsMobile check if the object is mobile/ can move.
	 * 
	 * @param entity
	 * 		The type of entity in front of the character.
	 * @return
	 * 		Return true if the object can move and false if the object can't move.
	 */
	public boolean checkIsMobile(Entity entity)
	{
		if (entity.isMobile = true)
			return true;
		else
			return false;
	}
	
	/**
	 * checkCanBePushed check if the object can be Pushed.
	 * @param entity
	 * 		The type of entity in front of the character.
	 * @return
	 * 		Return true if the object can be pushed and false if the object can't be pushed.
	 */
	public boolean checkCanBePushed(Entity entity)
	{
		if (entity.canBePushed = true)
			return true;
		else
			return false;
	}
	
	/**
	 * checkCanBeDestroyed check if the object can be destroyed.
	 * @param entity
	 * 		The type of entity in front of the character.
	 * @return
	 * 		Return true if the object can be destroyed and false if the can't be destroyed.
	 */
	public boolean checkCanBeDestroyed(Entity entity)
	{
		if (entity.canBeDestroyed = true)
			return true;
		else
			return false;
	}
	
	public void movement(int keycode)
	{
		
	}
}
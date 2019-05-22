package model.Movement;

import model.Entity.Entity;

public class Movement 
{
	public Movement()
	{
		
	}
	
	public boolean checkIsMobile(Entity entity)
	{
		if (entity.isMobile = true)
			return true;
		else
			return false;
	}
	
	public boolean checkCanBePushed(Entity entity)
	{
		if (entity.canBePushed = true)
			return true;
		else
			return false;
	}
	
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
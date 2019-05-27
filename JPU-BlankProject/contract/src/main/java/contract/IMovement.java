package contract;

import entity.Entity;

public interface IMovement {

	public boolean checkCanBePushed(Entity entity);

	public boolean checkCanBeMovable(Entity entity);

	/**
	 * Check if the entity can be destroyed.
	 *
	 * @param Entity The Entity
	 * 
	 * @return A boolean
	 * 
	 */
	public boolean checkCanBeDestroyed(Entity entity);
}

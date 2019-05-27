package model;

import contract.IMovement;
import entity.Entity;

public class Movement implements IMovement {

	public boolean checkCanBePushed(Entity entity) {
		if (entity.canBePushed == true) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * Check if the entity can be moved.
	 * 
	 * @param Entity The Entity
	 * 
	 * @return Returns a boolean
	 * 
	 */
	public boolean checkCanBeMovable(Entity entity) {
		if (entity.isMovable == true) {
			return true;
		} else {
			return false;
		}
	}

	public boolean checkCanBeDestroyed(Entity entity) {
		if (entity.getCanBeDestroyed() == true) {
			return true;
		} else {
			return false;
		}
	}
}

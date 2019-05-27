package model.Movement;

import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import model.Entity.*;
import model.Entity.Character;
import model.Model;

/*
 * @author rodri
 * 
 */
public class Movement{
	
	Character character;
	Model model;
	
	public void swap(Entity[][] tabEntity, Image[][] tabImage) {
		for(int y = 0; y < 22; y++) {
			for(int x = 0; x < 40; x++) {
				if(tabEntity[y][x] instanceof Character) {
					System.out.println("bonjour " + x + " " + y);
				}
			}
		}
	}
	
	public void setPositionY() {
		System.out.println("bonour");
		this.character.posY = this.character.posY - 32;
		swap(model.getTabEntity(), model.getMap());
	}
	/*
	 * 		Check if the entity can be pushed.
	 * 
	 * @param Entity
	 * 		The Entity
	 * 
	 * @return
	 * 		Returns a boolean
	 * 
	 */
	public boolean checkCanBePushed(Entity entity) {
		if(entity.canBePushed = true) {
			return true;
		}else {
			return false;
		}
	}
	/*
	 * 		Check if the entity can be moved.
	 * 
	 * @param Entity
	 * 		The Entity 
	 * 
	 * @return
	 * 		Returns a boolean
	 * 
	 */
	public boolean checkCanBeMovable(Entity entity) {
		if(entity.isMovable = true) {
			return true;
		}else {
			return false;
		}
	}
	/*
	 * 		Check if the entity can be destroyed.
	 *
	 * @param Entity
	 * 		The Entity
	 * 
	 * @return
	 * 		A boolean
	 * 
	 */
	public boolean checkCanBeDestroyed(Entity entity) {
		if(entity.canBeDestroyed = true) {
			return true;
		}else {
			return false;
		}
	}
	
}
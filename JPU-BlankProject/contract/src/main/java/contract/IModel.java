package contract;

import java.awt.Image;
import java.util.Observable;

import entity.Character;
import entity.Entity;

/**
 * The Interface IModel.
 *
 * @author Jean-Aymeric Diet
 */
public interface IModel {

	String getTabLine(int i, int j);

	Image getMap(int i, int j);

	Image[][] getMap();

	Entity[][] getTabEntity();
	
	public void setTabEntity(Entity[][] tabEntity);
	
	public void setMap(Image[][] map);
	
	public int[][] getTabBoulder();
	
	public void setTabEntity(int i, int j, Entity entity);
	
	public void setMap(int i, int j, Image image);

	int getLevel();

	void loadMap(int i);

	public int getPosY();

	public int getPosX();

	public void setPosY(int i);
	
	public Character getCharacter();
	
	public int getDoorX();
	
	public int getDoorY();

	/**
	 * thjkbkbznfkze
	 */
	public void setPosX(int i);

	public void update();

	/**
	 * Gets the observable.
	 *
	 * @return the observable
	 */
	Observable getObservable();
}

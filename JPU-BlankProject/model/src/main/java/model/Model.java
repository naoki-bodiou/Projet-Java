package model;

import java.awt.Image;
import java.sql.SQLException;
import java.util.Observable;

import contract.IModel;
import entity.Air;
import entity.Boulder;
import entity.Character;
import entity.Diamond;
import entity.Dirt;
import entity.Door;
import entity.Entity;
import entity.Wall;

/**
 * The Class Model.
 *
 * @author Jean-Aymeric Diet
 */
public final class Model extends Observable implements IModel {

	/** The Wall */
	Wall wall;
	Dirt dirt;
	Boulder boulder;
	Diamond diamond;
	Air air;
	Character character;

	public Character getCharacter() {
		return character;
	}

	Door door;

	int level = 0;

	int DoorX;
	int DoorY;

	public int getDoorX() {
		return DoorX;
	}

	public int getDoorY() {
		return DoorY;
	}

	private String[] TabLine = new String[22];
	private String[] TabLine2 = new String[40];
	private String[][] TabMap = new String[22][40];
	private Entity[][] TabEntity = new Entity[22][40];
	private Image[][] Map = new Image[22][40];
	private int[][] tabBoulder = new int[2][100];

	/**
	 * Instantiates a new model.
	 */

	public Model() {
	}

	/**
	 * Gets the hello world.
	 *
	 * @return the hello world
	 */
	/*
	 * (non-Javadoc)
	 *
	 * @see contract.IModel#getMessage()
	 */
	public String getTabLine(int i, int j) {
		return TabMap[i][j];
	}

	public void update() {
		this.setChanged();
		this.notifyObservers();
	}
	/**
	 * Sets the hello world.
	 *
	 * @param helloWorld the new hello world
	 */

	/*
	 * private void setTabLine(String line, int nb) { this.TabLine[nb] = line;
	 * this.setChanged(); this.notifyObservers(); }
	 */

	/**
	 * Load Map.
	 *
	 */
	/*
	 * (non-Javadoc)
	 *
	 * @see contract.IModel#getMessage(java.lang.String)
	 */
	public void loadMap(int map) {
		setLevel(map);
		try {
			final DAOMap daoLine = new DAOMap(DBConnection.getInstance().getConnection());
			for (int i = 0; i < 22; i++) {
				TabLine[i] = daoLine.find(i + 1, map);
			}
			splitTab(TabLine);
			instanceObject(TabMap);
		} catch (final SQLException e) {
			e.printStackTrace();
		}
		update();
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public int getPosX() {
		return character.posX;
	}

	public int getPosY() {
		return character.posY;
	}

	public void setPosX(int i) {
		character.posX = character.posX + i;
	}

	public void setPosY(int i) {
		character.posY = character.posY + i;
	}

	/**
	 * instanceObject
	 * 
	 * The function instanceObject instance Object and load the Image in the array
	 * Map[][].
	 * 
	 * @param tabMap The parameter tabMap is used to create Object depending on the
	 *               letter it contains.
	 * 
	 */
	public void instanceObject(String[][] tabMap) {
		int b = 0;
		for (int i = 0; i < 22; i++) {
			for (int j = 0; j < 40; j++) {
				switch (tabMap[i][j]) {
				case "M":
					this.wall = new Wall(i, j);
					TabEntity[i][j] = this.wall;
					Map[i][j] = this.wall.getSpritePath();
					break;
				case "T":
					this.dirt = new Dirt(i, j);
					TabEntity[i][j] = this.dirt;
					Map[i][j] = this.dirt.getSpritePath();
					break;
				case "D":
					this.diamond = new Diamond(i, j);
					TabEntity[i][j] = this.diamond;
					Map[i][j] = this.diamond.getSpritePath();
					break;
				case "C":
					this.boulder = new Boulder(i, j);
					TabEntity[i][j] = this.boulder;
					Map[i][j] = this.boulder.getSpritePath();
					tabBoulder[0][b] = j;
					tabBoulder[1][b] = i;
					b++;
					break;
				case "E":
					this.wall = new Wall(i, j);
					TabEntity[i][j] = this.wall;
					Map[i][j] = this.wall.getSpritePath();
					DoorX = j;
					DoorY = i;
					break;
				case "P":
					// ERROR X >> Y
					this.character = new Character(i, j);
					TabEntity[i][j] = this.character;
					Map[i][j] = this.character.getSpritePath();
					break;
				case "A":
					this.air = new Air(i, j);
					TabEntity[i][j] = this.air;
					Map[i][j] = this.air.getSpritePath();
					break;
				default:
					System.out.println("Error");
					break;
				}
			}
		}
	}

	public int[][] getTabBoulder() {
		return tabBoulder;
	}

	/**
	 * getMap Send the image of the Map.
	 * 
	 * @param i This is the horizontal position in the array.
	 * @param j This is the vertical position in the array.
	 * 
	 */
	public Image getMap(int i, int j) {
		return Map[i][j];
	}

	public void setMap(int i, int j, Image image) {
		Map[i][j] = image;
	}

	public Entity[][] getTabEntity() {
		return TabEntity;
	}

	public void setTabEntity(int i, int j, Entity entity) {
		TabEntity[i][j] = entity;
	}

	public Image[][] getMap() {
		return Map;
	}

	public void setTabEntity(Entity[][] tabEntity) {
		TabEntity = tabEntity;
	}

	public void setMap(Image[][] map) {
		Map = map;
	}

	public void splitTab(String[] tab) {
		String a;
		for (int i = 0; i < 22; i++) {
			a = tab[i];
			TabLine2 = a.split("");
			for (int j = 0; j < 40; j++) {
				TabMap[i][j] = TabLine2[j];
			}
		}
	}

	/**
	 * Gets the observable.
	 *
	 * @return the observable
	 */
	/*
	 * (non-Javadoc)
	 *
	 * @see contract.IModel#getObservable()
	 */
	public Observable getObservable() {
		return this;
	}
}

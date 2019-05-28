package controller;

import java.awt.Image;

import contract.ControllerOrder;
import contract.IController;
import contract.IModel;
import contract.IMovement;
import contract.IView;
import entity.Air;
import entity.Diamond;
import entity.Door;
import entity.Entity;

/**
 * The Class Controller.
 */
public final class Controller implements IController {

	/** The view. */
	private IView view;

	/** The model. */
	private IModel model;

	private IMovement movement;

	/**
	 * Instantiates a new controller.
	 *
	 * @param view  the view
	 * @param model the model
	 */
	public Controller(final IView view, final IModel model, IMovement movement) {
		this.setView(view);
		this.setModel(model);
		this.movement = movement;
	}

	/**
	 * Control.
	 */
	/*
	 * (non-Javadoc)
	 *
	 * @see contract.IController#control()
	 */
	public void control() {
		this.view.printMessage("Appuyer sur les touches 'A', 'Z', 'E' ou 'R', pour charger les différentes Map");
	}

	/**
	 * Sets the view.
	 *
	 * @param pview the new view
	 */
	private void setView(final IView pview) {
		this.view = pview;
	}

	/**
	 * Sets the model.
	 *
	 * @param model the new model
	 */
	private void setModel(final IModel model) {
		this.model = model;
	}

	public IModel getModel() {
		return this.model;
	}

	/**
	 * Order perform.
	 *
	 * @param controllerOrder the controller order
	 */
	/*
	 * (non-Javadoc)
	 *
	 * @see contract.IController#orderPerform(contract.ControllerOrder)
	 */
	public void orderPerform(final ControllerOrder controllerOrder) {
		switch (controllerOrder) {
		case map1:
			this.model.loadMap(1);
			break;
		case map2:
			this.model.loadMap(2);
			break;
		case map3:
			this.model.loadMap(3);
			break;
		case map4:
			this.model.loadMap(4);
			break;
		case map5:
			this.model.loadMap(5);
			break;
		default:
			break;
		}
		BoulderThread thread = new BoulderThread("thread", view, model, movement);
        thread.start();
        System.out.println("status du thread " + thread.getState());
	}

	public void movement(int KeyCode) {
		swap(model.getTabEntity(), model.getMap(), KeyCode);
		if (model.getCharacter().getNbDiamond() == 10) {
			System.out.println("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
			System.out.println(model.getDoorX());
			System.out.println(model.getDoorY());
			Door door = new Door(model.getDoorY(), model.getDoorX());
			model.setTabEntity(model.getDoorY(), model.getDoorX(), door);
			model.setMap(model.getDoorY(), model.getDoorX(), door.getSpritePath());
		}
	}

	private Boolean check(Entity entity) {
		Boolean move;
		move = movement.checkCanBeDestroyed(entity);
		return move;
	}

	private Boolean checkDiamond(Entity entity) {
		if (entity instanceof Diamond) {
			return true;
		} else {
			return false;
		}
	}

	public void swap(Entity[][] tabEntity, Image[][] tabImage, int i) {
		Entity entity;
		Image image;
		int y = model.getPosX();
		int x = model.getPosY();
		switch (i) {
		case 38:
			if (check(tabEntity[y - 1][x])) {
				entity = tabEntity[y][x];
				if (checkDiamond(tabEntity[y - 1][x])) {
					model.getCharacter().setNbDiamond(model.getCharacter().getNbDiamond() + 1);
				}
				Air air = new Air(x, y);
				tabEntity[y][x] = air;
				tabEntity[y - 1][x] = entity;
				image = tabImage[y][x];
				tabImage[y][x] = air.getSpritePath();
				tabImage[y - 1][x] = image;
				model.setPosX(-1);
			}
			break;
		case 40:
			if (check(tabEntity[y + 1][x])) {
				entity = tabEntity[y][x];
				if (checkDiamond(tabEntity[y + 1][x])) {
					model.getCharacter().setNbDiamond(model.getCharacter().getNbDiamond() + 1);
				}
				Air air = new Air(x, y);
				tabEntity[y][x] = air;
				tabEntity[y + 1][x] = entity;
				image = tabImage[y][x];
				tabImage[y][x] = air.getSpritePath();
				tabImage[y + 1][x] = image;
				model.setPosX(1);
			}
			break;
		case 39:
			if (check(tabEntity[y][x + 1])) {
				entity = tabEntity[y][x];
				if (checkDiamond(tabEntity[y][x + 1])) {
					model.getCharacter().setNbDiamond(model.getCharacter().getNbDiamond() + 1);
				}
				Air air = new Air(x, y);
				tabEntity[y][x] = air;
				tabEntity[y][x + 1] = entity;
				image = tabImage[y][x];
				tabImage[y][x] = air.getSpritePath();
				tabImage[y][x + 1] = image;
				model.setPosY(1);
			}
			break;
		case 37:
			if (check(tabEntity[y][x - 1])) {
				entity = tabEntity[y][x];
				if (checkDiamond(tabEntity[y][x - 1])) {
					model.getCharacter().setNbDiamond(model.getCharacter().getNbDiamond() + 1);
				}
				Air air = new Air(x, y);
				tabEntity[y][x] = air;
				tabEntity[y][x - 1] = entity;
				image = tabImage[y][x];
				tabImage[y][x] = air.getSpritePath();
				tabImage[y][x - 1] = image;
				model.setPosY(-1);
			}
			break;
		default:
			break;
		}
		model.update();
		model.setTabEntity(tabEntity);
		model.setMap(tabImage);
	}
}

package controller;

import java.awt.Image;

import contract.IModel;
import contract.IMovement;
import contract.IView;
import entity.Air;
import entity.Boulder;
import entity.Entity;

public class BoulderThread extends Thread {

	IView view;
	IModel model;
	IMovement movement;
	int[][] tabBoulder;
	Entity[][] tabEntity;
	Image[][] tabMap;

	Boulder boulder;

	public BoulderThread(String name, IView view, IModel model, IMovement movement) {
		super(name);
		this.view = view;
		this.model = model;
		this.movement = movement;
	}

	public void run() {

		while (true) {
 
			try {
				this.fall();
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public void swap(int i, int j) {
		System.out.println("ca execute swap2");
		Entity entity;
		entity = tabEntity[j][i];
		tabEntity[j][i] = tabEntity[j + 1][i];
		tabEntity[j + 1][i] = entity;
		Image image;
		image = tabMap[j][i];
		tabMap[j][i] = tabMap[j + 1][i];
		tabMap[j + 1][i] = image;
		System.out.println("avant "+tabBoulder[0][j]+" "+tabBoulder[1][j]);
		tabBoulder[1][j] = tabBoulder[1][j] + 1;
		System.out.println("apres " +tabBoulder[0][j]+" "+tabBoulder[1][j]);
		model.setTabEntity(tabEntity);
		model.setMap(tabMap);
	}

	public void fall() {
		this.tabBoulder = model.getTabBoulder();
		this.tabEntity = model.getTabEntity();
		this.tabMap = model.getMap();
		for(int b=0;b<75;b++) {
			System.out.println(tabBoulder[0][b] + " "+ tabBoulder[1][b]);
		}
		System.out.println("bonou");
		int j = 0;
		Boolean isFalling = false;
		for (j = 0; j < 100; j++) {
			try {
			if (tabEntity[tabBoulder[1][j] + 1][tabBoulder[0][j]] instanceof Air) {
				isFalling = true;
				swap(tabBoulder[0][j], tabBoulder[1][j]);
				System.out.println("finis");
			}
			}catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("error");
				e.printStackTrace();
				break;
			}
		}
	}
}
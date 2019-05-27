package model.Movement;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class CheckKey{

	Movement movement;
	
	
	public void keyCodeController(int keyCode) {
		switch(keyCode) {
		case KeyEvent.VK_UP:
			System.out.println("bonjour1");
			movement.setPositionY();
			break;
		}
	}
	
	/*@Override
	public void keyTyped(KeyEvent e) {
				
	}
	
	@Override
	public void keyPressed(KeyEvent e) {
		System.out.println("bonjour2");
		int KeyTouch = e.getKeyCode();
		keyCodeController(KeyTouch);
	}
	
	@Override
	public void keyReleased(KeyEvent e) {
				
	}*/
}

package view;

import java.awt.event.KeyEvent;

import javax.swing.SwingUtilities;

import contract.ControllerOrder;
import contract.IController;
import contract.IModel;
import contract.IView;

/**
 * The Class View.
 *
 * @author Jean-Aymeric Diet
 */
public final class View implements IView, Runnable {

	/** The frame. */
	private final ViewFrame viewFrame;
	

	/**
	 * Instantiates a new view.
	 *
	 * @param model
	 *          the model
	 */
	public View(final IModel model) {
		this.viewFrame = new ViewFrame(model);
		SwingUtilities.invokeLater(this);
	}

	/**
	 * Key code to controller order.
	 *
	 * @param keyCode
	 *          the key code
	 * @return the controller order
	 */
	protected static ControllerOrder keyCodeToControllerOrder(final int keyCode) {
		switch (keyCode) {
			case KeyEvent.VK_A:
				return ControllerOrder.map1;
			case KeyEvent.VK_Z:
				return ControllerOrder.map2;
			case KeyEvent.VK_E:
				return ControllerOrder.map3;
			case KeyEvent.VK_R:
				return ControllerOrder.map4;
			case KeyEvent.VK_T:
				return ControllerOrder.map5;
				default:				
				return null;
		}
	}

	public void printMessage(final String message) {
		this.viewFrame.printMessage(message);
	}


	public void run() {
		this.viewFrame.setVisible(true);
	}
	
	public void close() {
		this.viewFrame.dispose();
		System.exit(0);
	}

	/**
	 * Sets the controller.
	 *
	 * @param controller
	 *          the new controller
	 */
	public void setController(final IController controller) {
		this.viewFrame.setController(controller);
	}
}

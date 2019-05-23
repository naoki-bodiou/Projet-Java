package contract;

import java.util.Observable;

import entity.Line;

/**
 * The Interface IModel.
 *
 * @author Jean-Aymeric Diet
 */
public interface IModel {

	/**
	 * Gets the hello world.
	 *
	 * @return the helloworld entity
	 */
	Line getLine();

	/**
	 * Load the message.
	 *
	 * @param code
	 *          the code
	 */
	void loadLine(int id);

	/**
	 * Gets the observable.
	 *
	 * @return the observable
	 */
	Observable getObservable();
}

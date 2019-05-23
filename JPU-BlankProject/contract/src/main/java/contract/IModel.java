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
String getTabLine(int i);

	/**
	 * Load the message.
	 *
	 * @param code
	 *          the code
	 */
	void loadMap();

	/**
	 * Gets the observable.
	 *
	 * @return the observable
	 */
	Observable getObservable();
}

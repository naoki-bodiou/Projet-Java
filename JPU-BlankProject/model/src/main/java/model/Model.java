package model;

import java.sql.SQLException;
import java.util.Observable;

import contract.IModel;
import entity.Line;

/**
 * The Class Model.
 *
 * @author Jean-Aymeric Diet
 */
public final class Model extends Observable implements IModel {

	/** The helloWorld. */
	private String[] TabLine;
	private String line;

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
	public String getTabLine(int i) {
		return TabLine[i];
	}

	/**
     * Sets the hello world.
     *
     * @param helloWorld
     *            the new hello world
     */
	private void setTabLine(final String line, int i) {
		this.TabLine[i] = line;
		this.setChanged();
		this.notifyObservers();
	}

	/**
     * Load hello world.
     *
     * @param code
     *            the code
     */
	/*
	 * (non-Javadoc)
	 *
	 * @see contract.IModel#getMessage(java.lang.String)
	 */
	public void loadMap() {
		try {
			final DAOLine daoLine = new DAOLine(DBConnection.getInstance().getConnection());
			for(int i = 0; i < 22; i++) {
				line = daoLine.find(i + 1);
			this.setTabLine(line, i);
			}
		} catch (final SQLException e) {
			e.printStackTrace();
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

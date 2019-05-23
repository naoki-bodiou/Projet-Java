package entity;

/**
 * The Class HelloWorld.
 *
 * @author Jean-Aymeric Diet
 */
public class Line extends Entity 
{

	/** The id. */
	private String line;
	
	public Line(String line)
	{
		this.setLine(line);
	}

	public String getLine() {
		return line;
	}

	public void setLine(String line) {
		this.line = line;
	}
}


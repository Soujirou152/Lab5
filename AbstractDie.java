
public abstract class AbstractDie implements Rollable
{

	private int lastRoll; // visibility could also be protected => access by
							// subclasses + same-package classes

	public AbstractDie()
	{

	}

	public int getLastRoll()
	{

		return this.lastRoll;
	}

	public void setLastRoll(int newRoll)
	{
		this.lastRoll = newRoll;
	}

	public abstract void roll();

	public String toString()
	{
		return "An AbstractDie object.";
	}

}

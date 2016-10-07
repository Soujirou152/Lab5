
public class Die implements Rollable
{
	private int lastRoll;

	public Die()
	{
		this.roll();
		System.out.println("Constructor of Die is invoked ");
	}

	public Die(int firstValue)
	{
		lastRoll = firstValue;
		System.out.println("Constructor of Die is invoked ");
	}

	public int getLastRoll()
	{
		return this.lastRoll;
	}

	protected void setLastRoll(int lastRoll) // expose this only to subclasses?
	{
		this.lastRoll = lastRoll;
	}

	public void roll()
	{
		setLastRoll((int) (Math.random() * 6 + 1));
	}

	//public String toString() // can you change this to protected visiblity?
	//{
		//eturn "A Die object with lastRoll == " + this.getLastRoll();
		// does getLastRoll() *always* call the method above?
	//}

	public String toString(int msg) // Overloading... but NOT overriding!
	{
		return msg + " -> " + this.toString();
	}
}

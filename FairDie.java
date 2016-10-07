
public class FairDie extends AbstractDie implements Rollable
{

	private int lastRoll;

	public  FairDie()
	{
		this.roll();
		System.out.println("Constructor of Die is invoked ");
	}

	public  FairDie(int firstValue)
	{
		lastRoll = firstValue;
	}

	public int getLastRoll()
	{
		return this.lastRoll;
	}

	public void setLastRoll(int lastRoll) // expose this only to subclasses?
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
	
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

	}

}

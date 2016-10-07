
public class Dice
{
	private Rollable  die1; // may plug in Die or subclass references here
	private Rollable die2;

	private int lastRoll;

	public Dice()
	{
		die1 = new Die(); // change here to substitute other kinds of Die
							// subclass objects
		die2 = new Die();

		this.roll();
	}

	public void roll()
	{
		die1.roll();
		die2.roll();

		this.lastRoll = die1.getLastRoll() + die2.getLastRoll();
	}

	public int getLastRoll()
	{
		return this.lastRoll;
	}

	public String toString()
	{
		return "A Dice object.";
	}

}

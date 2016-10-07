
public class CrookedDie1 extends Die implements Rollable
{

	public CrookedDie1()
	{
		System.out.println("Constructor of CrookedDie1 is invoked. ");
	}

	public int getLastRoll()
	{
		return 3;
	}
	
	public void roll()
	{
		// do nothing...
	}
	
	public String toString()
	{
		return "A CrookedDie1 object, and... " + super.toString();
	}

}

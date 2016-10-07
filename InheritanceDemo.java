
public class InheritanceDemo {
	/**
	 * Part of Lab 5, 602-01 Fall 2016:
	 * 
	 * Starting Java code for exploring inheritance, constructor chaining,
	 * overriding, and polymorphism ("dynamic method lookup")
	 * 
	 */
	public static void main(String[] args) {
		Die die1 = new Die();

		// Lab 5-1a: add output (println()) code to last line of related
		// constructors, demonstrating constructor chaining from CrookedDie1 to
		// Die

		CrookedDie1 crooked1 = new CrookedDie1();

		// Lab 5-1b: modify Die so it no longer overrides toString() (comment it
		// out); then when die1.toString() is called, Object's toString() will
		// be executed

		StdOut.println(die1.toString());

		// Lab 5-1c: modify CrookedDie1's toString() so it returns its
		// superclass's toString(), concatenated to the current String value it
		// returns. (Use super.toString() inside of CrookedDie1's toString()...)

		StdOut.println(crooked1.toString());

		// Lab 5-1d: demonstrate dynamic method lookup by randomly passing
		// either die1 or crooked1 to the describe(..) method below (no mod
		// needed)

		Die whatsThis = (Math.random() < 0.5) ? die1 : crooked1;

		describe("Can we ever determine the actual type of whatsThis at runtime! ", whatsThis);

		// Lab 5-1e: add your own toString() to MyCheatDie, make it a subclass
		// of CrookedDie1, then create an instance of MyCheatDie and invoke
		// toString() against it.

		MyCheatDie cheat1 = new MyCheatDie();

		StdOut.println(cheat1.toString());
		StdOut.println(cheat1); // treating a ref as a String? automatic
								// toString()!
		StdOut.println(cheat1.getLastRoll());
		StdOut.println(crooked1.getLastRoll());

		// Lab 5-1f: add overriding getNextRoll() to MyCheatDie (have it return
		// any reasonable value you wish), then repeat above:

		StdOut.println(cheat1.toString());
		StdOut.println(cheat1); // treating a ref as a String? automatic
								// toString()!
		StdOut.println(cheat1.getLastRoll());
		StdOut.println(crooked1.getLastRoll());
		
		MyCheatDie die2 = cheat1; // equivalent to (Die) cheat1: automatic upcasting

		StdOut.println(die2.toString());

		// we'll trace all of the above this in the Eclipse debugger
		// as part of Lab 5-2...

	}

	public static void describe(String msg, Die toDescribe) {
		StdOut.println(msg + "'" + toDescribe.toString() + "'");
	}

}

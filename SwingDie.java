import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class SwingDie extends JFrame implements ActionListener, Rollable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField textfield = new JTextField("Enter new roll value here.");
	private JButton button = new JButton("OK");
	
	private int lastRoll;

	public SwingDie()
	{
		super("SwingDie"); // call JFrame(String) constructor to set title

		this.setPreferredSize(new Dimension(200, 100)); // size of the window
		this.setLayout(new FlowLayout()); // how the controls are laid out

		textfield.setPreferredSize(new Dimension(100, 20)); // size of textfield

		add(textfield); // add the textfield to the window

		button.addActionListener(this); // register this SwingDie to handle
										// clicks

		add(button); // add the button to the window

		pack(); // adjust the layout

	}

	public static void main(String[] args)
	{
		SwingDie die = new SwingDie();
		die.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e)
	{
		// what should you do when the button is clicked?
		
		
		StdOut.println("OK button clicked.");
		StdOut.println("You entered: " + textfield.getText());
		roll();
		

	}

	@Override
	public void roll() {
		// TODO Auto-generated method stub
		lastRoll = Integer.parseInt(textfield.getText());
	}

	@Override
	public int getLastRoll() {
		// TODO Auto-generated method stub
		return 0;
	}

}

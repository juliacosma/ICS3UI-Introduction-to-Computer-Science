// The "NotJRadioButton" class.
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class NotJRadioButton
{

    //declare class level object and variable
    static JRadioButton jazz, rock, classical, blues;
    static JLabel lblOutput, lblPrompt;
    static JButton btnProcess;
    static ButtonGroup music;

    private static void guiApp ()
    {
	//create and set up window
	JFrame frame = new JFrame ("JRadioButton");
	frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);

	//create components
	JPanel panel = new JPanel ();
	panel.setLayout (new BoxLayout (panel, BoxLayout.PAGE_AXIS));
	lblPrompt = new JLabel ("Choose music type: ");

	//set up JRADIOButtons
	jazz = new JRadioButton ("Jazz", false);
	rock = new JRadioButton ("Rock", false);
	classical = new JRadioButton ("Classical", false);
	blues = new JRadioButton ("Blues", false);

	// set up logical relationship for group
	music = new ButtonGroup ();
	music.add (jazz);
	music.add (rock);
	music.add (classical);
	music.add (blues);

	//set up JButton and output label
	btnProcess = new JButton ("Process Selection");
	lblOutput = new JLabel ("Output will show here");

	//create new ButtonHandler Instance
	ButtonHandler onClick = new ButtonHandler ();
	btnProcess.addActionListener (onClick);

	//add components to the panel
	panel.add (lblPrompt);
	panel.add (jazz);
	panel.add (rock);
	panel.add (classical);
	panel.add (blues);
	panel.add (btnProcess);
	panel.add (lblOutput);

	//add panel to frame and display the window
	frame.getContentPane ().add (panel);
	frame.pack ();
	frame.setSize (200, 200);
	frame.setVisible (true);
    }


    //create custom event handler
    private static class ButtonHandler implements ActionListener
    {
	public void actionPerformed (ActionEvent e)
	{
	    //get data
	    if (jazz.isSelected ())
	    {
		lblOutput.setText ("Jazz is my favourite!");
	    }
	    else
	    {
		lblOutput.setText ("What? No jazz?");
	    }
	}
    }


    public static void main (String[] args)
    {
	javax.swing.SwingUtilities.invokeLater (new Runnable ()
	{
	    public void run ()
	    {
		guiApp ();
	    }
	}
	);

    } // main method
}

// Place your code here

// NotJRadioButton class

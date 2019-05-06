// The "Contacts" class.
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Contacts
{
    static JLabel label;
    static JButton btnName, btnPhone, btnEmail, btnCell;

    public static void guiApp ()
    {
	JFrame frame = new JFrame ("Simple GUI");
	frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);

	JPanel panel = new JPanel ();
	label = new JLabel ("Contact Info");
	btnName = new JButton ("Name");
	btnPhone = new JButton ("Home Phone");
	btnEmail = new JButton ("Email");
	btnCell = new JButton ("Cell Phone");
       

	ButtonHandler onClick = new ButtonHandler ();
	btnName.addActionListener (onClick);
	btnPhone.addActionListener (onClick);
	btnEmail.addActionListener (onClick);
	btnCell.addActionListener (onClick);

	panel.add (btnName);
	panel.add (btnPhone);
	panel.add (btnEmail);
	panel.add (btnCell);
	panel.add (label);

	Container contentPane = frame.getContentPane ();
	contentPane.add (panel);
	frame.setSize (250, 100);
	frame.setVisible (true);
    }


    private static class ButtonHandler implements ActionListener
    {
	public void actionPerformed (ActionEvent e)
	{
	    String whichOne = e.getActionCommand ();
	    if (whichOne.equals ("Name"))
	    {
		label.setText ("Professor S. Mart");
	    }
	    else if (whichOne.equals ("Home Phone"))
	    {
		label.setText ("314 159 2608");
	    }
	    else if (whichOne.equals ("Email"))
	    {
		label.setText ("smart@universi.ty");
	    }
	    else if (whichOne.equals ("Cell Phone"))
	    {
		label.setText ("314 161 8245");
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
} // ModifyGreetings class


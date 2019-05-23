// The "BinaryConversion" class.
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class BinaryConversion
{
    static int dec;
    static String bin = "";
    static JLabel lblPrompt, lblOutput;
    static JButton btnBin, btnDec;
    static JTextField txtInput;

    public static void guiApp ()
    {
	//set up window
	JFrame frame = new JFrame ("Binary Converter");
	frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);

	//fonts
	Font titleFont = new Font ("TimesRoman", Font.BOLD, 20);
	Font otherFont = new Font ("TimesRoman", Font.BOLD, 18);

	//create components
	JPanel panel = new JPanel (new GridLayout (2, 1));
	panel.setLayout (new BoxLayout (panel, BoxLayout.PAGE_AXIS));
	lblPrompt = new JLabel ("Convert Between Decimal and Binary", JLabel.CENTER);
	lblPrompt.setFont (titleFont);
	lblOutput = new JLabel ("...", JLabel.CENTER);
	lblOutput.setFont (otherFont);
	txtInput = new JTextField ("");
	txtInput.setHorizontalAlignment (JTextField.CENTER);

	//setup buttons
	btnDec = new JButton ("Convert to decimal");
	btnBin = new JButton ("Convert to binary");


	//button handler instances
	toDec dec = new toDec ();
	btnDec.addActionListener (dec);

	toBin bin = new toBin ();
	btnBin.addActionListener (bin);

	//add components to panel
	panel.add (lblPrompt);
	panel.add (txtInput);
	panel.add (btnBin);
	panel.add (btnDec);
	panel.add (lblOutput);

	//add panel to frame and display window
	frame.getContentPane ().add (panel);
	frame.pack ();
	frame.setSize (350, 200);
	frame.setVisible (true);
    }


    private static class toDec implements ActionListener
    {
	public void actionPerformed (ActionEvent e)
	{
	    //reset variable and get input
	    dec = 0;
	    
	    lblOutput.setText ("");

	    //String which = e.getActionCommand ();

	    String input = txtInput.getText ();

	    int len = input.length ();

	    //x  1001

	    for (int i = 0 ; i < len ; i++)
	    {
		if (input.charAt (i) == '1')
		{
		    dec += Math.pow (2, len - i - 1);
		}
	    }


	    lblOutput.setText (String.valueOf (dec));

	}

    }


    private static class toBin implements ActionListener
    {
	public void actionPerformed (ActionEvent e)
	{

	    //reset variable and get input
	    String bits = "";
	    
	    lblOutput.setText ("");
	    
	    bin = "";

	    //highest exponent
	    int exp = 0;

	    //String which = e.getActionCommand ();
	    int input = Integer.parseInt (txtInput.getText ());

	    //highest power of two in number
	    while (input >= Math.pow (2, exp))
	    {
		exp++;
	    }


	    //creat binary number
	    while (input > 0)
	    {
		for (int i = exp-1 ; i >= 0 ; i--)
		{
		    if (input - Math.pow (2, i) >= 0)
		    {
			input -= Math.pow (2, i);
			bin = bin + "1";
		    }
		    else
		    {
			bin = bin + "0";
		    }
		}

	    }

	    lblOutput.setText (String.valueOf(bin));
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

	// Place your code here
    } // main method
} // BinaryConversion class

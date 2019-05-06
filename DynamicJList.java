// The "DynamicJList" class.
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class DynamicJList
{
    //declare class level object and variables
    static JList cityList;
    static JLabel lblOutput, lblPrompt;
    static JTextField txtInput;
    static JButton btnProcess;
    static DefaultListModel listModel;

    public static void guiApp ()
    {
	//create and set up window
	JFrame frame = new JFrame ("JList");
	frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);

	//create components
	JPanel panel = new JPanel ();
	panel.setLayout (new BoxLayout (panel, BoxLayout.PAGE_AXIS));
	lblPrompt = new JLabel ("Enter a city to add");
	txtInput = new JTextField();

	//set up listModel for list elements
	listModel = new DefaultListModel ();
	listModel.addElement ("Bogata");
	listModel.addElement ("Venice");
	listModel.addElement ("Hong Kong");
	listModel.addElement ("Johannesburg");
	listModel.addElement ("Copenhagen");
	listModel.addElement ("Ottawa");

	//create JList from the ListModel
	cityList = new JList (listModel);
	cityList.setVisibleRowCount (5);
	cityList.setSelectionMode (ListSelectionModel.SINGLE_SELECTION);

	//set up a croll pane for the JList
	JScrollPane listScroll = new JScrollPane (cityList);

	//set up JButton and output label
	btnProcess = new JButton ("Add city to list");
      

	// create new button handler instance
	ButtonHandler onClick = new ButtonHandler ();
	btnProcess.addActionListener (onClick);

	//add componenets to the panel
	panel.add (lblPrompt);
	panel.add (txtInput);
	panel.add (btnProcess);
	panel.add (listScroll);

	//add panel to frame and display the indow
	frame.getContentPane().add (panel);
	frame.pack();
	frame.setSize (200, 180);
	frame.setVisible (true);
    }


    //create custom event handler
    private static class ButtonHandler implements ActionListener
    {
	public void actionPerformed (ActionEvent e)
	{
	    String city = txtInput.getText();
	    listModel.addElement (city);
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
    }
}

    // DynamicJList class



// The "GuessMyNumberGUI" class.
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GuessNumber
{
    static JButton btnCheck;
    static JLabel lblTitle, lblInstruct, lblFeedback;
    static JTextField txtInput;
    static int targetNum;
    static int counter = 0;
   

    private static void guiApp ()
    {
        //create and set up window
        JFrame frame = new JFrame ("Guess A number Game");
        frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);

        //create components
        JPanel panel = new JPanel (new GridLayout (5, 1));
        Font titleFont = new Font ("TimesRoman", Font.BOLD, 24);
        Font otherFont = new Font ("TimesRoman", Font.BOLD, 18);

        lblTitle = new JLabel ("Guess My Number", JLabel.CENTER);
        lblTitle.setFont (titleFont);
        lblInstruct = new JLabel ("Between 1 and 100", JLabel.CENTER);
        txtInput = new JTextField ("");
        txtInput.setHorizontalAlignment (JTextField.CENTER);
        btnCheck = new JButton ("Check Guess");
        lblFeedback = new JLabel ("", JLabel.CENTER);

        //ButtonHandler instance
        ButtonHandler onClick = new ButtonHandler ();
        btnCheck.addActionListener (onClick);

       
        //add components to content pane
        panel.add (lblTitle);
        panel.add (lblInstruct);
        panel.add (txtInput);
        panel.add (btnCheck);
        panel.add (lblFeedback);

        frame.getContentPane ().add (panel);
        frame.pack ();
        frame.setSize (300, 200);
        frame.setVisible (true);

    }



    private static class ButtonHandler implements ActionListener
    {
        public void actionPerformed (ActionEvent e)
        {
            String whichOne = e.getActionCommand ();


            if (whichOne.equals ("Check Guess"))
            {
                String input = txtInput.getText ();
                counter++;
                int guess = Integer.parseInt (input);
                if (guess > targetNum)
                {
                    lblFeedback.setText ("Too High");
                }
                else if (guess < targetNum)
                {
                    lblFeedback.setText ("Too Low");
                }
                else
                {
                    lblFeedback.setText ("You guessed it in " + counter + " guesses");
                    btnCheck.setText ("Play Again?");
                }
            }
            else if (whichOne.equals ("Play Again?"))
            {
                targetNum = (int) (Math.random () * 10 + 1);
                btnCheck.setText ("Check Guess");
                counter = 0;
                lblFeedback.setText ("");
                txtInput.setText ("");
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
} // GuessMyNumberGUI class



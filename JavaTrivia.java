// The "JavaTrivia" class.
import javax.swing.*;
import java.applet.*;
import java.applet.AudioClip;
import java.net.URL;
import java.awt.*;
import java.awt.event.*;

public class JavaTrivia
{
    static JButton btn1, btn2, btn3, btn4, btn5, btn6, btnCheck;
    static JLabel lblTitle, lblInstruct, lblFeedback, lblQuestion, lblScore;
    static JTextField txtInput;
    static int targetNum;
    static int score = 0, qNum = 0;
    static AudioClip hyena, coyote_howl, crickets, cow3;
    //Color green = Color.decode("#BCED91");


    private static void guiApp ()
    {
        //create and set up window
        JFrame frame = new JFrame ("Java Trivia");
        frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);

        //create components
        JPanel panel = new JPanel (new GridLayout (8, 1));
        JPanel buttonPanel = new JPanel (new GridLayout (1, 6));
        Font titleFont = new Font ("TimesRoman", Font.BOLD, 24);
        Font otherFont = new Font ("TimesRoman", Font.BOLD, 18);


        lblTitle = new JLabel ("Java Biology Trivia", JLabel.CENTER);
        lblTitle.setFont (titleFont);
        lblTitle.setForeground (Color.green);
        lblInstruct = new JLabel ("click on a button to get a question", JLabel.CENTER);
        lblInstruct.setFont (otherFont);
        btn1 = new JButton ("Question 1");
        btn2 = new JButton ("Question 2");
        btn3 = new JButton ("Question 3");
        btn4 = new JButton ("Question 4");
        btn5 = new JButton ("Question 5");
        btn6 = new JButton ("Question 6");
        lblQuestion = new JLabel ("", JLabel.CENTER);
        txtInput = new JTextField ("");
        txtInput.setHorizontalAlignment (JTextField.CENTER);
        btnCheck = new JButton ("Check Answer");
        lblFeedback = new JLabel ("", JLabel.CENTER);
        lblScore = new JLabel ("Score: " + score);


        //add components to content pane
        buttonPanel.add (btn1);
        buttonPanel.add (btn2);
        buttonPanel.add (btn3);
        buttonPanel.add (btn4);
        buttonPanel.add (btn5);
        buttonPanel.add (btn6);

        panel.add (lblTitle);
        panel.add (lblInstruct);
        panel.add (buttonPanel);
        panel.add (txtInput);
        panel.add (btnCheck);
        panel.add (lblQuestion);
        panel.add (lblFeedback);
        panel.add (lblScore);

        //ButtonHandler instance
        ButtonHandler onClick = new ButtonHandler ();
        btnCheck.addActionListener (onClick);
        btn1.addActionListener (onClick);
        btn2.addActionListener (onClick);
        btn3.addActionListener (onClick);
        btn4.addActionListener (onClick);
        btn5.addActionListener (onClick);
        btn6.addActionListener (onClick);


        frame.getContentPane ().add (panel);
        frame.pack ();
        frame.setSize (700, 200);
        frame.setVisible (true);

    }



    private static class ButtonHandler implements ActionListener
    {
        public void actionPerformed (ActionEvent e)
        {
            String answer = txtInput.getText ();
            String whichOne = e.getActionCommand ();

            //display questions
            if (whichOne.equals ("Question 1"))
            {
                lblQuestion.setText ("What is the unit of energy used by cells?");
                qNum = 1;
                lblFeedback.setText ("");
            }
            else if (whichOne.equals ("Question 2"))
            {
                lblQuestion.setText ("Which process of cell division produces four unique haploid daughter cells?");
                qNum = 2;
                lblFeedback.setText ("");
            }
            else if (whichOne.equals ("Question 3"))
            {
                lblQuestion.setText ("What will placing plant cells in a hypertonic solution cause?");
                qNum = 3;
                lblFeedback.setText ("");
            }
            else if (whichOne.equals ("Question 4"))
            {
                lblQuestion.setText ("What is the term for the force within a plant cell that pushes the plasma membrane against the cell wall?");
                qNum = 4;
                lblFeedback.setText ("");
            }
            else if (whichOne.equals ("Question 5"))
            {
                lblQuestion.setText ("What kind of cell transport requires ATP?");
                qNum = 5;
                lblFeedback.setText ("");
            }
            else if (whichOne.equals ("Question 6"))
            {
                lblQuestion.setText ("Is Adenine a purine or pyramidine?");
                qNum = 6;
                lblFeedback.setText ("");
            }

            //check answers

            if (whichOne.equals ("Check Answer"))
            {
                //question 1
                if (qNum == 1 && answer.equalsIgnoreCase ("atp"))
                {
                    score++;
                    lblScore.setText ("Score: " + score);
                    lblFeedback.setText ("Correct!");
                    coyote_howl.play ();
                }
                else if (qNum == 1 && (!answer.equalsIgnoreCase ("atp")))
                {
                    lblFeedback.setText ("Incorrect.");
                    crickets.play ();
                }

                //question 2
                if (qNum == 2 && answer.equalsIgnoreCase ("meiosis"))
                {
                    score++;
                    lblScore.setText ("Score: " + score);
                    lblFeedback.setText ("Correct!");
                    coyote_howl.play ();

                }
                else if (qNum == 2 && !answer.equalsIgnoreCase ("meiosis"))
                {
                    lblFeedback.setText ("Incorrect.");
                    crickets.play ();
                }

                //question 3
                if (qNum == 3 && answer.equalsIgnoreCase ("plasmolysis"))
                {
                    score++;
                    lblScore.setText ("Score: " + score);
                    lblFeedback.setText ("Correct!");
                    coyote_howl.play ();

                }
                else if (qNum == 3 && !answer.equalsIgnoreCase ("plasmolysis"))
                {
                    lblFeedback.setText ("Incorrect.");
                    crickets.play ();
                }

                //question 4
                if (qNum == 4 && (answer.equalsIgnoreCase ("turgor pressure") || answer.equalsIgnoreCase ("turgor")))
                {
                    score++;
                    lblScore.setText ("Score: " + score);
                    lblFeedback.setText ("Correct!");
                    coyote_howl.play ();
                }
                else if (qNum == 5 && !answer.equalsIgnoreCase ("turgor pressure") || !answer.equalsIgnoreCase ("turgor"))
                {
                    lblFeedback.setText ("Incorrect.");
                    crickets.play ();
                }

                //question 5
                if (qNum == 5 && answer.equalsIgnoreCase ("active"))
                {
                    score++;
                    lblScore.setText ("Score: " + score);
                    lblFeedback.setText ("Correct!");
                    coyote_howl.play ();

                }
                else if (qNum == 6 && !answer.equalsIgnoreCase ("active"))
                {
                    lblFeedback.setText ("Incorrect.");
                    crickets.play ();
                }

                //question 6
                if (qNum == 6 && answer.equalsIgnoreCase ("purine"))
                {
                    score++;
                    lblScore.setText ("Score: " + score);
                    lblFeedback.setText ("Correct!");
                    coyote_howl.play ();

                }
                else if (qNum == 1 && !answer.equalsIgnoreCase ("purine"))
                {
                    lblFeedback.setText ("Incorrect.");
                }
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
        URL url = JavaTrivia.class.getResource ("crickets.wav");
        crickets = Applet.newAudioClip (url);

        URL url0 = JavaTrivia.class.getResource ("coyote_howl.wav");
        coyote_howl = Applet.newAudioClip (url0);

        URL url1 = JavaTrivia.class.getResource ("hyena.wav");
        hyena = Applet.newAudioClip (url1);

        URL url2 = JavaTrivia.class.getResource ("cow3.wav");
        cow3 = Applet.newAudioClip (url2);

    } // main method
} // JavaTrivia class



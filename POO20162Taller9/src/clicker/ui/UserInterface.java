package clicker.ui;

import java.awt.Container;
import java.awt.Dimension;
import javax.swing.*;

import clicker.applicationLogic.PersonalCalculator;

public class UserInterface implements Runnable
{

    // -------------------------------------------------- ATTRIBUTES

    private JFrame frame;
    private PersonalCalculator calculator;

    // ------------------------------------------------- CONSTRUCTOR

    public UserInterface ( PersonalCalculator newCalculator )
    {
        frame = new JFrame ( "Click Effect" );
        this.calculator = newCalculator;
    }

    // -------------------------------------------------- METHODS

    @Override
    public void run ()
    {
        this.frame.setPreferredSize ( new Dimension ( 100 , 200 ) );
        this.frame.setDefaultCloseOperation ( WindowConstants.EXIT_ON_CLOSE );
        this.createComponents ( this.frame.getContentPane() );
        this.frame.pack ();
        this.frame.setVisible ( true );
    }

    private void createComponents ( Container container )
    {
        BoxLayout layout = new BoxLayout ( container , BoxLayout.Y_AXIS );
        container.setLayout ( layout );

        JLabel label = new JLabel ();
        JButton button = new JButton ( "Click!" );

        clickListener clickListener = new clickListener ( label , this.calculator );
        button.addActionListener ( clickListener );

        container.add ( label );
        container.add ( button );
    }

    // ------------------------------------------------ TEST MAIN

    public static void main ( String [] args )
    {
        UserInterface ui = new UserInterface ( new PersonalCalculator () );
        SwingUtilities.invokeLater (ui);
    }
}


package clicker.ui;

import clicker.applicationLogic.PersonalCalculator;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;

public class clickListener implements ActionListener
{

    // ------------------------------------------------------ ATTRIBUTES

    private JLabel field;
    private PersonalCalculator calculator;

    // ------------------------------------------------------ CONSTRUCTOR

    public clickListener ()
    {
        field = new JLabel ();
        calculator = new PersonalCalculator();
        // Default constructor..
    }

    public clickListener ( JLabel newField , PersonalCalculator newCalculator )
    {
        this.field = newField;
        this.calculator = newCalculator;
    }

    // ---------------------------------------------------- METHODS

    private void click ()
    {
        this.calculator.increase ();
        this.field.setText ( Integer.toString( this.calculator.giveValue() ) );
    }

    @Override
    public void actionPerformed ( ActionEvent ae )
    {
        this.click ();
    }

}

package clicker.applicationLogic;

public class PersonalCalculator implements Calculator
{

    // -------------------------------------------- ATTRIBUTES

    private int value;

    // -------------------------------------------- CONSTRUCTOR

    public PersonalCalculator ()
    {
        // Default constructor here!
    }

    public PersonalCalculator ( int initialValue )
    {
        this.setValue ( initialValue );
    }

    // -------------------------------------------- METHODS

    public int getValue()
    {
        return value;
    }

    public void setValue(int newValue)
    {
        this.value = newValue;
    }

    @Override
    public int giveValue ()
    {
        return this.getValue();
    }

    @Override
    public void increase ()
    {
        this.setValue ( this.getValue() + 1 );
    }

    // ------------------------------------------- TEST MAIN

    public static void main ( String [] args )
    {
        Calculator calc = new PersonalCalculator();
        System.out.println("Value: " + calc.giveValue());
        calc.increase();
        System.out.println("Value: " + calc.giveValue());
        calc.increase();
        System.out.println("Value: " + calc.giveValue());
    }

}

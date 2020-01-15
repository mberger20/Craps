
/**
 * The Die class constructs a die,rolls it, and returns the result. 
 *
 * @author Maddy Berger
 * @version 2020-01-15
 */
public class Die
{
    // instance variables - replace the example below with your own
    private int result;

    /**
     * Constructor for objects of class Die
     */
    public Die()
    {
        result = roll();
    }

    /**
     * The roll() method rolls the die and returns the result. 
     *
     * @return    result 
     */
    public int roll()
    {
        result = (int) (Math.random() * 6 + 1);
        return result;
    }
    
    /**
     * The result() method returns the current state of the die. 
     *
     * @return    result
     */
    public int getResult()
    {
        return result; 
    }
}

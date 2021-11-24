package drona.cont.eroricont;

public class NumCharException extends Exception{
    public NumCharException(String errorMessage)
    {
        super(errorMessage);
        System.out.println(errorMessage);
    }
    
}

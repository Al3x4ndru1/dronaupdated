package drona.cont.eroricont;

public class MatchPasswordException extends Exception{

    public MatchPasswordException (String errorMessage){
        super(errorMessage);
        System.out.println(errorMessage);
    }
    
}

package drona.cont.eroricont;

public class LowCaseException extends Exception{
    public LowCaseException(String errorMessage){
        super(errorMessage);
        System.out.println(errorMessage);
    }
    
}

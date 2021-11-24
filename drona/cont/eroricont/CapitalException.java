package drona.cont.eroricont;
public class CapitalException extends Exception{

    public CapitalException(String errorMessage){
        super(errorMessage);
        System.out.println(errorMessage);
    }
}
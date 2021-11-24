package drona.cont.eroricont;

public class CifraException extends Exception{
    public CifraException(String errorMessage){
        super(errorMessage);
        System.out.println(errorMessage);
    }
    
}

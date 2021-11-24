
package drona.cont.eroricont;

public class SpecialCharException extends Exception{
    public SpecialCharException(String errorMessage){
        super(errorMessage);
        System.out.println(errorMessage);
    }
}

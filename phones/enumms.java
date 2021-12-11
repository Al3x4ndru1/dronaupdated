package phones;

import java.util.Scanner;

public class enumms {
public static void main(String[] args){
    Phone sc=null;

    System.out.println("ce culoare vrei sa introcduci?");
    Scanner scan = new Scanner(System.in);
    int nr=scan.nextInt();

    PhoneType type = PhoneType.values()[nr-1];
    switch (type){
        case SAMSUNG:  sc= new Samsung(); break;
        case IPHONE:  sc= new Iphone(); break;
        case SONY:  sc= new Sony(); break;
        default: System.out.println("nu exista");
    }
    sc.specification();
}
}

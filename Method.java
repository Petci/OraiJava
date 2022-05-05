package method;

import java.util.Scanner;

public class Method {
    
    //14. Készíts metódust, ami egy átadott jelszóról eldönti, hogy valid -e. A bemenő paramétere egy String legyen, visszatérési értéke igaz/hamis logikai érték!
    public static boolean jelszo614(String jelszo){
        char ch;
    boolean capitalFlag = false;
    boolean numberFlag = false;
    boolean length = false;
    for(int i=0;i < jelszo.length();i++) {
        ch = jelszo.charAt(i);
        if( Character.isDigit(ch)) {
            numberFlag = true;
        }
        else if (Character.isUpperCase(ch)) {
            capitalFlag = true;
        }else if (8 <= jelszo.length()) {
            length = true;
        }
        if(numberFlag && capitalFlag && length)
            return true;
    }
    return false;
    }
    
    
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        //14. Készíts metódust, ami egy átadott jelszóról eldönti, hogy valid -e. A bemenő paramétere egy String legyen, visszatérési értéke igaz/hamis logikai érték!
        System.out.println("Kérek egy jelszót");
        if (jelszo614(scan.next())) {
            System.out.println("Jelszó elfogadva");
        } else {
            System.out.println("A jelszónak kell tartalmaznia 8 karatkert,  nagybetűt és számot");
    }
        
        
        
    }
    
}

package pkg4ora;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        /*
        int a = 12;
        float b = 13.5f;
        char c = 'a';
        String d = "alma";
        boolean x = true;
        
        for (int i = 0; i <= 40; i++) {
            if (i % 3 == 0){
                System.out.println(i);
            }else {
                System.out.println("mimo");
            }
            
        }
        
        int i = 0;
        while (i <=4){
            if (i % 3 == 0){
                System.out.println(i);
            }else {
                System.out.println("mimo");
            }
            i++;
        }
        
        
        int num1 = 0;
        int num2 = 1;
        
        int num3 = 1;
        
        //num3 = num2 + num1;
        
        System.out.println(num1);
        System.out.println(num2);
        for (int j = 0; j <= 20; j++) {
            num1 = num1 + num2;
            System.out.println(num1);
            num2 = num1 + num2;
            System.out.println(num2);
            
        }
        
        num1 = 0;
        num2 = 1;
        num3 = 1;
        System.out.println(num1);
        System.out.println(num2);        
        for (int j = 0; j <= 40; j++) {
            num3 = num2 + num1;
            num1 = num2;
            num2 = num3;
            System.out.println(num3);
            
        }
        num1 = 0;
        num2 = 1;
        num3 = 1;
        System.out.println(num1);
        System.out.println(num2);
        int a1= 10;
        for (int j = 0; j <= a1; j++) {
            num3 = num2 + num1;
            num1 = num2;
            num2 = num3;
            System.out.println(num3);
            
        }
        
        
        int pr = scan.nextInt();
        int co = 0;
        for (int j = 1; j <= pr; j++) {
            if (pr%j == 0) {
                co++;
                System.out.println(j);
            }
            
        }
        if (co == 2){
            System.out.println(pr + " prímszám");
        }
        boolean prime;
        int prim =1;
        int primTotal = 0;
        while (primTotal <= 100){
        prime = true;
            for (int j = 2; j <= prim/2; j++) {
                if (prim % 1 == 0){
                     prime = false;
                }
                
            }
            if(prime) {
             primTotal++;
                System.out.println(prim);
            }
            prim++;
        }
        //*/
        
        int a4 = 6556;
        int b4 = 0;
        int c4 = a4;
        while( a4 != 0){
            b4 = b4 * 10 + (a4%10);
            a4=a4/10;
        }
        if(c4 == b4){
            System.out.println("palindrom");
        }else{
            System.out.println("nem");
        }
        
        
          int x = 5, n=2;
        if (x >= n)
            System.out.println(x+">="+n);
        else
           System.out.println(x+"<"+n);
        
        int jegy= 3;
        if (jegy>= 5)
            System.out.println("Jeles");      
        if (jegy>= 4)
            System.out.println("Jó");      
        if (jegy>= 3)
            System.out.println("Közepes");      
        if (jegy>= 2)
            System.out.println("Elégséges");      
        if (jegy>=1)
            System.out.println("Elégtelen");
        
        
        
        int a41;
    }
    
}

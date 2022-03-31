package kozep;

import java.util.Scanner;

public class Kozep {

    //15. Készíts metódust, ami két pont x és y koordinátáiból kiszámítja a két pont közötti távolságot

    public static void szakasz615(double a, double b, double c, double d) {
        System.out.println(Math.sqrt(Math.pow((c - a), 2) + Math.pow(d - b, 2)));
    }

    //16. Készíts metódust, ami két pont x és y koordinátáiból kiszámítja a két pontra illeszkedő egyenes meredekségét.
    public static void egyenes616(double a, double b, double c, double d) {
        double v1 = b - a;
        double v2 = d - c;
        double n1 = -v2;
        double n2 = v1;
        System.out.println("m = " + (n2 / n1));
    }

    //17. Készíts metódust, ami másodpercben (integer érték) megadott időértéket átszámít óra:perc:másodperc alakba! A visszaadott értéket szövegként adja vissza. Pl. 12:20:22
    public static void ora617(int a) {
        int o = 0;
        int p = 0;

        while (a > 60) {
            if (a >= 60 * 60) {
                o++;
                a = a - 60 * 60;
            } else if (a >= 60) {
                p++;
                a = a - 60;
            }
        }
        System.out.println(o + ":" + p + ":" + a);
    }

    //18. Készíts programot, amely bekér a felhasználótól egy egész számot, és eldönti, hogy prímszám-e! A visszatérési érték logikai típusú legyen! 
    public static boolean prim618(int a) {
        boolean prim = true;
        for (int i = 2; i <= a; i++) {
            if (a % i == 0) {
                prim = false;
            }
        }
        return prim;
    }

    //19. Készíts túlterhelt statikus metódusokat minimum() néven, amelyek átadott minimumát adják vissza! A main() kérje be a számokat a felhasználótól, és az írja ki az eredményt is!
    //a. 2 egész szám
    public static int minimum619(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }
    //b. 3 egész szám
    public static int minimum619(int a, int b, int c) {
        if (a > b && a > c) {
            return a;
        } else if (b > a && b > c) {
            return b;
        } else {
            return c;
        }
    }
    //c. 2 valós szám
    public static double minimum619(double a, double b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }
    //d. 3 valós szám
    public static double minimum619(double a, double b, double c) {
        if (a > b && a > c) {
            return a;
        } else if (b > a && b > c) {
            return b;
        } else {
            return c;
        }
    }
    //e. 1 egész- és 1 valós szám
    public static double minimum619(int a, double b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }
    //f. 2 egész és egy valós szám
    public static double minimum619(int a, int b, double c) {
        if (a > b && a > c) {
            return a;
        } else if (b > a && b > c) {
            return b;
        } else {
            return c;
        }
    }
    //g. 1 egész- és két valós szám
        public static double minimum619(int a, double b, double c) {
        if (a > b && a > c) {
            return a;
        } else if (b > a && b > c) {
            return b;
        } else {
            return c;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //15. Készíts metódust, ami két pont x és y koordinátáiból kiszámítja a két pont közötti távolságot
        System.out.println("Adja meg az első pont x y koordinátáit");
        double a615 = scan.nextDouble();
        double b615 = scan.nextDouble();
        System.out.println("Adja meg a második pont x y koordinátáit");
        double c615 = scan.nextDouble();
        double d615 = scan.nextDouble();
        szakasz615(a615, b615, c615, d615);

        //16. Készíts metódust, ami két pont x és y koordinátáiból kiszámítja a két pontra illeszkedő egyenes meredekségét.
        System.out.println("Adja meg az első pont x y koordinátáit");
        double a616 = scan.nextDouble();
        double b616 = scan.nextDouble();
        System.out.println("Adja meg a második pont x y koordinátáit");
        double c616 = scan.nextDouble();
        double d616 = scan.nextDouble();
        egyenes616(a616, b616, c616, d616);

        //17. Készíts metódust, ami másodpercben (integer érték) megadott időértéket átszámít óra:perc:másodperc alakba! A visszaadott értéket szövegként adja vissza. Pl. 12:20:22
        System.out.println("Kérem a másodpercet");
        ora617(scan.nextInt());

        //18. Készíts programot, amely bekér a felhasználótól egy egész számot, és eldönti, hogy prímszám-e! A visszatérési érték logikai típusú legyen! 
        System.out.println("Kérek egy egész számot");
        if (prim618(scan.nextInt())) {
            System.out.println("A szám prímszám");
        } else {
            System.out.println("A szám nem prím");
        }

        //19. Készíts túlterhelt statikus metódusokat minimum() néven, amelyek átadott minimumát adják vissza! A main() kérje be a számokat a felhasználótól, és az írja ki az eredményt is!
        //a. 2 egész szám
        System.out.println("Kérek 2 egész számot");
        System.out.println(minimum619(scan.nextInt(), scan.nextInt()));
        //b. 3 egész szám
        System.out.println("Kérek 3 egész számot");
        System.out.println(minimum619(scan.nextInt(), scan.nextInt(), scan.nextInt()));
        //c. 2 valós szám
        System.out.println("Kérek 2 valós számot");
        System.out.println(minimum619(scan.nextDouble(), scan.nextDouble()));
        //d. 3 valós szám
        System.out.println("Kérek 3 valós számot");
        System.out.println(minimum619(scan.nextDouble(), scan.nextDouble(), scan.nextDouble()));
        //e. 1 egész- és 1 valós szám
        System.out.println("Kérek 1 egész és 1 valós számot");
        System.out.println(minimum619(scan.nextInt(), scan.nextDouble()));
        //f. 2 egész és egy valós szám
        System.out.println("Kérek 2 egész és 1 valós számot");
        System.out.println(minimum619(scan.nextInt(), scan.nextInt(), scan.nextDouble()));
        //g. 1 egész- és két valós szám
        System.out.println("Kérek 1 egész és 2 valós számot");
        System.out.println(minimum619(scan.nextInt(), scan.nextDouble(), scan.nextDouble()));
        
    }

}

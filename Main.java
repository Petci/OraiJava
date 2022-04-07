package pkg5ora;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void kiir(int[][] array) {
        System.out.println("Array:");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[i][j]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random rnd = new Random();

        //int int_random = rnd.nextInt(25);
        //System.out.println(int_random);
        int[][] array = {{3, 3, 3}, {3, 3, 3}, {3, 3, 3}};
        boolean start = true;

        System.out.println("Array:");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[i][j]);
            }
            System.out.println();
        }

        while (start) {

            boolean random_start = true;
            while (random_start) {
                int i_random = rnd.nextInt(3);
                int j_random = rnd.nextInt(3);

                if (array[i_random][j_random] == 3) {
                    array[i_random][j_random] = 1;
                    random_start = false;
                }
            }

            System.out.println("Array:");
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array.length; j++) {
                    System.out.print(array[i][j]);
                }
                System.out.println();
            }

            int i_user, j_user;

            start=false;
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array.length; j++) {
                    if (array[i][j] == 3) {
                        start=true;
                    }
                    
                }
                
            }
            
            
            
            
            boolean user_start = true;
            while (user_start&&start) {
                System.out.println("i = ?");
                i_user = scan.nextInt();

                System.out.println("j = ?");
                j_user = scan.nextInt();

                if (array[i_user][j_user] == 3) {
                    array[i_user][j_user] = 0;
                    user_start = false;
                } else {
                    System.out.println("Invalid i & j");
                }
            }

            System.out.println("Array:");
            start = false;
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array.length; j++) {
                    System.out.print(array[i][j]);
                    if (array[i][j] == 3) {
                        start = true;
                    }
                }
                System.out.println();
            }
        }
    }

}

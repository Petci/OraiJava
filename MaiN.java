package pkg7ora;

import java.util.Arrays;
import java.util.Random;

public class MaiN {

    public static void main(String[] args) {
        int c = 10;
        int ai = 4;
        int aj = 4;
        int[][] ker = new int[ai][aj];
        int[] sor = new int[c];
        int[] oszlop = new int[c];
        Random rnd = new Random();

        for (int k = 0; k < c; k++) {
            int a = rnd.nextInt(ai*aj);
            int b = 0;
            for (int i = 0; i < ker.length; i++) {
                for (int j = 0; j < ker[0].length; j++) {
                    if (a == b) {
                        ker[i][j] = 1;
                    } else {
                        ker[i][j] = 0;
                    }
                    b++;
                }

            }
            for (int i = 0; i < ker.length; i++) {
                for (int j = 0; j < ker[0].length; j++) {
                    System.out.print(ker[i][j] + ", ");

                }
                System.out.println("");
            }
            int S = 0;
            int O = 0;
            for (int i = 0; i < ker.length; i++) {
                for (int j = 0; j < ker[0].length; j++) {
                    S++;
                    if (ker[i][j] == 1) {
                        System.out.println(S);
                        sor[k] = S;
                    }
                }
            }
            for (int j = 0; j < ker[0].length; j++) {
                for (int i = 0; i < ker.length; i++) {
                    O++;
                    if (ker[i][j] == 1) {
                        System.out.println(O);
                        oszlop[k] = O;
                    }
                }

            }
        }

        System.out.println(Arrays.toString(sor));
        System.out.println(Arrays.toString(oszlop));

        int sá = 0;

        for (int i = 0; i < sor.length; i++) {
            sá += sor[i];
        }
        System.out.println((sá * 1.0) / c);

        int oá = 0;

        for (int i = 0; i < oszlop.length; i++) {
            oá += oszlop[i];
        }
        System.out.println((oá * 1.0) / c);

    }

}

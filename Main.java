package pkg5ora;

public class Main {

    public static void main(String[] args) {
        int x = 34;
        int[] array = {4, 7, 6, 4, 8, 2, 9, 6, 4 , 1, 2, 3, 4, 5, 6, 7, 8};
        //int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int number;        
        boolean checked = true; 
        int count = 0;
        int total = array.length-1;

        while (checked) {
            checked = false;
            for (int i = 0; i < total; i++) {
                count++;
                if (array[i] > array[i + 1]) {
                    number = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = number;
                    checked = true;
                }

            }
            total--;

        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);

        }
        System.out.println(count);
    }

}

// Write a program to find second-largest number in  an array without using array.sort

import java.util.Random;

public class PTS_Exercise7 {
    public PTS_Exercise7() {
        int max = 0;
        int max2 = 0;
        int[] lista = new int[10];
        Random rand = new Random();

        for (int i = 0; i < 10; i++) {
            lista[i] = rand.nextInt(50) + 1;
            System.out.print(lista[i] + ", ");
        }
        System.out.println();

        for (int i = 0; i < 10; i++) {
            if (max < lista[i]) {
                max = lista[i];
            }
        }

        for (int i = 0; i < 10; i++) {
            if (max != lista[i]) {
                if (max2 < lista[i]) {
                    max2 = lista[i];
                }
            }
        }

        System.out.println("El segundo mayor número es: " + max2);
        {
        }
    }
}
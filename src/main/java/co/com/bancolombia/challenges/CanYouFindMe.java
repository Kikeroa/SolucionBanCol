package co.com.bancolombia.challenges;

import java.io.IOException;
import java.util.*;
import java.util.stream.IntStream;

public class CanYouFindMe {

    /*
    * Autor: Edgar Enrique Roa Perez.
    * Fecha: 14 de Marzo de 2024.
    * Pruebas unitarias exitosas.
    * Solucion en el metodo lostAndFound
     * */
    public int[] lostAndFound(int[] numbers, int resultSize) {
        Set<Integer> set = new HashSet<>();
        int[] result = new int[resultSize];
        int count = 0;

        for (int num : numbers) {
            if (num > 0) {
                set.add(num);
            }
        }

        int i = 1;
        while (count < resultSize) {
            if (!set.contains(i)) {
                result[count] = i;
                count++;
            }
            i++;
        }

        return result;
    }

    public static void main(String[] args) throws IOException {
        final CanYouFindMe canYouFindMe = new CanYouFindMe();
        Random random = new Random(47);

        final IntStream ints = random.ints(150_000_000, -100_000_000, 150_000_000);
        final int[] array = ints.toArray();

        final long init = System.currentTimeMillis();
        final int[] partialSolution = canYouFindMe.lostAndFound(array, 500);
        final long total = System.currentTimeMillis() - init;
        System.out.println("First 20 missing positive integers: " + Arrays.toString(partialSolution));
        System.out.println(total+"ms");
    }
}

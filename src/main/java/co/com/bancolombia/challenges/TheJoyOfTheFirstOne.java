package co.com.bancolombia.challenges;

import java.io.*;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Random;
import java.util.stream.IntStream;

public class TheJoyOfTheFirstOne {

    /*
     * Autor: Edgar Enrique Roa Perez.
     * Fecha: 14 de Marzo de 2024.
     * Pruebas unitarias exitosas.
     * Solucion en el metodo letsGoParty
     * */
    public int[] letsGoParty(int[] bigArray, int resultSize){
        // Utilizamos un max heap para mantener los 50 elementos más pequeños
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(resultSize, (a, b) -> Integer.compare(b, a));

        // Agregamos los primeros 50 elementos al max heap
        for (int i = 0; i < resultSize; i++) {
            maxHeap.offer(bigArray[i]);
        }

        // Iteramos sobre el resto de elementos y mantenemos solo los 50 más pequeños
        for (int i = resultSize; i < bigArray.length; i++) {
            if (bigArray[i] < maxHeap.peek()) {
                maxHeap.poll();
                maxHeap.offer(bigArray[i]);
            }
        }

        // Convertimos el max heap a un array
        int[] resultArray = new int[resultSize];
        for (int i = resultSize - 1; i >= 0; i--) {
            resultArray[i] = maxHeap.poll();
        }

        return resultArray;
    }


    public static void main(String[] args) throws IOException {
        TheJoyOfTheFirstOne joy = new TheJoyOfTheFirstOne();

        Random random = new Random(42);
        final IntStream ints = random.ints(200_000_000, 0, Integer.MAX_VALUE);
        int[] array = ints.toArray();

        long init = System.currentTimeMillis();
        final int[] solution = joy.letsGoParty(array, 50);
        System.out.println("First 50 elements: " + Arrays.toString(solution));
        System.out.println("Time: " + (System.currentTimeMillis()-init) + "ms");
        System.out.println("Fin");
    }

}

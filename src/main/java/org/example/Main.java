package org.example;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;
// Посмотрите на этот код. Все ли с ним хорошо? Если нет, то скорректируйте его и
//обоснуйте свое решение

public class Main {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int[] arr = new int[10];
//        System.out.println("Укажите индекс элемента массива, в который хотите записать значение 1");
//
//        try {
//            int index = scanner.nextInt();
//            try {
//                arr[index] = 1;
//                System.out.println(Arrays.toString(arr));
//            } catch (ArrayIndexOutOfBoundsException e) {
//                System.out.println("Указан индекс за пределами массива.");
//            }
//        } catch (Exception e) {
//            System.out.println("Нужно число");
//        }
//    }

    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            int[] arr = new int[10];
            System.out.println("Укажите индекс элемента массива, в который хотите записать значение 1");
            int index = scanner.nextInt();
            arr[index] = 1;
            System.out.println(Arrays.toString(arr));

        } catch (IndexOutOfBoundsException e) {
            System.out.println("Вылет за массив");
        } catch (InputMismatchException e) {
            System.out.println("Нужно число");
        }
    }
}
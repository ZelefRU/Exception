package org.example;

public class Task2 {

    public static void main(String[] args) {
        String[][] arr = {{"1", null, "3"}, {"6", "1", "2"}};
        System.out.println(sum2d(arr));
    }

    public static Integer sum2d(String[][] arr) {
        int sum = 0;

        try {
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[1].length; j++) {
                    int value = 0;
                    try {
                        value = Integer.parseInt(arr[i][j]);
                    } catch (NumberFormatException ignored) {}
                    sum += value;
                }
            }
            return sum;
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Вылет за массив");
        } catch (NullPointerException e) {
            System.out.println("Ошибка NullPointer");
        }
        return null;
    }
}

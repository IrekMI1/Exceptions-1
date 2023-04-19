package Seminar1;

import java.util.Arrays;

public class HW1 {
    //Реализуйте 3 метода, чтобы в каждом из них получить разные исключения:

    public static int divide(int num1, int num2) {
        if (num2 == 0) {
            throw new ArithmeticException();
        }
        return num1 / num2;
    }

    public static void printArr(int[] arr) {
        if (arr == null) {
            throw new NullPointerException();
        }
        System.out.println(Arrays.toString(arr));
    }

    public static int maxValue(int[] arr) {
        if (arr.length < 2) {
            throw new RuntimeException("Длина массива меньше 2");
        }
        return Arrays.stream(arr).max().getAsInt();
    }

    /*
    Реализуйте метод, принимающий в качестве аргументов два целочисленных массива,
    и возвращающий новый массив, каждый элемент которого равен разности элементов
    двух входящих массивов в той же ячейке. Если длины массивов не равны,
    необходимо как-то оповестить пользователя.
    */

    public static int[] arrSub(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length) {
            throw new RuntimeException("Длины массивов не равны");
        }

        int[] resultArr = new int[arr1.length];
        for (int i = 0; i < arr1.length; i++) {
            resultArr[i] = arr1[i] - arr2[i];
        }
        return resultArr;
    }

    /*
    Реализуйте метод, принимающий в качестве аргументов два целочисленных массива,
    и возвращающий новый массив, каждый элемент которого равен частному элементов
    двух входящих массивов в той же ячейке. Если длины массивов не равны,
    необходимо как-то оповестить пользователя. Важно: При выполнении метода единственное исключение,
    которое пользователь может увидеть - RuntimeException, т.е. ваше.
    */

    public static int[] arrDiv(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length) {
            throw new RuntimeException("Длины массивов не равны");
        }

        int[] resultArr = new int[arr1.length];
        try {
            for (int i = 0; i < arr1.length; i++) {
                resultArr[i] = arr1[i] / arr2[i];
            }
        } catch (ArithmeticException e) {
            System.out.println("Деление на 0.");
        }
        return resultArr;
    }
}

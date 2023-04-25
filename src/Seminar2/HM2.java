package Seminar2;

import java.util.InputMismatchException;
import java.util.Objects;
import java.util.Scanner;

public class HM2 {
    /**
     * Метод запрашивает у пользователя ввод дробного числа (типа float),
     * и возвращает введенное значение.
     *
     * @return число типа float
     */
    public static float getNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите дробное число:\t");
        try {
            return scanner.nextFloat();
        } catch (InputMismatchException e) {
            System.out.println("Неверный ввод.");
        }
        return getNumber();
    }

    /**
     *  Метод, который выбросит Exception, когда пользователь вводит пустую строку
     */
    public static void getString() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите строку:\t");
        String str = scanner.nextLine();
        if (Objects.equals(str, "") || Objects.equals(str, " ")) {
            throw new RuntimeException("Ввод пустой строки недопустимо!");
        }
        System.out.println("Операция выполнена успешно.");
    }

}

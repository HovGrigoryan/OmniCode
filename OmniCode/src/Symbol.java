import java.io.*;
import java.util.Scanner;


public class Symbol {

    public static void main(String[] args) {
        renderString();
        System.out.println();
        simple(45);
        System.out.println(isSimpleNumber(5));
        square();
        threeAngle();
        maxNumber();
    }

    private static void renderString() {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int symbolCount = name.length();
        if (symbolCount > 6) {
            renderString();
        }
        printConsole(name, "");

    }


    static void printConsole(String str, String ans) {
        if (str.length() == 0) {
            System.out.print(ans + " ");
            return;
        }

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            String ros = str.substring(0, i) + str.substring(i + 1);
            printConsole(ros, ans + ch);

        }
    }


    public static void simple(int i) {
        for (; ; ) {
            for (int j = 2; j <= 10; j++) {
                if (i % j == 0 && i != j) {
                    i--;
                }
            }
            System.out.println(i);
            break;
        }
    }

    public static boolean isSimpleNumber(int i) {
        for (int j = 2; j < 10; j++) {
            if (i % j != 0 || i == j) {
                continue;
            }
            return false;

        }
        return true;

    }

    public static void square() {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void threeAngle() {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void maxNumber() {
        int max;
        int[] array = {5, 50, 3, 70, 150, 61};
        max = array[0];
        for (int i = 0; i < array.length - 1; i++) {
            if (max < array[i + 1]) {
                max = array[i + 1];
            }
        }
        System.out.println(max);
    }
}







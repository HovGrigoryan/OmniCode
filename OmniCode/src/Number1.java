import java.util.Scanner;

public class Number1 {

    public static void main(String[] args) {
        renderString();
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
}

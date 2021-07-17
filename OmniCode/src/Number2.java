public class Number2 {

    public static void main(String[] args) {
        simple(45);
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
}

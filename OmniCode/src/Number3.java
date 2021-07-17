public class Number3 {


    public static void main(String[] args) {
        System.out.println(isSimpleNumber(5));
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
}

public class Number5 {

    public static void main(String[] args) {

        threeAngle();

    }
    public static void threeAngle() {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

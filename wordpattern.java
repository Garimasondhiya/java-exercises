/**
 * arithmetic
 */
public class wordpattern {
    public static void main(String[] args) {
        int n = 4;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {

                if ((i + j) % 2 == 0) {
                    System.out.print("G");

                } else {
                    System.out.print("s");
                }
            }
            System.out.println();
        }
    }
}
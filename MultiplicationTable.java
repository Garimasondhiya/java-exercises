import java.util.Scanner;

/**
 * function
 */
// public class function {
// public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
// int n =sc.nextInt();
// //  if(number % 2==0){
// //     System.out.println("this is even number");
// //  } else{
// //     System.out.println("this is odd number");
// //  }
//       for(int i = 1 ; i<=n ; i++){
//         for(int m = 1; m<=i ; m++){
//             System.out.println(i);
//         }
//       }
// }
// Scanner sc = new Scanner(System.in);
   

public class MultiplicationTable {
    public static void main(String[] args) {
        int n = 10; // Size of the multiplication table
        printMultiplicationTable(n);
    }

    public static void printMultiplicationTable(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(i * j + "\t");
            }
            System.out.println();
        }
    }
}

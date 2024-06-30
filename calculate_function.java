import java.util.*;

public class calculate_function {

    public static void calculateSum( int a, int b) {
        int Sum=  a +  b;
        System.out.println(Sum);
        
    }

    public static void main(String args[]) {
        Scanner Sc = new Scanner(System.in);
        int a = Sc.nextInt();
        int b = Sc.nextInt();
        int sum = a + b;
        calculateSum( a,  b);
 
    }

}


import java.util.*;
public class CeateArrey {   
   public static void main(String[] args) {

        

       // int marks []= {55,60, 34};
      /*  int number[]=   new int [3] ; 
       number [0]= 4;
       number [1]= 5;
       number [2]= 3;
     
            for (int i = 0; i<3;i++){
               System.out.println(number [i]);
            }*/

              // int marke []= { 55,66,78};

              // for (int i = 0; i<3;i++){
              //   System.out.println(marke[i]);
              // }(
                  Scanner sc = new Scanner(System.in);
                  int size = sc.nextInt();
                  int number[]=new int [size];
                   
                   for (int i= 0 ; i<size; i++){
                     number[i]= sc.nextInt();
                   }
                   for (int i= 0 ; i<= size; i++){
                     System.out.println(number[i]);
}
   }
}
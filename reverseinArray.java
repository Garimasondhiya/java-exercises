 /**
  * reverseinArray
  */
  import java.util.*;
 public class reverseinArray {
 
     public static void main(String[] args) {
        int array[]={ 21,22,23,24,25,26};
         int first=0 ,last =array.length-1;
          while(first<last){

             int temp= array[first];
            array[first]= array[last];
            array[last]=  temp;
            first++;
            last--;
        }
        System.out.print(array.toString());

    }
        
}
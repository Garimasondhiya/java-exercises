public class maxinArray {
    public static void main(String []args){
       int array[]={34,56,32,768};
            // int largest = array[0];
            // for(int i= 1; i<array.length; i++){
            //     if(largest<array[i]){
            //         largest=array[i];

            //     }
                
            // }
            // System.out.println(largest);
            int smallest = array[0];
                for(int i= 1; i<array.length; i++){
                    if(smallest>array[i]){
                        smallest=array[i];
                    }
                }
                System.out.println(smallest);
            }
        }
    
public class secondlargestinArray {
    public static void main(String[] args) {
        int array[]={3,6,2,2,65,453,3425,4};
          int largest = Integer.MIN_VALUE;
          int sclargest= Integer.MIN_VALUE;



          for(int i = 0; i<array.length; i++){
               if(largest<array[i]){
                largest=array[i];
               }
            }
            System.out.println(largest );
               for(int i = 0; i<array.length; i++){
                 if(sclargest<array[i] && array[i]!=largest){
                    sclargest = array[i];
                 }

          
          }
          System.out.println(sclargest );
               }
            }
    
                 

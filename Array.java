/**
 * Array
 */
public class Array {

     // public static void main(String[] args) {
          //  int [] number= new int[5]; 
               
             
            // public static void length(int n []){
                
            //     System.out.println(n);
            // }
            
            // public static void main(String []args){
            // int n[]={5};

            // length(n);
                  public static void marks(int marks[]){      //array pass kiye hai as a parameter
                    for(int i=0 ; i<marks.length; i++){
                             marks[i]= marks[i] + 1;
                            //  System.out.println(marks);
                    }
                    
                  }
                    public static void main(String []args){
                      int marks[]= {54,56,34};
                      marks(marks);
                      for(int i=0 ; i<marks.length; i++){
                        System.out.println(marks[i]+ " ");
                          
                    }
                    }
                    
                      


            }
                   

// }

      

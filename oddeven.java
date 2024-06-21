public class oddeven {
    public static void main(String[] args) {
        int number = 9;
        if( number % 2 == 0){
             System.out.println("EVEN");
        } 
        else if ( number % 3==0){
            System.out.println("ODD");
        }
       else{
        System.out.println("nothing");
       }
    }
}

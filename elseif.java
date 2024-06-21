
public class elseif {

   public static void main(String[] args) {
      int number = 9;
      if (number % 3 == 0) {
         System.out.println("garima");
      }
     else if (number % 5 == 0) {
         System.out.println("sheru");
      }
      else if (number % 3 == 0 && number % 5 == 0) {
         System.out.println("kitty");
      }
     else if (number % 3 == 0 || number % 5 == 0) {
         System.out.println("laptop");
      } else {
         System.out.println("nothing");
      }

   }

}

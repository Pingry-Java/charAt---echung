//This method returns the character located at the String's specified index.
//The string indexes start from zero.

//parameter − index − Index of the character to be returned
//returns - a char at the specified index in the string
public class charAt {

   public static void main(String args[]) {
      String str = "Compiler";
      char one = str.charAt(0);
      char two = str.charAt(1);
      char three = str.charAt(1);
      char four = str.charAt(5);
      
      System.out.println(one);
      System.out.println(two);
      System.out.println(three);
      System.out.println(four);
   }
}
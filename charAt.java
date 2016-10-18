//This method returns the character located at the String's specified index.
//The string indexes start from zero.

//parameter − index − Index of the character to be returned
//returns - a char at the specified index in the string

/**
 * This class demonstrates how the method "charAt" works
 * @author Ethan Chung
 * @version 1.0
 */
public class charAt
{
	/**
      * Main method uses charAt to spell out "cool" by using letters from the word "compiler"
      * @param args Standard array of commandline String arguments. Not used in this program.
      */  
	public static void main(String args[])
	{
		String str = "Compiler";
		char one = str.charAt(0);
		char two = str.charAt(1);
		char three = str.charAt(1);
		char four = str.charAt(5);
		
		System.out.print(one);
		System.out.print(two);
		System.out.print(three);
		System.out.println(four);
	}
}
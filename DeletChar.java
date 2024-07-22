package BasicProgram;

import java.util.Scanner;

public class DeletChar {

	public static void main(String[] args) {
		String originalString ="Hello World";
        Scanner sc = new Scanner(System.in); 
        System.out.println("Enter character to delete");
        char charToRemove = sc.next().charAt(0);       
         String modifiedString = removeCharacter(originalString, charToRemove);  
         System.out.println("Original String: " + originalString);
          System.out.println("Modified String: " + modifiedString);
   }
public static String removeCharacter(String str, char ch)
{
   StringBuilder sb = new StringBuilder();
   for(char c : str.toCharArray())
   {
       if(c!=ch)
       {
            sb.append(c);
       }
   }
   return sb.toString();

	}

}

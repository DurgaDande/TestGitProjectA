package BasicProgram;

import java.util.Scanner;

public class RemoveCharInString {

	public static void main(String[] args) {
        String originalString ="Hello World";
        Scanner sc = new Scanner(System.in); 
        System.out.println("Original String:  "+originalString);
        System.out.println("Enter character to delete");
        char charToRemove = sc.next().charAt(0);       
         String modifiedString = removeCharacter(originalString, charToRemove);  
         System.out.println("Original String: " + originalString);
          System.out.println("Modified String: " + modifiedString);
   }
public static String removeCharacter(String str, char ch)
{
   StringBuilder stringBuilder = new StringBuilder();
   for(char c : str.toCharArray())
   {
       if(c!=ch)
       {
            stringBuilder.append(c);
       }
   }
   return stringBuilder.toString();
}
   

	}



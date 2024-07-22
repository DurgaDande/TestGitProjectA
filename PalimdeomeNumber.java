package BasicProgram;

public class PalimdeomeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
			  String s= "Palindrome";
			   String rev="";
			   String s1=s;
			   for(int i= s.length()-1;i>=0;i--)
			   {
			     rev=rev+s.charAt(i);
			   
			  }
			  System.out.println(rev);
	
	
			if(s1.equals(rev))
			{
			System.out.println("string is a palindrom string: "+rev);
			}
			else
			{
			System.out.println("String is not a palindrome string: "+s);
			}
			}

	}



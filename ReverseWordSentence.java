package BasicProgram;

public class ReverseWordSentence {

	public static void main(String[] args) {
		

				// TODO Auto-generated method stub
				//define a String java
		String str="hello i good";
		//split string
		String str1[]=str.split(" ");
		//store value after split in new variable
		String result="";
		System.out.println("Original String:  "+str);
		//using for loop we find lenght of string
		for(int i=0;i<str1.length;i++)
		{
			//define one string and store value of str1[]i
			String str2=str1[i];
			//store value of str2 in new string so we create new String
			String str3="";
			for(int j=str2.length()-1;j>=0;j--)
			{
				str3=str3+str2.charAt(j);
			
			}
			result=result+str3+" ";
		}
		System.out.println("Reverse String: "+result);

			}

		}


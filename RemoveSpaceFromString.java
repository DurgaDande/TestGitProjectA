package BasicProgram;

public class RemoveSpaceFromString {

	public static void main(String[] args) {
		String s="MY Friend is Sonali";
		String Space="";
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(ch!=' ')
			{
				Space+=ch;
			}
			
		}
		System.out.println("Original String:"+s);
		System.out.println("String after removing Space:"+Space);
		System.out.println("Total number of charactor   "+Space.length());


	}

}

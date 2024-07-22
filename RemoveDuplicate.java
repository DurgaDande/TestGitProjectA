package BasicProgram;

public class RemoveDuplicate {

	public static void main(String[] args) {
		String str="ccddttentrrok";
		StringBuilder sb1=new StringBuilder();
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			int idx=str.indexOf(ch,i+1);
			if(idx==-1)
			{
				sb1.append(ch);
			}

			}
		System.out.println(sb1);

	}

}

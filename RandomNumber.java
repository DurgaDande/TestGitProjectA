package BasicProgram;

import java.util.Random;

public class RandomNumber {

	public static void main(String[] args) {
		int num=20;
		for(int i=0;i<5;i++)
		{
			Random r=new Random();
			num=r.nextInt(50);
			System.out.println(num);
		}

	}

}

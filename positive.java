package guvi;

import java.util.Scanner;

public class positive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		if(a==0)
		{
			System.out.println("the given number is zero");
		}
		else if(a<0)
		{
			System.out.println("the given number is negative");
		}
		else
		{
			System.out.println("the given number is positive");
		}

	}

}

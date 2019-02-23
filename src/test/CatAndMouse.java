package test;

import java.util.Scanner;
import java.lang.*;

public class CatAndMouse {
	
	Scanner sc=new Scanner(System.in);
	public int input()
	{
		int n=sc.nextInt();
		return n;
	}
	
	public static void catAndMouse(int x,int y,int z)
	{
		int a=0;
		int b=0;
		
		//if(x>z)
			//a=x-z;
		//else
			//a=z-x;
		
		//if(y>z)
			//b=y-z;
		//else
			//b=z-y;
		
	 a=Math.abs(x-z);
	 b=Math.abs(y-z);
		
		
		if(b>a)
			System.out.println("Cat A");
		else if(a>b)
			System.out.println("Cat B");
		else
			System.out.println("Mouse C");		
		
	}
	
	public static void main(String[] args) {

		CatAndMouse cm=new CatAndMouse();
		catAndMouse(cm.input(), cm.input(), cm.input());
	}

}

package test;

import java.util.Scanner;

public class MarsExploration {

	Scanner sc=new Scanner(System.in);
	
	public String acceptInput()
	{
		String s=sc.next();
		return s;	
	}
	
	public static void marsExploration(String s)
	{
		int count=0;
	for(int i=0;i<s.length();i++)
	{
		if(s.charAt(i)!='S' && s.charAt(i)!='O')
		count++;
	}
	
	System.out.println(count);
	}
	public static void main(String[] args) {
		MarsExploration m=new MarsExploration();
		marsExploration(m.acceptInput());
	}

}

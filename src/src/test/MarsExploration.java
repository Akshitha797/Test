package test;

import java.util.Scanner;

public class MarsExploration {

	Scanner sc=new Scanner(System.in);
	
	public String acceptInput()
	{
		String s=sc.next();
		return s;	
	}
	
	public static int marsExploration(String s)
	{
		int count=0;
	for(int i=0;i<s.length();i++)
	{
		if(s.charAt(i)!='S' && s.charAt(i)!='O')
		count++;
	}
	
	return count;
	}
	public static void main(String[] args) {
		MarsExploration m=new MarsExploration();
		System.out.println(marsExploration(m.acceptInput()));
	}

}

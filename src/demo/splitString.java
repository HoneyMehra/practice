package demo;

import java.util.Scanner;

public class splitString {

	public static void main(String[] args) {
		String s="himanshumehra";
		System.out.println("enter the number to split string");
		Scanner sc= new Scanner(System.in);
		int num=sc.nextInt();
		int len = s.length();
		if(num<0 || num>len)
		{
			System.out.println("enter valid number");
		}
		else {
		String str= s.substring(0, num);
		System.out.println(str);
		}
	}

}

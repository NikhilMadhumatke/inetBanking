package com.inetBanking.testCases;

import java.util.LinkedHashSet;

public class TC002 {
	
public static void main(String[] args) {
		
		String s="indiaaaaaaaa";
		LinkedHashSet<Character> set = new LinkedHashSet();
		for(int i=0;i<s.length();i++)
		{
			set.add(s.charAt(i));
		}
		
		for (Character ch : set)
		{
			System.out.print(" "+ch);
		}
		
	}

}

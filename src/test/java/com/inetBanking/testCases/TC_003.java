package com.inetBanking.testCases;

public class TC_003 {

	public static void main(String[] args) {
		
		int EvenSum=0;
		int OddSum=0;
		int[] a= {5,2,1,4,6,3};
		for(int i=0;i<a.length;i++)
		{
				if(a[i]%2==0)
				{
					EvenSum=EvenSum+a[i];
				}
				else
				{
					OddSum=OddSum+a[i];
				}
			
		}
		
		System.out.println("Sum of Even numbers is = "+EvenSum);
		System.out.println("Sum of Odd numbers is = "+OddSum);

	}

}

package com.syntax.class10;

public class GroupHomeWorkTask4 {

	public static void main(String[] args) {
		/*
		 * Create a 2D array of integers. 
		 * Develop a program which will calculate the sum of  even and odd numbers for that array.
		 */

		int[][] numbers= {
				{11,20,35,40},//0
				{101,200,305,436},//1
				{1033,2000,3055,4500}//2		
		};
		int sumOdd=0;
		int sumEven=0;
		for(int i=0;i<numbers.length;i++) {
			for(int j=0;j<numbers[i].length;j++) {
				if(numbers[i][j]%2==0) {
					sumOdd+=numbers[i][j];
			}else if(numbers[i][j]%2!=0) {
				    sumEven+=numbers[i][j];
			}
		}
	}
		System.out.println(sumEven);
		System.out.println(sumOdd);
	}

}

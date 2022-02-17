package com.syntax.class10;

public class GroupHomeWorkTask2 {

	public static void main(String[] args) {
		//Create a 2D array of integer values. Print the sum of all numbers.
		int[][] array= {
				{10, 20, 30},
				{40, 50, 60, 70},
				{80, 90}
		};
		int sum=0;
		for(int i=0;i<array.length;i++) {
			for(int j=0;j<array[i].length;j++) {
				sum+=array[i][j];
			}
		}
        System.out.println(sum);
	}

}

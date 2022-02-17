package com.syntax.class10;

public class GroupHomeWorkTask3 {

	public static void main(String[] args) {
        /*Create a 2D array or integer type where you will store odd and even numbers. 
		 Develop a program which will identify/print the even numbers only.
		 */
		int[][] numbers= {
				{11,20,35,40},//0
				{101,200,305,436},//1
				{1033,2000,3055,4500}//2		
		};
		for(int i=0;i<numbers.length;i++) {
			for(int j=0;j<numbers[i].length;j++) {
				if(numbers[i][j]%2==0) {
					System.out.print(numbers[i][j]+" ");
				}
				
			}
		}
		
	}

}

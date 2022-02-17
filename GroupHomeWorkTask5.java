package com.syntax.class10;

import java.util.Scanner;

public class GroupHomeWorkTask5 {

	public static void main(String[] args) {
	//Write a program to swap 2 numbers without a temporary variable?
		
		Scanner scan=new Scanner(System.in);
		int[] array=new int[2];
		System.out.println("Please enter any 2 numbers");
		for(int i=0;i<array.length;i++) {
			array[i]=scan.nextInt();
		}
		array[0]=array[0]+array[1];
		array[1]=array[0]-array[1];
		array[0]=array[0]-array[1];
		
		System.out.println(array[0]+" "+array[1]);
		
		

	}

}

package com.syntax.class10;

import java.util.Scanner;

public class GroupHomeWorkTask1 {

	public static void main(String[] args) {
//Create an array on int values using a scanner and calculate the sum of all stored elements in that array.

		Scanner scan=new Scanner(System.in);
		int[] value=new int[6];
		int sum=0;
		System.out.println("Please enter the  number");
		for(int i=0;i<value.length;i++) {
			value[i]=scan.nextInt();
			sum+=value[i];
		}
		System.out.println(sum);
		

	}

}

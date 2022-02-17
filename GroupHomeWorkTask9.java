package com.syntax.class10;

public class GroupHomeWorkTask9 {

	public static void main(String[] args) {
	//Write java program to find a second largest number in array
		
	int[] number= {10,20,30,40,50};
	int largest=number[0];
	int secondLargest=number[0];
	
	for(int i=1;i<number.length;i++) {
		if(number[i]>largest) {
			secondLargest=largest;
			largest=number[i];
			
		}else if(number[i]>secondLargest){
			secondLargest=number[i];
		}
		    
	}
	System.out.println("The second largest number is "+secondLargest);
	}
}

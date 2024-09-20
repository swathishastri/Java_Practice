package com.java.examples;

public class Bubblesort {

	public static void main(String[] args) {
		
		int[] numbers = {35,7,25,45,6,87,100};
		
		int temp = 0;
		
		for(int i=0; i<numbers.length; i++) {
			for(int j=i; j<numbers.length;j++) {
				
				if(numbers[i]>numbers[j]) {
					temp = numbers[i];
					numbers[i]=numbers[j];
					numbers[j]=temp;
				}
				
			}
			System.out.println(numbers[i]);
		}
		

	}

}

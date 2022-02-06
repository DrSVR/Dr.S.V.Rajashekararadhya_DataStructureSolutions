package com.greatlearning.driver;

import java.util.Scanner;



public class DriverFloor {

	public static void main(String[] args) {
		StackImplementation s = new StackImplementation();
		//MergeSortAlgorithm mergeSort = new MergeSortAlgorithm();
		System.out.println("Enter the total no of floors in the building");
		Scanner sc = new Scanner(System.in);
		
		int size = sc.nextInt();
		
		System.out.println("Total floor size :"+ size);
		
			
			for (int i = 1; i<=size; i++) {
				
				System.out.println("\nEnter the floor Size given on day:" + i );
				int floorSize = sc.nextInt();
							
				if (floorSize < size) {
					System.out.println("push to stack");
					s.push(floorSize);
					System.out.print("Elements present in stack :");
			        s.printStack();
			        
					
				}
				else if (floorSize == size){
					
					System.out.println(floorSize);
					
							
				}
					
			}
					
	}
}

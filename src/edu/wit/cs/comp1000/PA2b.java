package edu.wit.cs.comp1000;

import java.util.Scanner;

public class PA2b {

	// Jamison Studley
	public static void main(String[] args) {
		
		//program solve quadratic formula ax^2+bx+c = 0
		//initializing variables 
		double disc;
		double root;
		//initializinfg scanner 
		Scanner input = new Scanner(System.in);
		
		System.out.printf("Enter a b c: ");
		//user inputs
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		//calculating the discriminitory 
		disc = (b*b)-(4*(a*c));
		//checking if root is real or imaginary and outputing result 
		if (disc < 0) {
			System.out.printf("Roots: imaginary%n");
		}
		else if (disc == 0) {
			root = (-b)/(2*a);
			System.out.printf("Root: %.2f%n",root);
		}
		else {
			//calculating thr roots 
			double root1 = (-b+ Math.sqrt(disc))/(2*a);
			double root2 = (-b- Math.sqrt(disc))/(2*a);
			
					if (root1< root2) {
					
			System.out.printf("Roots: %.2f %.2f %n",root1 ,root2);
					}	
					else {
						System.out.printf("Roots: %.2f, %.2f%n",root2,root1);
						
					}
			
		}
		
		
	}

}

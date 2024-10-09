package edu.wit.cs.comp1000;

import java.util.Scanner;

// Jamison Studley
public class PA2a {

	public static void main(String[] args) {
		
		//total SUm of posotive and negative 
		int posSum = 0;
		int negSum = 0;
		//numvber of posotive and negative numbers in the user inpiut 
		int numPos = 0;
		int numNeg = 0;
		int total = 0;
		//INitializing tghe averadge varivalem 
		double AvePos;
		double AveNeg;
		double AveAll;
		
		
//note INcluding zero (important)
		Scanner input = new Scanner(System.in);
		
		System.out.printf("Enter five whole numbers: ");
		//user inputs
		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();
		int d = input.nextInt();
		int e = input.nextInt();
		//Delete line later or comment out 
		//System.out.printf("your numbers were %d %d %d %d %d%n", a, b, c, d, e);
		//Calculating sums and counting negatives 
		//a
		if (a > 0){
			numPos++;
			posSum = posSum + a;
		}
		else if (a <= 0){
			numNeg++;
			negSum = negSum + a;
		}
		
		//b
		if (b > 0){
			numPos++;
			posSum = posSum + b;
		}
		else if (b <= 0){
			numNeg++;
			negSum = negSum + b;
		}
		
		//c
		if (c > 0){
			numPos++;
			posSum = posSum + c;
		}
		else if (c <= 0){
			numNeg++;
			negSum = negSum + c;
		}
		
		//d
		if (d > 0){
			numPos++;
			posSum = posSum + d;
		}
		else if (d <= 0){
			numNeg++;
			negSum = negSum + d;
		}
		
		//e
		if (e > 0){
			numPos++;
			posSum = posSum + e;
		}
		else if (e <= 0){
			numNeg++;
			negSum = negSum + e;
		}
		
		//If only opne number in sum change to number not numbers in all outrputs 
		
		if (numPos > 1) {
			System.out.printf("The sum of the %d positive numbers: %d%n", numPos,posSum);
		
		}
		else if (numPos == 1) {
			System.out.printf("The sum of the %d positive number: %d%n", numPos,posSum);
		}
		else if (numPos == 0) {
			System.out.printf("The sum of the %d positive numbers: %d%n", numPos,posSum);
		}
		
		else {
			System.out.printf("The sum of the %d positive number: %d%n", numPos,posSum);
		}
		
		
		//negative numvber sum s / number /numbers 
		
		if (numNeg > 1) {
			System.out.printf("The sum of the %d non-positive numbers: %d%n", numNeg,negSum);
			
		}
		else if (numNeg == 1) {
			System.out.printf("The sum of the %d non-positive number: %d%n", numNeg,negSum);
			
		}
		else if (numNeg == 0) {
			System.out.printf("The sum of the %d non-positive numbers: %d%n", numNeg,negSum);
			
		}
		
		else {
			System.out.printf("The sum of the %d non-positive number: %d%n", numNeg,negSum);
		}
		

		//the tatl between pos and negative nunmbvers
		total = posSum +negSum;
		
		System.out.printf("The sum of the 5 numbers: %d%n",total);
		
		//averadge of posotive numbers
		if (numPos ==1 ) {
			AvePos = (posSum*1.0)/numPos;
			System.out.printf("The average of the %d positive number: %.2f%n",numPos,AvePos);
			}
		
		else if (numPos > 0) {
		AvePos = (posSum*1.0)/numPos;
		System.out.printf("The average of the %d positive numbers: %.2f%n",numPos,AvePos);
		}
		else {
			System.out.printf("The average of the 0 positive numbers: 0.00%n");
		}
		

		
		//averadge negative 
		 if (numNeg == 1) {
			AveNeg = (negSum*1.0)/numNeg;
			System.out.printf("The average of the %d non-positive number: %.2f%n",numNeg,AveNeg);
			}
		 else if (numNeg > 0) {
		AveNeg = (negSum*1.0)/numNeg;
		System.out.printf("The average of the %d non-positive numbers: %.2f%n",numNeg,AveNeg);
		}
		else {
			System.out.printf("The average of the 0 non-positive numbers: 0.00%n");
		}
		//Averadge total for all 
		
		AveAll = (total*1.0)/5;
		
		System.out.printf("The average of the 5 numbers: %.2f%n", AveAll);
		
		
		
		
// have to delete later on or comment out
//		System.out.printf("Numebr of posotive numbers %d%n",numPos);
//		System.out.printf("Number of negative numbers %d%n",numNeg);
		
	
		
	}

}

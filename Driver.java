//***************************************************************
//Author: Tucker Day and Catey Meador
//File: Subtraction.java
//
//Purpose: Child class
//Last Changed Date: 4/21/18
//***************************************************************

package mathGame;

import java.util.Random;
import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		
		// Variables
		Random myRand = new Random();
		Scanner myScan = new Scanner(System.in);
		
		Question[] questions = new Question[5];
		
		Addition addition;
		Subtraction subtraction;
		Multiplication multiplication;
		Division division;
		Power power;
		
		// Build Array

		questions[0] = new Addition(myRand.nextInt(10), myRand.nextInt(10));
		questions[1] = new Subtraction(myRand.nextInt(10), myRand.nextInt(10));
		questions[2] = new Multiplication(myRand.nextInt(10), myRand.nextInt(10));
		questions[3] = new Division(myRand.nextInt(10), myRand.nextInt(10));
		questions[4] = new Power(myRand.nextInt(10), myRand.nextInt(10));
		
		System.out.println(questions[0].getQuestion());
		System.out.println(questions[0].operand1);
		System.out.println(questions[0].operand2);

	}

}

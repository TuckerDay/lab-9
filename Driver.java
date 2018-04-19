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
		
		for (int i = 0; i < 5; i++)
		{
			// Build Array
			questions[0] = new Addition(myRand.nextInt(10), myRand.nextInt(10));
			questions[1] = new Subtraction(myRand.nextInt(10), myRand.nextInt(10));
			questions[2] = new Multiplication(myRand.nextInt(10), myRand.nextInt(10));
			questions[3] = new Division(myRand.nextInt(10), myRand.nextInt(9)+1);
			questions[4] = new Power(myRand.nextInt(10), myRand.nextInt(10));
			
			int randNum = myRand.nextInt(questions.length);
			String question = questions[randNum].getQuestion();
			System.out.println(question);
			int userAnswer = myScan.nextInt();
			if (questions[randNum].checkAnswer(userAnswer) == true)
			{
				System.out.println("Great job!");
			}
			else
			{
				System.out.println("Better luck next time!");
			}
		}

	}

}

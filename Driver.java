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
		Integer[] highScore = new Integer[6];
		
		int score;
		String playAgain = "yes";
		
		// Initialize all scores to 0
		for (int i = 0; i < highScore.length; i++)
		{
			highScore[i] = 0;
		}
		
		// Welcome screen
		System.out.println("Welcome to the Math Game!\n ");
		
		// Main loop of game. Will run as many times as user wants
		while (playAgain.equals("yes"))
		{
			// Initialize score to 0
			score = 0;
			
			// A question is asked each time this loop runs
			for (int i = 0; i < 5; i++)
			{
				// Generate new array for each question (keeps questions from repeating)
				questions[0] = new Addition(myRand.nextInt(10), myRand.nextInt(10));
				questions[1] = new Subtraction(myRand.nextInt(10), myRand.nextInt(10));
				questions[2] = new Multiplication(myRand.nextInt(10), myRand.nextInt(10));
				questions[3] = new Division(myRand.nextInt(10), myRand.nextInt(9)+1);
				questions[4] = new Power(myRand.nextInt(10), myRand.nextInt(10));
				
				int randNum = myRand.nextInt(questions.length);
				String question = questions[randNum].getQuestion();
				System.out.println(question);
				int userAnswer = myScan.nextInt();
				
				// Correct answer
				if (questions[randNum].checkAnswer(userAnswer) == true)
				{
					System.out.println("Great job!");
					score++;
				}
				// Incorrect answer
				else
				{
					System.out.println("Better luck next time!");
				}
			}
			
			// Tell user score
			System.out.println("Your score: " + score);
			
			// Insert user highScore array at 6th place, then sort
			highScore[5] = score;
			Sorting.selectionSort(highScore);
			
			// Display 5 highest scores
			System.out.println("\nHigh scores:");
			for (int i = 0; i < 5; i++)
			{
				System.out.println((i+1) + ". " + highScore[i]);
			}
			
			// Ask if user wants to play again
			System.out.println("\nDo you want to play again?\n(type \"yes\" to play again)");
			playAgain = myScan.next();
			
		}
		// Exit message
		System.out.println("\nThanks for playing!");

	}

}

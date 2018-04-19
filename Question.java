//***************************************************************
//Author: Tucker Day and Catey Meador
//File: Question.java
//
//Purpose: Abstract class
//Last Changed Date: 4/21/18
//***************************************************************
package mathGame;

public abstract class Question {
	
	// Attributes
	protected int operand1;
	protected int operand2;
	
	// Constructor
	public Question(int operand1, int operand2)
	{
		this.operand1 = operand1;
		this.operand2 = operand2;
	}
	
	// Methods
	abstract public String getQuestion();
	
	abstract public int getActualAnswer();
	
	abstract public boolean checkAnswer();

}

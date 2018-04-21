//***************************************************************
//Author: Tucker Day and Catey Meador
//File: Addition.java
//
//Purpose: Child class
//Last Changed Date: 4/21/18
//***************************************************************
package mathGame;

public class Addition extends Question{
	
	public Addition(int operand1, int operand2)
	{
		super(operand1, operand2);
	}

	@Override
	public String getQuestion()
	{
		return "What is " + operand1 + "+" + operand2 + "?";
	}

	@Override
	public int getActualAnswer()
	{
		return operand1 + operand2;
	}

}


//***************************************************************
//Author: Tucker Day and Catey Meador
//File: Power.java
//
//Purpose: Child class
//Last Changed Date: 4/21/18
//***************************************************************
package mathGame;
import java.lang.Math;

public class Power extends Question{
	
	public Power(int operand1, int operand2)
	{
		super(operand1, operand2);
	}

	@Override
	public String getQuestion()
	{
		return "What is " + operand1 + "^" + operand2 + "?";
	}

	@Override
	public int getActualAnswer()
	{
		return (int) Math.pow(operand1, operand2);
	}
	
}

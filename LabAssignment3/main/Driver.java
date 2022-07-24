package com.gl.LabAssignment3.main;

import com.gl.LabAssignment3.service.BalancedBrackets;
public class Driver {

	public static void main(String[] args) {
		//Driver code
		
		BalancedBrackets balancedBrackets = new BalancedBrackets();
		String bracketExpression = "([[{}]])";
		
		Boolean result;
		
		result = balancedBrackets.checkingBracketsBalanced(bracketExpression);
		
		if(result)
			System.out.println("The entered String has Balanced Brackets");
		else
			System.out.println("The entered Strings do not contain Balanced Brackets");

	}

}

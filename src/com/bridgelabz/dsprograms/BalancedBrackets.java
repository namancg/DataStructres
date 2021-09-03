package com.bridgelabz.dsprograms;
import com.bridgelabz.stacksandqueues.*;
import java.util.*;
public class BalancedBrackets {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("ENTER THE EXPRESSION");
		String expression =sc.nextLine();
		Stack<Character> stack = new Stack();
		for(int i=0;i<expression.length();i++)
		{
			if(expression.charAt(i)=='(')
			{
				stack.push('(');
			}
			else if(expression.charAt(i)==')')
			{
				int res = stack.pop();
				if (res==-1)
				{
					System.out.println("IT IS NOT BALANCED");
				}
			}
			
		}
		if(!(stack.isEmpty()))
		{
			System.out.println("IT IS NOT BALANCED");
		}
		else
		{
			System.out.println("IT IS BALANCESD");
		}
	}

}

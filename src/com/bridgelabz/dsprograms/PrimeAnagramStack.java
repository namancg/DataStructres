package com.bridgelabz.dsprograms;

import java.util.Arrays;

import com.bridgelabz.stacksandqueues.Node;
import com.bridgelabz.stacksandqueues.Stacks;

public class PrimeAnagramStack {
	private final static int STARTING_NUMBER = 2;
	private final static int ENDING_NUMBER = 1000;
	private static boolean checkingPrime(int num) {

		int count=0;
		for (int i = 2; i <=num/2; i++){
			if(num%i==0){
				count++;
				break;
			}
		}
		if(count==0){
			return true;
		}
		else{
			return false;
		}
	}
	private static boolean checkAnagram(String string1, String string2) {
		if(string1.length() != string2.length()) {
			return false;
		}
		char[] array1 = string1.toCharArray();
		Arrays.sort(array1);
		char[] array2 = string2.toCharArray();
		Arrays.sort(array2);
				
		for(int i = 0; i < array1.length; i++) {
			if(array1[i] != array2[i]) {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		Integer[] primeNumberArray = new Integer[200];
		int arrayIndex = 0;
		for (int i = STARTING_NUMBER; i <= ENDING_NUMBER; i++) {
			if (checkingPrime(i)) {
				primeNumberArray[arrayIndex++] = i;
			}
		}
		Node<Integer> firstNode, secondNode;
		Stacks<Integer> myStack = new Stacks<Integer>();
		for (int i = 0; i < arrayIndex - 2; i++) {
			for (int j = i + 1; j < arrayIndex - 1; j++) {
				if (checkAnagram(primeNumberArray[i] + "", primeNumberArray[j] + "")) {
					myStack.push(new Node<Integer>(primeNumberArray[i]));
					myStack.push(new Node<Integer>(primeNumberArray[j]));

				}
			}
		}
		myStack.pop();

	}

}

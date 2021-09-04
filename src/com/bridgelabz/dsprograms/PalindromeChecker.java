package com.bridgelabz.dsprograms;
import java.util.Scanner;
import com.bridgelabz.stackandqueueproblem.*;
public class PalindromeChecker {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String input = sc.nextLine();
		if(isPalindrome(input.toLowerCase())) {
			System.out.println("Palindrome");
		} else {
			System.out.println("Not Palindrome");
		}
	}
	public static boolean isPalindrome(String string) {
		MyQueue<Character> queue = new MyQueue();
		Node<Character> newNode;
		for(int i=0;i < string.length();i++) {
			newNode = new Node<Character>((Character)string.charAt(i));
			queue.enQueue(newNode);
		}
		StringBuilder builder = new StringBuilder();
		for(int i=0;i<string.length();i++) {
			builder.append((queue.dequeue()));
		}
		String result = builder.toString();
		return result.equals(string);

	}

}

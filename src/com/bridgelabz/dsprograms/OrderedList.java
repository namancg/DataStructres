package com.bridgelabz.dsprograms;
import java.util.*;
import java.util.LinkedList;
import com.bridelabz.hashmap.*;

public class OrderedList {
	public static LinkedList<Integer> obj = new LinkedList<Integer>(null);
	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of number");
		int size = sc.nextInt();
		System.out.println("Enter " +size+ " number ");
		int numbers[] = new int[size];
		for(int index = 0; index<size;index++)
		{
			numbers[index] = sc.nextInt();
		}
		for(int numberPresent : numbers) 
		{
			Node<Integer> node = new Node<Integer>(numberPresent);
			obj.add(node);
		}
		System.out.println("which number has to be searched ??");
		int numberToBeSearched = sc.nextInt();
		searchNumber(numbers,numberToBeSearched);
		sc.close();
	}

	private static void searchNumber(int[] numbers, int numberToBeSearched) {
		System.out.println(numberToBeSearched);
		INode<Integer> newNode = obj.find(numberToBeSearched);
		if(newNode==null)
		{
			Node<Integer> node = new Node<Integer>(numberToBeSearched);
			obj.append(node);
			System.out.println(numberToBeSearched+ " Found ");
				
		}
		else 
		{
			obj.delete(numberToBeSearched);
			System.out.println("The number is deleted");
		}
		
	}
}
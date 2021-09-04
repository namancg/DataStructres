package com.bridgelabz.dsprograms;
import java.util.*;
import java.util.LinkedList;
import com.bridgelabz.linkedlists.*;

public class OrderedList {
	public static void main(String[] args) 
	{
		
		Integer[] numbers = { 10, 5, 3, 16, 5, 10, 12 };
		Node<Integer> newNode;
		SortedLinkedList<Integer> mySortedLinkedList = new SortedLinkedList<Integer>();
		for (Integer number : numbers) {
			if (mySortedLinkedList.search(number) == null) {
				newNode = new Node<Integer>(number);
				mySortedLinkedList.append(newNode);
				System.out.println(number + " added");
			} else {
				mySortedLinkedList.delete(number);
				System.out.println(number + " deleted");
			}
		}
		mySortedLinkedList.printMyNodes();
	}

}
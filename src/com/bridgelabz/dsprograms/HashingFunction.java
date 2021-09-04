package com.bridgelabz.dsprograms;
import java.util.Scanner;

import com.bridelabz.hashmap.MyLinkedHashMap;
import com.bridgelabz.linkedlists.Node;
import com.bridgelabz.linkedlists.SortedLinkedList;

public class HashingFunction {
	public static void main(String[] args) {
		String sentence= "To be or to hi not";
		MyLinkedHashMap<String, Integer> myLinkedHashMap = new MyLinkedHashMap<String, Integer>();
		String [] words = sentence.toLowerCase().split(" ");
		for(String word:words) {
			Integer value = myLinkedHashMap.getKey(word);
			if(value==null) 
			value=1;
			else value=value+1;
			myLinkedHashMap.add(word, value);	
		}		
		System.out.println("\n"+myLinkedHashMap);
}
}



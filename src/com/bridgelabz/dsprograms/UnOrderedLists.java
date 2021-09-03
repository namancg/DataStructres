package com.bridgelabz.dsprograms;
import com.bridelabz.hashmap.*;
import java.util.Scanner;
public class UnOrderedLists {
	public static void main(String args[]) {
		LinkedList<String> obj= new LinkedList<String>();
	Scanner sc= new Scanner(System.in);
	System.out.println("ENTER STRING");
	String word=sc.next();
	String[] splitWords = word.toLowerCase().split(" ");
	for(String word1: splitWords)
	{
		Node<String> node = new Node<String>(word1);
		obj.append(node);
	}
	System.out.println("ENTER THE WORD TO BE SEARCHED");
	String searchWord= sc.next();
	if(obj.find(searchWord)==null)
	{
		Node<String> node = new Node<String>(searchWord);
		obj.append(node);
		System.out.println("WORD FOUND :"+searchWord);
	}
	else
		obj.delete(searchWord);
		System.out.println("The word is deleted");
		sc.close();
	}
	
}


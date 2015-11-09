package com.csefamily.javavisited.java67;

import java.io.ObjectInputStream.GetField;
import java.util.HashSet;
import java.util.Set;

/**
 * For interview purpose, i have to solve a question like how to find
 * duplicate element in an array using java.
 * There are many ways to solve the problem, but, one way is java based another
 * way is language independent. Here has two way.
 * 
 * Help:http://java67.blogspot.com/2015/10/2-ways-to-find-duplicate-elements-in-java-array.html
 * http://stackoverflow.com/a/14946745/1421629
 * 
 * @author ratna halder (ratnacse06@gmail.com)
 *
 */
public class DuplicateElementFinding {
	
	public static void main(String[] args){
		String[] myArray = { "ab", "cd", "ab", "de", "cd" };
		DuplicateElementFinding instance = new DuplicateElementFinding();
		instance.findDuplicateElement(myArray);
	}
	
	/**
	 * Generic method to find duplicates element in array. COmplexity of this method is
	 * O(n) because HashSet data structure
	 * 
	 * @param array
	 * @return
	 */
	private <T extends Comparable<T>> void findDuplicateElement(T[] array){
		Set<T> values = new HashSet<>();
		for(T i : array){
			if(!values.add(i)){
				System.out.print("\n Duplicate value in array is: " + i);
			}
		}
	}
	
	/**
	 * Information:
	 * What is HashSet, why you use HashSet why not ArrayList
	 * what is HashSet: http://www.javatpoint.com/HashSet-class-in-collection-framework
	 */
}

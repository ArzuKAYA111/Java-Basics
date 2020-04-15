package com.syntax.class26;

import java.util.ArrayList;

public class ArrayListPDF {

		public static void main(String[] args) {
		// Create new ArrayList
		ArrayList<Integer> elements = new ArrayList<Integer>();
		elements.add(10); // Add three elements.
		elements.add(15);
		elements.add(20);
		System.out.println("Elements of the ArrayList are -- " + elements); // Print ArrayList
		int count = elements.size(); // Get size and display.
		System.out.println("Size of ArrayList after Element addition -- " + count);
		elements.remove(2); // Remove elements are using Index Number
		}
		}
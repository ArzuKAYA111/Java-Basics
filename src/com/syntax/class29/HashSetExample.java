package com.syntax.class29;

import java.util.Collections;
import java.util.HashSet;
public class HashSetExample {
public static void main(String args[]) {
HashSet<String> hsett = new HashSet<String>();
// Adding elements to the HashSet
hsett.add("Apple");
hsett.add("Mango");
hsett.add("Grapes");
hsett.add("Orange");
hsett.add("Fig");

//Addition of duplicate elements
hsett.add("Apple");
hsett.add("Mango");

//Addition of null values
hsett.add(null);
hsett.add(null);

//Displaying HashSet elements
System.out.println(hsett);



}
}
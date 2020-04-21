package com.syntax.class29;

import java.util.HashSet;
import java.util.Iterator;
public class IterateHashSet{
public static void main(String[] args) {
	
// Create a HashSet
HashSet<String> hset = new HashSet<>();

//add elements to HashSet
hset.add("Chaitanya");
hset.add("Rahul");
hset.add("Tim");
hset.add("Rick");
hset.add("Harry");

Iterator<String> it = hset.iterator();
while(it.hasNext()){
System.out.println(it.next());

//	String str=it.next(); // bu sekilde yapmak daha kullanisli eger burada bir islem yapacaksak
//   System.out.println( str);


}
}
}
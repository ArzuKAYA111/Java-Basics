package com.syntax.class29;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

/* Create a map of Best Buy store. Place item id and item name into it. Example
(7664847 = Printer, 7879885= TV etc )
● Retrieve all keys and values from a Best Buy map using EntrySet.*/
public class Task2 {

	public static void main(String[] args) {
	
		
		Map<Integer ,String> bBuy= new HashMap<>();
		
		bBuy.put(7664847," Printer");
		bBuy.put(7879885," TV");
		bBuy.put(1113344," Phone");
		bBuy.put(5432167," Laptop");
		
Iterator<Entry<Integer, String>> bBuyit= bBuy.entrySet().iterator();
	while(bBuyit.hasNext()) {
		Entry<Integer, String> entry=bBuyit.next();
		System.out.println(entry.getKey()+"="+entry.getValue());	
		
}}}

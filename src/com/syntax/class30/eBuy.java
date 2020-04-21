package com.syntax.class30;

/* Create a map of Best Buy store. Place item id and item name into it. Example
(7664847 = Printer, 7879885= TV etc )
● Retrieve all keys and values from a Best Buy map using EntrySet.*/
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class eBuy {

	public static void main(String[] args) {

		Map<Integer, String> bBuy = new HashMap<>();

		bBuy.put(7664847, " Printer");
		bBuy.put(7879885, " TV");
		bBuy.put(1113344, " Phone");
		bBuy.put(5432167, " Laptop");
		System.out.println(" ");
		System.out.println(" key and value by using EntrySet Iterator");

		System.out.println(" ");
		Iterator<Entry<Integer, String>> bBuyit = bBuy.entrySet().iterator();
		while (bBuyit.hasNext()) {
			Entry<Integer, String> entry = bBuyit.next();
			System.out.println("key :" + entry.getKey() + " " + "value :" + entry.getValue());

		}
		System.out.println("  ");

		System.out.println(" key and value by using for advance ");
		System.out.println(" ");

		Set<Entry<Integer, String>> allEntrs = bBuy.entrySet();

		for (Entry<Integer, String> entr : allEntrs) {
			Integer key = entr.getKey();
			String value = entr.getValue();
			System.out.println("key :" + key + "  " + "value :" + value);
		}

	}
}

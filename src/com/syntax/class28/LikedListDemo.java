  package com.syntax.class28;

import java.util.LinkedList;
import java.util.ListIterator;

public class LikedListDemo {

	public static void main(String[] args) {
	
			LinkedList<String>llist=new LinkedList<>();
	        llist.add("ahmet");
	        llist.add("Yunus");//comes from collections
	        llist.add(0,"Reyhan");//comes from list
	        llist.add("Pavel");
	        System.out.println(llist.size()+" "+llist.getFirst());
	        
	        for(int i=0;i<llist.size();i++) {
	        	System.out.println(llist.get(i)+"  ");
	        }
	        
	        System.out.println("..................");
	        
	        ListIterator<String>list=llist.listIterator();
	        while(list.hasNext()) {
	        	System.out.println(list.next()+" ");
	        }
		
	System.out.println(".................");
	System.out.println(" ");
		
	for(String str:llist) {
			System.out.println(str);
		}
		
		
	}

}

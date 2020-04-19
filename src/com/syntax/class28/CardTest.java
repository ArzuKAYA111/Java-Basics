package com.syntax.class28;

import java.util.Iterator;
import java.util.LinkedList;

public class CardTest {

	public static void main(String[] args) {
		
LinkedList<Card> lcard=new LinkedList<>();
  lcard.add(new Discover("Discover Card") );
  lcard.add(new MasterCard("Master Card") );
  lcard.add(new DoubleCashCard("Double Cash Card") );
  
                                                              System.out.println("   ");
       System.out.println("................by For Advance ");
  for(Card C:lcard) {
	 C.anualFee();
	 C.cashback();
	 System.out.println(" ");
 }
       System.out.println("................by For Ragular ");

    for(int i=0; i<lcard.size(); i++) {
	Card Cr= lcard.get(i);
	Cr.anualFee();
	Cr.cashback();
	System.out.println("  ");
 }
         System.out.println("................by Iterator");

    Iterator<Card> it=lcard.listIterator();
        while(it.hasNext()) {
	        Card Crd=it.next();
	        Crd.anualFee();
	        Crd.cashback();
	        System.out.println("   ");
 }
 
	}

}

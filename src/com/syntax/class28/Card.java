package com.syntax.class28;
/* 2- Create a Card class that will have implemented  and unimplemented methods and a constructor that will initializes credit card type.  
Create 3 subclasses of a Card card. Create 3 objects of different card and store them into LinkedList.
 Using for loop/advanced for loop/ iterator access all methods of the class.*/
public abstract class Card {
 String CardType ;
 Card (String CardType){
	  this.CardType= CardType;	
}
 public abstract void anualFee();
 
 public void cashback(){
	 System.out.println("If you use a credit card, you get cash back.");
 }}
class Discover extends Card{
	Discover(String CardType){
		super(CardType);
	}
	@Override
	public void anualFee() {
	System.out.println( "There is no anual fee for "+ CardType);
	}
	 public void cashback(){
	 System.out.println("If you use "+ CardType +" to online shopping you get 5% cash back.");
	 }}
class MasterCard extends Card{
	MasterCard(String CardType){
		super(CardType);
	}
	@Override
	public void anualFee() {
	System.out.println( "There is no anual fee for "+ CardType);
	}
	 public void cashback(){
		 System.out.println("If you use "+ CardType +" to online shopping you get 10% cash back.");
	 }}
class DoubleCashCard extends Card{
	DoubleCashCard(String CardType){
		super(CardType);
	}
	@Override
	public void anualFee() {
	System.out.println( "There is no anual fee for "+ CardType);
	}
	 public void cashback(){
	 System.out.println("If you use "+ CardType +" If you pay your current balance before your current statement close date,"
	 		+ " you get the full 2% in the same statement");
	 }}
package com.syntax.class27;
/*//2. hw create food class that will have 3 undefined methods and it will have 4 subclasses;
//create a collection of food and using 3 ways execute methods */
public abstract class Food {
	public String type;
	Food(String type){
		this.type=type;
	}
	abstract void eat();
	abstract void cook();
	abstract void healthy();
}
class Vegetables extends Food{
	Vegetables (String type){
		super(type);
	}
	@Override
	void eat() {
		System.out.println("People need to eat "+ type);	
	}
	@Override
	void cook() {
		System.out.println("Some"+ type+" are cooked, some are not cooked ");	
	}
	@Override
	void healthy() {
		System.out.println(type+" are healthy ");	
}}
class Fruits  extends Food{
	Fruits  (String type){
		super(type);
	}
		@Override
		void eat() {
			System.out.println("Mostly people like to eat "+type);
		}
		@Override
		void cook() {
			System.out.println(type+" are not cooked ");
		}
		@Override
		void healthy() {
			System.out.println(type+" are healthy ");	
}}	
class Sweets extends Food{
	Sweets  (String type){
		super(type);
	}
	@Override
	void eat() {
		System.out.println("Children like to eat "+type);	
	}
	@Override
	void cook() {
		System.out.println("Some"+ type+" are cooked.");	
	}
	@Override
	void healthy() {
		System.out.println(type+" are not healthy ");
}}
		
	

	

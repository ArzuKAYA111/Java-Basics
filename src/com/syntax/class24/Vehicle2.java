package com.syntax.class24;

public abstract class Vehicle2 {
		String color;
		Vehicle2(String color){
			this.color=color;
		}	
		public void drive() {
			System.out.println("All Vehicles drive");
		}	
		public void stop() {
			System.out.println("All Vehicles stop");
		}
		public abstract void start();
		public abstract void brake();
	}
abstract class Car1 extends Vehicle2{
	String carType;
	
	Car1(String color, String carType){
		super(color);
		this.carType=carType;
	}	
	public void brake() {
		System.out.println(carType+ " have brakes");
	}}
class Toyota1 extends Car1{
	String make;

	Toyota1(String color, String carType, String make) {
		super(color, carType);
		this.make=make;
	}
	public void start() {
		System.out.println(make+ " starts keyless");
	}
	public void drive() {
		System.out.println(make+" does not drive on autopilot");
	}
	public void display() {
		System.out.println("My friend has  "+color+" "+make+" "+carType);
	}}
abstract class Bus extends Vehicle2{
	String busType;
	
	Bus(String color, String busType){
		super(color);
		this.busType=busType;
	}
	public void carry() {
		System.out.println("All bus carry people.");
	}}
 class schoolBus extends Bus{
	
	schoolBus(String color, String busType){
		super(color,busType);	
	}
	public void stop() {
		System.out.println(busType+ " can stops everywhere if needed ");
	}
	public void drive() {
		System.out.println(busType +" does not drive without pilot ");
	}
	public void carry() {
		System.out.println(busType+" carries students.");
	}
	public  void start() {
		System.out.println(busType+" Starts if everyone is safe ");
	}
	public void brake() {
		System.out.println(busType+" Can break ");
	}
}
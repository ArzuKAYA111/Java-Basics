  package com.syntax.class30;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

abstract class Store{
	String type, name;
	public Store(String type, String name) {
		this.name=name;
		this.type=type;
	}
	public void display() {
		System.out.println("This is store "+name);
	}
	public abstract void workingHours();
}
class Nike extends Store {
	public Nike(String type, String name) {
		super(type, name);
	}
	public void workingHours() {
		System.out.println(name+" works from 10 am till 6 pm");
		}}
class Costco extends Store{
	public Costco(String type, String name) {
		super(type, name);}
	@Override
	public void workingHours() {
		System.out.println(name+" works from 8 am until 8 pm");
	}}
class Amazon extends Store{
	public Amazon(String type, String name) {
		super(type, name);
	}
	@Override
	public void workingHours() {
		System.out.println(name+" works 24/7");
	}}
public class UserDefinedClassesInMap {

	public static void main(String[] args) {
		//we want to store stores in form 1 --> Amazon, 2 -->Costco, 3 -->Nike
		
		Map<Integer, Store> storeMap=new LinkedHashMap<>();
		storeMap.put(1, new Amazon("online", "Amazon"));
		storeMap.put(2, new Costco("wholesale", "Costco"));
		storeMap.put(3, new Nike("retail", "Nike"));
		
		System.out.println(storeMap);
		// to get an access to all methods of our Store Objects: .values(),  entrySet(), keySet(),
		
		//1. way --> get all Value Objects By Storing Map Values into collection 
		
		System.out.println("----------  USING    .values()  -------------------");
		
		Collection<Store> col=storeMap.values();// we stored map values into collection 
		
		System.out.println(" By using for advance   "); //after we can get all values by using for Advance or by using Iterator
		for(Store store:col) {
			store.workingHours();
			store.display();
			System.out.println("-----------------------------");
		}
		
		System.out.println("  By using iterator   ");
		
		Iterator<Store> it=col.iterator();
		while ( it.hasNext()) {
			Store S=it.next();
			S.display();
			S.workingHours();
			System.out.println("........................");
		}
		System.out.println("    ");
		
		System.out.println("--  USING ENTRY SET   .entrySet()  ---");//iyisi buymus // key value hepsi icin uy gun
		
		//2. way --> get all Entry Objects --> getValue
		System.out.println("                By using for advance   ");   
		Collection<Entry<Integer, Store>> storeSet=storeMap.entrySet();
		for(Entry<Integer, Store> entry: storeSet) {
			entry.getValue().workingHours();
			entry.getValue().display();
			System.out.println("-----------------------------");
			System.out.println();
		}
		System.out.println("                 By using iterator   ");
		   
		Iterator<Entry<Integer,Store>> iter=storeSet.iterator();
		while(iter.hasNext()) {
			Entry<Integer,Store> E=iter.next();
			E.getValue().workingHours();
			E.getValue().display();
			System.out.println(".......................");
			//System.out.println(" ! "+E.getKey());istersek buradan key leri tek tek print yapabiliriz
		    
		}
		
		System.out.println("----------  USING    .keySet()  -------------------");

       //3 .way --> get all Keys --> get value of specified key
		Collection<Integer> keys=storeMap.keySet();
		for(Integer key: keys) {
			Store obj=storeMap.get(key);//Map ten keyleri alacak keyler ne tur variable(Neyin variable i)...> Store type
			obj.display();
			obj.workingHours();
			System.out.println("-----------------------------");
		}
	
//		Iterator<Integer> itt=keys.iterator();
//		while(itt.hasNext()) {                      // tamamla
//			
//			
//		}
		
	}
}
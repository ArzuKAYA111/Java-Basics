package com.syntax.class29;

import java.util.HashSet;
import java.util.Iterator;

/*3. Create a Set collection that will hold Objects of Student Type. In this set we do not care
about the insertion order. Each student object should have name and studentID. Display
name of each student.Task*/
public class Student {
	
public	String name;
	public double stID;
	Student(String name, double stID){
		this.name=name;
		this.stID=stID;
	}
	public String getName() {
		return name;
	}
	public double getID() {
		return stID;
	}
		public static void main(String[] args) {
			
			Student obj=new Student("John ",1234556);
			Student obj1=new Student("Alex ",19877556);
			Student obj2=new Student("Andrea ",12347776);
			Student obj3=new Student("James ",1456756);
			
			
			HashSet<Student> hset=new HashSet<>();
			hset.add(obj);
			hset.add(obj1);
			hset.add(obj2);
			hset.add(obj3);
	
			Iterator<Student> it=hset.iterator();
			while(it.hasNext()) {
				Student st=it.next();// bu sekilde yapmazsak iterator her defasinda sonraki object e geciyor asagidakilerde oldugu gibi tam sonuc vermiyor
				System.out.println(st.getName()+st.getID());
			
			//System.out.println(it.next().name);
				//System.out.println(it.next().stID);
//				System.out.println(it.next().getName()+ it.next().getID());
//				System.out.println(it.next().name+ it.next().stID);
				
			}
		System.out.println("     ");
			for( Student inf:hset) {
			System.out.print(inf.getName());	
			System.out.println(inf.getID());	
		
			}
			
			
		}

	}

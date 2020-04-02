package com.syntax.class19;

public class TestAllTeachers {

public static void main(String[] args) {

		Teacher T= new Teacher() ;
		
		T.branch="any" ;
		T.money="less";
		T.age=34;
		T.love();
		T.teaches();
		T.money();
		
		MathTeacher M= new MathTeacher();	
		
		M.name="Sara" ;
		M.math="Math" ;
		M.geometry="Geometry";
		M.age=34;
		M.teaches();
		
		Chemistry Ch =new Chemistry();
		Ch.make="Experiments";
		Ch.know() ;
		
		
		 PianoTeacher Pi=new  PianoTeacher();
		 Pi.Play();
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

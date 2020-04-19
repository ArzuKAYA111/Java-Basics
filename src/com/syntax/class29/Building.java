package com.syntax.class29;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
/*Create a map of a building. Store floor number and it is associated company name. 
 (Example: 1= Google, 2=Syntax etc..). Insert 7 entries with duplicate keys and values. 
Check how many entries you have?
Update company on a 4th floor 
Remove company on the 7th floor
Print your map */
public class Building {

	public static void main(String[] args) {
		Map<Integer,String > build=new HashMap<>();
  build.put(1,"Amazon");
  build.put(2,"Syntax");	
  build.put(3,"Red Hat");
  build.put(4,"Google");
  build.put(2,"Syntax");
  build.put(6,"Atlantic Health System");
  build.put(1,"Ultimate Software");
                                                                                  
//how many entries are there?
System.out.println("There are " +build.size()+ " entries in Map" );      

System.out.println("All Entries in Map...> "+build.entrySet());
                                                                                              
//Updating company on a 4th floor 
build.replace(4, "Samsung");
                                                                                                
//After updating Accessing Map
System.out.println("After updating Map is...> "+build);
                                                                                                 
// remove Company on the 7 th floor
build.remove(7);
                                                                                               
// Printing Map
System.out.println("After removing Map is...> "+build);


}}

package com.syntax.class14;

//ASELDEN
public class Dog { // Dog class
    
    String breed;            // Class
    String color;
    String name;
    int age;
    public static void main(String[] args) {
        Dog dog1 = new Dog();                 //object
        dog1.breed = "Shih tzu";
        dog1.color = "brown";
        dog1.name = "Charlie";
        dog1.age = 3;
        
        dog1.bark();
        dog1.eat();// we declare them to can reach the  methods (behaviors)
        dog1.run();
        
        Dog dog2 = new Dog();      //object
        dog2.breed = "bulldog";
        dog2.color = "black";
        dog2.name = "Lucy";
        dog2.age = 5;
        
        dog2.bark();
        dog2.eat();
        dog2.run();
        
     // I love black Bull dog
        System.out.println(" I love "+ dog1.color+" "+ dog2.breed);
    }
    
    
  //define the behavior  of dog           // we are creating the methods to access behaviors   
    void eat() {                         // we are creating the methods out side the main method ( Public Static...)
        System.out.println(name+" can eat");
    }
    
    void bark() {
        System.out.println(name+" can bark");  // methods
    }
    
    void run() {
        System.out.println(name+" can run");
    }
}

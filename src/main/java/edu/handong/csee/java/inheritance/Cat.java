package edu.handong.csee.java.inheritance;

public class Cat extends Animal {
	public static void testClassMethod() {
        System.out.println("The static method in Cat");
    }
    public void testInstanceMethod() {
        System.out.println("The instance method in Cat");
    }

    public static void main(String[] args) {
        Cat myCat = new Cat();
        Animal myAnimal = myCat;
        Animal mydog = new Dog(); //polymorphism
        
        Animal.testClassMethod(); //hiding
        myAnimal.testInstanceMethod(); //testInstanceMethod is override
        mydog.testInstanceMethod();
    }
}

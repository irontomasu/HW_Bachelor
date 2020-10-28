abstract class Animal { 
    abstract void noise(); 
} 
class Dog extends Animal {
    private static int count = 0; 
    public Dog() {};
    public void noise() { 
	System.out.println("Woof"); 
	increment(); 
    } 
    public static void increment() { count++; } 
    public static int getCount() { return count; } 
} 
class Cat extends Animal {
    private static int count = 0; 
    public Cat() {}; 
    public void noise() { 
	System.out.println("Meow"); 
	increment(); 
    } 
    public static void increment() { count++; } 
    public static int getCount() { return count; } 
} 
public class Counter{ 
    public static void main(String[] args) { 
	Animal[] a = {new Dog(), new Cat(), new Cat(), new Dog(), new Dog()}; 
	for (int i = 0; i < a.length; i++) 
	    a[i].noise(); 
	System.out.println(Dog.getCount() + " woofs and " + Cat.getCount() + " meow"); 
    } 
} 

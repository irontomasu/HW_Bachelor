interface Relatable {
	
   // this (object calling isLargerThan) and
   // other must be instances of the same class
   // returns 1, 0, -1 if this is greater
   // than, equal to, or less than other
   public int isLargerThan(Student other);
   
}

public class Student implements Relatable {
    private String name = "";
    private int age = 0;
    private double weight = 0;
    private double height = 0;

    public Student() {
    }

    public Student(String name, int age, double weight, double height) {
	this.name = name;
	this.age = age;
	this.weight = weight;
	this.height = height;
    }

    public double getBMI() {
	return weight / (height * height);
    }
    
    // a method to implement Relatable
    public int isLargerThan(Student other) {
    	Student otherStudent = (Student)other;
    	if (this.getBMI() < otherStudent.getBMI())
    		return -1;
    	else if (this.getBMI() > otherStudent.getBMI())
    		return 1;
    	else
    		return 0;    		
    }
}
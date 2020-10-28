public class TestBMI {
    public static void main(String[] args) {
	Student s1 = new Student("Takahashi", 18, 56, 175);
	Student s2 = new Student("Suzuki", 18, 60, 182);
	switch (s1.isLargerThan(s2)) {
	case 1:
	    System.out.println("r1 is greater than r2");
	    break;
	case 0:
	    System.out.println("r1 is equal to r2");
	    break;
	default:
	    System.out.println("r1 is less than r2");
	    break;
	    
	}
	
    }
}
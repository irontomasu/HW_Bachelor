
public class TestRelatable {
    public static void main(String[] args) {
	int largest;
	RectanglePlus r[] = {new RectanglePlus(10, 20),
			     new RectanglePlus(40, 50),
			     new RectanglePlus(5, 4),
			     new RectanglePlus(8, 15)};

	largest = 0;
	for(int i = 0 ; i < 4 ; i++){
	    switch (r[largest].isLargerThan(r[i])) {
	    case 1:
		//System.out.println("r1 is greater than r2");
		break;
	    case 0:
		//System.out.println("r1 is equal to r2");
		break;
	    default:
		//System.out.println("r1 is less than r2");
		largest = i;
		break;
	    }
	}
	System.out.println("r[" + largest + "]" + " is the largest in r[]");
    }
}
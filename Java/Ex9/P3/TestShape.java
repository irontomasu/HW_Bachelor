class Point extends Figure{
    private int x = 0;
    private int y = 0;

    public Point(int x, int y) {
	this.x = x;
	this.y = y;
    }

    public void move(int x, int y) {
	this.x = x;
	this.y = y;
    }
    public double getArea() {
	return 0;
    }
}

public class TestShape{
    public static void main(String argv[]){
	double sum=0.0;
	Figure fig[] = {new Point(0 , 2),
			new Point(4 , 4),
			new Point(8 , 2),
			new Circle(5.0),
			new Circle(9.0),
			new Circle(10.1),
			new Circle(2.6),
			new Rectangle(5.0, 4.0),
			new Rectangle(2.0, 3.0),
			new Rectangle(10.5, 6.0),
			new Rectangle(20.0, 18.0),
			new Rectangle(5.0, 40.0)};
	for(int i = 0 ; i < 12 ; i++){
	    sum += fig[i].getArea();
	}
	System.out.println("Sum of area is:" + sum);
    }
}
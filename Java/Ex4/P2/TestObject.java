class Rectangle{
    protected int height;
    protected int length;
    public Rectangle(int setheight, int setlength){
	height = setheight;
	length = setlength;
    }
    public int getHeight(){ return height;}
    public int getLength(){ return length;}
    
    public int perimeter(){
	return (height + length)*2;
    }
}

class Box extends Rectangle{
    protected int width;
    public Box(int setheight, int setlength, int setwidth){
	super(setheight, setlength);
	width = setwidth;
    }
    public int getWidth(){ return width;}
    public int perimeter(){
	return super.perimeter()*2 + width * 4;
    }
}

public class TestObject{
    public static void main(String argv[]){
	Rectangle rectangle = new Rectangle(3, 4);
	Box box = new Box(3, 4, 5);
	System.out.println("rectangle: length=" + rectangle.length + " height=" + rectangle.height + " perimeter=" + rectangle.perimeter());
	System.out.println("box: length=" + box.length + " height=" + box.height + " width=" + box.width + " perimeter=" + box.perimeter());
    }
}
/*

    How many fields does the Rectangle have? 2
    How many fields does the Box have? 3
    How many methods does the Rectangle have? 1
    How many methods does the Box have? 1
    What are the advantages that the solution to Problem 2 has over the solution to Problem 1. write easily

 */
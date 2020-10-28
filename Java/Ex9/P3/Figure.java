interface Shape { 
   public double getArea();
}

abstract public class Figure implements Shape{
    public Figure() {
    }
    public boolean equals(Object obj) {
	if (obj == null)
	    return false;
	else if (super.equals(obj))
	    return true;
	else return false;
    }
    abstract public double getArea();
}
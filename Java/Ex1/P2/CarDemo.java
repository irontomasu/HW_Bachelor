class Car { // fields or attributes
    int horsePower;
    int speed;
    int fuelConsumption;
    double gasTank;
    int travelledTime;

    Car() { // constructor
	horsePower = 0;
	speed = 0;
	fuelConsumption = 10;
	gasTank = 10;
	travelledTime = 0;
    }

void travelledTimeUp(int newValue) {
travelledTime = travelledTime + newValue;
}

void speedUp(int increment) {
speed = speed + increment;
}

void applyBrakes(int decrement) {
speed = speed -decrement;
}

void printStateTank() { 
    gasTank = gasTank - (double)speed * travelledTime / fuelConsumption;
System.out.println( "gasTank:" + gasTank+ "liter");
}

} //end of the Bicycle class
class CarDemo {
public static void main(String[] args) {
// Create two different Bicycle objects
Car car1 = new Car();
Car car2 = new Car();

car1.speedUp(10); // Invoke methods on those
car1.travelledTimeUp(2);
car1.printStateTank(); // objects

car2.speedUp(15);
car2.travelledTimeUp(3);
car2.printStateTank();
}
}
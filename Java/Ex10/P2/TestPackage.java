import fuelconsumption.*;

class TestPackage {
   private double fuelConsumptionOldRegulation = 0;
   private double fuelConsumptionNewRegulation = 0;
   private SimpleCar[] cars;

    TestPackage() {
	/* your code is here */
	cars = new SimpleCar[5];
	cars[0] = new DeluxeCar("Honda", 14.0f , 200.0f, 10.5f, 7.0f, 18.0f, 8.0f);
	cars[1] = new AdvancedCar("Toyota", 15.5f , 200.0f, 9.5f, 7.0f, 18.0f);
	cars[2] =  new SimpleCar("Nissan", 13.0f, 200.0f);
	cars[3] =  new BusTaxi("Mercedes", 6.6f , 200.0f, 11.5f, 7.0f, 18.0f, 8.0f, 5);
	cars[4] =  new BusTaxi("Mercedes", 6.6f , 200.0f, 11.5f, 7.0f, 18.0f, 8.0f, 10);
	calculateFuelConsumption();
    }
    TestPackage(SimpleCar[] cars) {
	this.cars = cars;
    }
   private void calculateFuelConsumption() {
      /* your code to calculate values of
        fuelConsumptionOldRegulation and
        fuelConsumptionNewRegulation is here */
	for(int i = 0 ; i < 5 ; i++){          
	    fuelConsumptionOldRegulation +=  cars[i].getFuelConsumptionOldRegulations();
	    fuelConsumptionNewRegulation +=  cars[i].getFuelConsumptionNewRegulations();
	}
   }
   float getFuelConsumptionOldRegulations() {
       return (float)fuelConsumptionOldRegulation;
   }
   float getFuelConsumptionNewRegulations() {
       return (float)fuelConsumptionNewRegulation;
   }

    public static void main(String[] args){
	TestPackage fcc = new  TestPackage();
	System.out.println("FuelConsumptionOldRegulations: " + fcc.getFuelConsumptionOldRegulations());
	System.out.println("FuelConsumptionNewRegulations: " + fcc.getFuelConsumptionNewRegulations());
	System.out.println("Old - New = " +(fcc.getFuelConsumptionOldRegulations() - fcc.getFuelConsumptionNewRegulations()));
    }
}
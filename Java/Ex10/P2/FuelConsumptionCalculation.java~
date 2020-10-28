class FuelConsumptionCalculation {
   private double fuelConsumptionOldRegulation = 0;
   private double fuelConsumptionNewRegulation = 0;
   private SimpleCar[] cars;

    FuelConsumptionCalculation() {
	/* your code is here */
	cars = new SimpleCar[4];
	cars[0] = new DeluxeCar("Honda", 14.0f , 200.0f, 10.5f, 7.0f, 18.0f, 8.0f);
	cars[1] = new AdvancedCar("Toyota", 15.5f , 200.0f, 9.5f, 7.0f, 18.0f);
	cars[2] =  new SimpleCar("Nissan", 13.0f, 200.0f);
	cars[3] =  new DeluxeCar("Van", 10.5f , 200.0f, 6.0f, 7.0f, 18.0f, 8.0f);

	calculateFuelConsumption();

    }
    FuelConsumptionCalculation(SimpleCar[] cars) {
	this.cars = cars;
    }
   private void calculateFuelConsumption() {
      /* your code to calculate values of
        fuelConsumptionOldRegulation and
        fuelConsumptionNewRegulation is here */
	for(int i = 0 ; i < 4 ; i++){          
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
	FuelConsumptionCalculation fcc = new FuelConsumptionCalculation();
	System.out.println("FuelConsumptionOldRegulations: " + fcc.getFuelConsumptionOldRegulations());
	System.out.println("FuelConsumptionNewRegulations: " + fcc.getFuelConsumptionNewRegulations());
	System.out.println("Old - New = " +(fcc.getFuelConsumptionOldRegulations() - fcc.getFuelConsumptionNewRegulations()));
    }
}

class SimpleCar{
    private String maker;
    private float fuelconsumption;
    private float travel;
    public SimpleCar(String maker, float fuelconsumption, float travel){
	this.maker = maker;
	this.fuelconsumption = fuelconsumption;
	this.travel = travel;
    }

    public String getmaker(){
	return maker;
    }

    public float getfuelconsumption(){
	return fuelconsumption;
    }

    public float gettravel(){
	return travel;
    }

    public float getFuelConsumptionOldRegulations(){
	return travel/fuelconsumption;
    }

    public float getFuelConsumptionNewRegulations(){
	return travel/fuelconsumption;
    }
}

class AdvancedCar extends SimpleCar{
    private float startt, endt, acfuelconsumption;
    public AdvancedCar(String maker, float fuelconsumption, float travel, float acfuelconsumption, float startt, float endt){
	super(maker, fuelconsumption, travel);
	this.acfuelconsumption = acfuelconsumption;
	this.startt = startt;
	this.endt = endt;
    }

    public float getstartt(){
	return startt;
    }

    public float getendt(){
	return endt;
    }

    public float getacfuelconsumption(){
	return acfuelconsumption;
    }

    public float getFuelConsumptionOldRegulations(){
	return (float)((gettravel()/getfuelconsumption()) + (endt - startt)/(acfuelconsumption));
    }

    public float getFuelConsumptionNewRegulations(){
	return (float)((gettravel()/getfuelconsumption()) + (endt - startt)/(acfuelconsumption));
    }
}

class DeluxeCar extends AdvancedCar{
    private float passenger;

    public DeluxeCar(String maker, float fuelconsumption, float travel, float acfuelconsumption, float startt, float endt, float passenger){
	super(maker, fuelconsumption, travel, acfuelconsumption, startt, endt);
	this.passenger = passenger;
    }
    public float getFuelConsumptionOldRegulations(){
	return (gettravel()/getfuelconsumption()) + (getendt() - getstartt())/(getacfuelconsumption());
    }

    public float getFuelConsumptionNewRegulations(){
	return (gettravel()/getfuelconsumption()) + (passenger)/(getacfuelconsumption());
    }

    public float getpassenger(){
	return passenger;
    }
}

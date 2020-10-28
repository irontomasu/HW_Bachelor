package fuelconsumption;

public class DeluxeCar extends AdvancedCar{
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
package fuelconsumption;

public class SimpleCar{
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
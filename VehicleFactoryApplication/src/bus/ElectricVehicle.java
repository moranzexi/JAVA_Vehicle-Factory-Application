package bus;

import java.util.Random;
import java.util.Scanner;

public class ElectricVehicle extends Vehicle {
	private float kilowatts;
	
	public void setKilowatts(float value)
	{
		this.kilowatts=value;
	}
	public float getKilowatts()
	{
		return this.kilowatts;
	}
	
	public ElectricVehicle()
	{
		this.kilowatts=0.00f;
	}
	public ElectricVehicle(String id,String make,String model,long count,Date date,EnumCarType type,float p,long time,float kilowatt)
	{
		super(id,make,model,count,date,type,p,time);
		this.kilowatts=kilowatt;
	}
	
	public float getMilesPerGallon()
	{
		return this.counter/this.kilowatts;
	}
	public String toString()
	{
		return super.toString()+"you have consumed "+this.kilowatts+" kilowatts, "+"miles per kilowatt is: "+getMilesPerGallon();//+date.getMonth()+"/"+date.getDay()+"/"+date.getYear();
	}

}

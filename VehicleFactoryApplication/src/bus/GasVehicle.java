package bus;

import java.util.Random;
import java.util.Scanner;

public class GasVehicle extends Vehicle{
	private float gasoline;
	
	public void setGasolin(float value)
	{
		this.gasoline=value;
	}
	public float getGasolin()
	{
		return this.gasoline;
	}
	public GasVehicle()
	{
		this.gasoline=0.00f;
	}
	public GasVehicle(String id,String make,String model,long count,Date date,EnumCarType type,float gas,float p,long time)
	{
		super(id,make,model,count,date,type,p,time);
		this.gasoline=gas;
	}
	
	public float getMilesPerGallon()
	{
		return this.counter/this.gasoline;
	}
	public String toString()
	{
		return super.toString()+"you have consumed "+this.gasoline+" gasoline, "+"miles per gallon is: "+getMilesPerGallon();//+date.getMonth()+"/"+date.getDay()+"/"+date.getYear();
	}

}

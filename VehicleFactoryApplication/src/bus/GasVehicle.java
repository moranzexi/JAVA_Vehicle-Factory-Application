package bus;

import java.util.Random;
import java.util.Scanner;

public class GasVehicle extends Vehicle{
	private float gasoline;
	public float calculateGasoline(float price,long seconds)
	{
		
		Random read=new Random();
		if(price>=200000)
		{
			
			float number=(float) (read.nextFloat()*1.79+2.2);		//2.20-3.99		
			System.out.println("the gasoline per second for your car of this run is "+number+" gas");	
			 return number*seconds;
		}
		if(price>=100000&&price<200000)
		{
			float number=(float) (read.nextFloat()*1.99+4);		//4.00-5.99	
			System.out.println("the gasoline per second for your car of this run is "+number+" gas");
			 return number*seconds;
		}
		else
		{
			float number=(float) (read.nextFloat()*2.99+6);		//6.00-8.99		
			System.out.println("the gasoline per second for your car of this run is "+number+" gas");
			 return number*seconds;
		}
	}
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
	public void makeTrip()
	{
		this.counter=100;
		this.gasoline=7.77f;//f means float, limit to 6 digits
		long time = System.currentTimeMillis();
		Scanner scan = new Scanner(System.in);
		//Random read=new Random();
		System.out.println("press enter to start to run the car");		
		scan.nextLine();
		 long nowMillis = System.currentTimeMillis();
		 long seconds=(nowMillis - time) / 1000;
		 setSecond(seconds);
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

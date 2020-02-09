package bus;

import java.io.Serializable;
import java.util.Random;
//import java.util.Scanner;

public abstract class Vehicle implements IMileageEfficiency,Serializable
  {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String serialNumber;
	private String make;//brand
	private String model;//name of the car
	protected float counter;
	private Date date;
	private EnumCarType type;
	private float price;
	private long second;
	public float getMileage()
	{
		return getMilesPerGallon();
	}
	public String getStringDate()
	{
		return this.date.getYear()+"-"+this.date.getMonth()+"-"+this.date.getDay();
	}
	public void setSecond(long value)
	{
		this.second=value;
	}
	public long getSecond()
	{
		return this.second;
	}
	public float calculateMiles(float price,long seconds)
	{
		/*long time = System.currentTimeMillis();
		Scanner scan = new Scanner(System.in);*/
		Random read=new Random();
		/*System.out.println("press enter to start to run the car");		
		scan.nextLine();*/
		/* long nowMillis = System.currentTimeMillis();
		 long seconds=(nowMillis - time) / 1000;*/
		if(price>=200000)
		{
			
			
			 int number=read.nextInt(51)+200;	//200-250
			 System.out.println("the miles per second for your car of this run is "+number+" miles");		 
			 return number*seconds;
		}
		if(price>=100000&&price<200000)
		{
			int number=read.nextInt(50)+150;//150-199
			 System.out.println("the miles per second for your car of this run is "+number+" miles");
			 return number*seconds;
		}
		else
		{
			int number=read.nextInt(50)+100;//100-149
			 System.out.println("the miles per second for your car of this run is "+number+" miles");
			 return number*seconds;
		}
	}
	public void setPrice(float value)
	{
		this.price=value;
	}
	public float getPrice()
	{
		return this.price;
	}
	public void setSerialNumber(String id)
	{
		this.serialNumber=id;
	}
	public String getSerialNumber()
	{
		return this.serialNumber;
	}
	public void setMake(String value)
	{
		this.make=value;
	}
	public String getMake()
	{
		return this.make;
	}
	public void setModel(String value)
	{
		this.model=value;
	}
	public String getModel()
	{
		return this.model;
	}
	public void setCounter(float value)
	{
		this.counter=value;
	}
	public float getCounter()
	{
		return this.counter;
	}
	public void setDate(int month,int day,int year)
	{
		this.date.setMonth(month);
		this.date.setDay(day);
		this.date.setYear(year);
	}
	public Date getDate()
	{
		return this.date;
	}
	public EnumCarType getType()
	{
		return this.type;
	}
	public void setType(EnumCarType type)
	{
		this.type=type;
	}
	public String toString()
	{
		return this.serialNumber+":"+this.make+","+this.model+","+date.toString()+","+this.type+
		",price: "+this.price+",you have run for "+this.second+" seconds"+",you have run: "
		+this.counter+" miles, ";
	}
	public Vehicle()
	{
		this.serialNumber="";
		this.make="";
		this.model="";
		this.counter=0;
		this.date=new Date();
		this.type=EnumCarType.Undefined;
	}
	public Vehicle(String id,String make,String model,float count,Date date,EnumCarType type,float price,long time)
	{
		this.serialNumber=id;
		this.make=make;
		this.model=model;
		this.counter=count;
		this.date=date;
		this.type=type;
		this.price=price;
		this.second=time;
	}
	public abstract float getMilesPerGallon();


}

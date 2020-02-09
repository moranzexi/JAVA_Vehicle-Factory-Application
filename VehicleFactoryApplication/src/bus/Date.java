package bus;

import java.io.Serializable;

public class Date implements Serializable
{
	private int month;
	private int day;
	private int year;
	public int getMonth()
	{
		return this.month;
	}
	public void setMonth(int value)
	{
		this.month=value;
	}
	public int getDay()
	{
		return this.day;
	}
	public void setDay(int value)
	{
		this.day=value;
	}
	public int getYear()
	{
		return this.year;
	}
	public void setYear(int value)
	{
		this.year=value;
	}
	public Date()
	{
		this.month=00;
		this.day=00;
		this.year=0000;
	}
	public Date(int month,int day,int year)
	{
		this.month=month;
		this.day=day;
		this.year=year;
	}
	public String toString()
	{
		return this.month+"/"+this.day+"/"+this.year;
	}
}

package bus;

import java.util.Comparator;

public class CarNameComparator implements Comparator<Vehicle>{
	public int compare(Vehicle m1,Vehicle m2)//this is not abstract coz we want to create an object
	{
		if(m1.getModel().compareTo(m2.getModel())<0)
		{
			return -1;
		}
		else if(m1.getModel().compareTo(m2.getModel())>0)
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}

}
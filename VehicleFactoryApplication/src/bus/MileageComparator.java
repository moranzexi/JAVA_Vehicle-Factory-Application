package bus;

import java.util.Comparator;

public class MileageComparator implements Comparator<Vehicle>{
		public int compare(Vehicle m1,Vehicle m2)//this is not abstract coz we want to create an object
		{
			if(m1.getMileage()>m2.getMileage())
			{
				return -1;
			}
			else if(m1.getMileage()<m2.getMileage())
			{
				return 1;
			}
			else
			{
				return 0;
			}
		}
}

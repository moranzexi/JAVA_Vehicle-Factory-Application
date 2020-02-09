package bus;
import java.util.ArrayList;
public class Factory {
	//Factory vehicle1=new Factory();
	
	private ArrayList<Vehicle> vehicleList;
	
	public void deleteByType(ArrayList<Vehicle> list)
	{
		for(Vehicle item:list)
		{
			this.vehicleList.remove(item);
		}
		//list.removeAll(list);
	}
	public void deleteByName(String name,boolean bName)
	{
		if(bName)
		{
			for(Vehicle item:vehicleList)
			{
				if(item.getMake().equals(name))
				{
					this.vehicleList.remove(item);
					break;
				}
				
			}
		}
		else
		{
			for(Vehicle item:vehicleList)
			{
				if(item.getModel().equals(name))
				{
					this.vehicleList.remove(item);
					break;
				}
				
			}
		}
	}
		
	
	public ArrayList<Vehicle> searchByType(EnumCarType value)
	{
		ArrayList<Vehicle> searchList=new ArrayList<Vehicle>();
		for(Vehicle item:vehicleList)
		{
			if(item.getType()==value)
			{
				searchList.add(item);
			}
		}
		return searchList;
	}
	public void listAllVehicles(ArrayList<Vehicle> list)
	{
		for(int i=0;i<list.size();i++)
		{
			System.out.println(list.get(i).toString() );
		}
	}
	public Vehicle searchByIndex(int i)
	{
		return vehicleList.get(i);
	}
	
	public Vehicle searchById(String id)
	{
		for(Vehicle item:vehicleList)
		{
			if(item.getSerialNumber().equals(id))
			{
				return item;				
			}
		}
		return null;
	}
	public ArrayList<Vehicle> searchByBrandOrName(String name,boolean bName)
	{
		ArrayList<Vehicle> sList=new ArrayList<Vehicle> ();
		if(bName)
		{
			for(Vehicle item:this.vehicleList)
			{
				if(item.getMake().equals(name))
				{
					sList.add(item);
				}
			}
		}
		else
		{
			for(Vehicle item:this.vehicleList)
			{
				if(item.getModel().contains(name))
				{
					sList.add(item);
				}
			}
		}
		return sList;
	}
	public Factory()
	{		
		vehicleList=new ArrayList<Vehicle>();
	}
	public ArrayList<Vehicle> getVehicleList()
	{
		return this.vehicleList;
	}
	public void add(Vehicle element)
	{
		this.vehicleList.add(element);
	}
	public void remove(Vehicle element)
	{
		this.vehicleList.remove(element);
	}
	public int getCapacity()
	{
		return this.vehicleList.size();
	}
	public void remove(int index)
	{
		this.vehicleList.remove(index);
	}
	

}

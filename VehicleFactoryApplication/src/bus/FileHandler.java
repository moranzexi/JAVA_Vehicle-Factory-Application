package bus;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class FileHandler {
	public static void writeToFile(ArrayList<Vehicle> list) throws IOException,FileNotFoundException{
		FileOutputStream fos=new FileOutputStream("vehicle.ser");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(list);
		oos.close();
	}
	@SuppressWarnings("unchecked")
	public static ArrayList<Vehicle> readFromFile() throws IOException,ClassNotFoundException,FileNotFoundException{
		ArrayList<Vehicle> list=new ArrayList<Vehicle>();
		FileInputStream fis=new FileInputStream("vehicle.ser");
		ObjectInputStream ois=new ObjectInputStream(fis);
	
		list=(ArrayList<Vehicle>)ois.readObject();
		ois.close();
		return list;
	}

}

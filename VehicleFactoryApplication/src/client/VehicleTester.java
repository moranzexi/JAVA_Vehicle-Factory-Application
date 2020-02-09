package client;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Scanner;
import bus.*;

public class VehicleTester {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException, ClassNotFoundException{
		// TODO Auto-generated method stub
		boolean exit1=false;
		boolean exit2=false;
		//boolean exit3=false;
		Scanner scan = new Scanner(System.in);
		String input;
		Factory vehicle=new Factory();
		ArrayList<IMileageEfficiency> iMileageList=new ArrayList<IMileageEfficiency>();
		ArrayList<ElectricVehicle> electricList=new ArrayList<ElectricVehicle>();
		ArrayList<GasVehicle> gasList=new ArrayList<GasVehicle>();
		
		do
		{
			
			//ArrayList<Student> myStudentList=new ArrayList();
			System.out.println("Please choose what you want to do!(choose 1 to 5)");
			System.out.println("1: Add a car");
			System.out.println("2: Delete a car");
			System.out.println("3: List the car");
			System.out.println("4: Get the capacity of your car list");
			System.out.println("5: Search the car");
			System.out.println("6: Sort the car list");
			System.out.println("7: Write to File");
			System.out.println("8: Read from File");
			System.out.println("9: Exit");
			int choice=scan.nextInt();
			if(choice==1)
			{
				do
				{
					int i=1;
					for(EnumCarType item:EnumCarType.values())
					{
						System.out.println(i+": "+item);
						i++;
					}
					System.out.println("Please choose the type of the car you want to input!(choose 1 to 3)");
					int op=scan.nextInt();
					if(op==2)
					{
						ElectricVehicle elecVehicle=new ElectricVehicle();
						//Student aStudent1=new Student();
						System.out.println("Please input vehicle serial number:");
						input = scan.next();
						if(Validator.isValidSerialNum(input))
						{
							//aStudent1.setId(Long.parseLong(input));
							elecVehicle.setSerialNumber(input);
							boolean exit=false;
							do{
								System.out.println("Please input the car brand:");
								input = scan.next();
								if(Validator.isName1(input))
								{
									
									boolean exi=false;
									elecVehicle.setMake(Validator.formatData(input));
									//aStudent1.setFn("Laura");
									//aStudent1.setFn(input);
									do{
										System.out.println("Please input the car model:");
										input = scan.next();
										if(Validator.isName1(input))
										{
											elecVehicle.setModel(Validator.formatData(input));
											int year,month,day;
											year=Calendar.getInstance().get(Calendar.YEAR);
											month=Calendar.getInstance().get(Calendar.MONTH);
											day=Calendar.getInstance().get(Calendar.DAY_OF_MONTH);
											elecVehicle.setDate(month, day, year);
											elecVehicle.setType(EnumCarType.ElectricVehicle);
											/*int i=0;
											for(EnumCarType item:EnumCarType.values())
											{
												System.out.println(i+": "+item);
												i++;
											}
											System.out.println("Please choose a car type!(choose 1 to 3)");
											int op=scan.nextInt();
											elecVehicle.setType(EnumCarType.values()[op-1]);*/
											System.out.println("Please input the car price:");
											input = scan.next();
											if(Validator.isValidDecimal(input))
											{
												elecVehicle.setPrice(Float.parseFloat(input));
											}
											elecVehicle.makeTrip();
											float mile=elecVehicle.calculateMiles(elecVehicle.getPrice(),elecVehicle.getSecond());
											elecVehicle.setCounter(mile); 
											float kilo=elecVehicle.calculateKilowatt(elecVehicle.getPrice(), elecVehicle.getSecond());
											elecVehicle.setKilowatts(kilo);
											iMileageList.add(elecVehicle);
											vehicle.add(elecVehicle);
											//electricList.add(elecVehicle);
											exi=true;
										}
										
									}while(!exi);
									exit=true;
									
								}
							}while(!exit);
							/*System.out.println("Do you want to input another car?(y/n):");
							char option;
							option=scan.next().charAt(0);
							if(option=='n'||option=='N')
							{
								exit2=true;
							}*/
					}
					//elecVehicle.setType(EnumCarType.values()[op-1]);
					
						//exit1=true;
						
					}
					else if(op==1)
					{
						GasVehicle gasVehicle=new GasVehicle();
						//ElectricVehicle elecVehicle=new ElectricVehicle();
						//Student aStudent1=new Student();
						System.out.println("Please input vehicle serial number:");
						input = scan.next();
						if(Validator.isValidSerialNum(input))
						{
							//aStudent1.setId(Long.parseLong(input));
							gasVehicle.setSerialNumber(input);
							boolean exit=false;
							do{
								System.out.println("Please input the car brand:");
								input = scan.next();
								if(Validator.isName1(input))
								{
									
									boolean exi=false;
									gasVehicle.setMake(Validator.formatData(input));
									//aStudent1.setFn("Laura");
									//aStudent1.setFn(input);
									do{
										System.out.println("Please input the car model:");
										input = scan.next();
										if(Validator.isName1(input))
										{
											gasVehicle.setModel(Validator.formatData(input));
											int year,month,day;
											year=Calendar.getInstance().get(Calendar.YEAR);
											month=Calendar.getInstance().get(Calendar.MONTH);
											day=Calendar.getInstance().get(Calendar.DAY_OF_MONTH);
											gasVehicle.setDate(month, day, year);
											gasVehicle.setType(EnumCarType.GasolineVehicle);
											
											System.out.println("Please input the car price:");
											input = scan.next();
											if(Validator.isValidDecimal(input))
											{
												gasVehicle.setPrice(Float.parseFloat(input));
											}
											gasVehicle.makeTrip();
											float mile=gasVehicle.calculateMiles(gasVehicle.getPrice(),gasVehicle.getSecond());
											gasVehicle.setCounter(mile); 
											float gas=gasVehicle.calculateGasoline(gasVehicle.getPrice(), gasVehicle.getSecond());
											gasVehicle.setGasolin(gas);
											iMileageList.add(gasVehicle);
											vehicle.add(gasVehicle);
											//electricList.add(elecVehicle);
											exi=true;
										}
										
									}while(!exi);
									exit=true;
									
								}
							}while(!exit);
							/*System.out.println("Do you want to input another car?(y/n):");
							char option;
							option=scan.next().charAt(0);
							if(option=='n'||option=='N')
							{
								exit2=true;
							}*/
					}
					}
					else if(op==3)
					{
						System.out.println("You can only choose to input cars with either electric or gasoline!");
					}
					System.out.println("Do you want to input another car?(y/n):");
					char option;
					option=scan.next().charAt(0);
					if(option=='n'||option=='N')
					{
						exit2=true;
					}
				}while(!exit2);
			}
			if(choice==2)
			{
				boolean exi=false;
				do
				{
					System.out.println("Please choose how do you want to delete:\n" +
							"1 Delete by Index\n2 Delete by Car Name\n3 Delete by ID\n4 Delete a Car Type\n"+
							"5 Return to Main Menu!\n" );
					int search=scan.nextInt();
					
					if(search==1)
					{
						int total=vehicle.getCapacity();
						System.out.println("The total number of records is: "+total);
						if(total>0)
						{
							System.out.println("Input the index of car that you want to delete(from 0 to "+--total+")");
							int s1=scan.nextInt();	
							vehicle.remove(s1);
							System.out.println("You have deleted successfully the record! ");
						}
						else
						{
							System.out.println("No Car records exist! ");
						}
						
						scan.nextLine();
					}
					if(search==2)
					{
						boolean s2=false;
						//Vehicle car=new Vehicle();
						do
						{
							System.out.println("Please choose delete by which name:\n" +
									"1 Brand Name\n2 Car Name\n3 Return to Delete Menu\n ");
							int op2=scan.nextInt();
							if(op2==1)
							{
								System.out.println("Please input the brand name you want to delete: ");
								String name=scan.next();
								ArrayList<Vehicle> searchList=new ArrayList<Vehicle>();
								searchList=vehicle.searchByBrandOrName(Validator.formatData(name), true);
								if(searchList.size()>0)
								{
									vehicle.listAllVehicles(searchList);
									System.out.println("According to the brand name you entered," +
											" there are following records. Choose the one that you want to delete(1 to "+searchList.size()+")");
									int op3=scan.nextInt();
									String number=searchList.get(--op3).getSerialNumber();
									Vehicle 	car=vehicle.searchById(number);
									vehicle.remove(car);
									System.out.println("The car is deleted successfully! \n");
								}
								
								else
								{
									System.out.println("No Vehicle matches your input brand name! ");
								}
								scan.nextLine();
							}
							if(op2==2)
							{
								System.out.println("Please input the car name you want to delete: ");
								String name=scan.next();
								ArrayList<Vehicle> searchList=new ArrayList<Vehicle>();
								searchList=vehicle.searchByBrandOrName(Validator.formatData(name), false);
								if(searchList.size()>0)
								{
									vehicle.listAllVehicles(searchList);
									System.out.println("According to the car name you entered," +
											" there are following records. Choose the one that you want to delete(1 to "+searchList.size()+")");
									int op3=scan.nextInt();
									String number=searchList.get(--op3).getSerialNumber();
									Vehicle  car=vehicle.searchById(number);
									vehicle.remove(car);
									System.out.println("The car is deleted successfully! \n");
								}
								
								else
								{
									System.out.println("No Vehicle matches your input car name! ");
								}
								scan.nextLine();
							}
							else
							{
								s2=true;
							}
							
						}while(!s2);
						
					}
					if(search==3)
					{
						System.out.println("Please input the id you want to delete: ");
						String id=scan.next();
						Vehicle searchPlayer=vehicle.searchById(id);
						if(searchPlayer!=null)
						{
							vehicle.remove(searchPlayer);
							System.out.println("The car is deleted successfully! \n");
						}
						else
						{
							System.out.println("No Car matches your input id! ");
						}
						scan.nextLine();
					}
					if(search==4)
					{

						ArrayList<Vehicle> searchList=new ArrayList<Vehicle>();
						EnumCarType s=EnumCarType.Undefined;
						System.out.println("Please choose the car type you want to delete(1 to 2): \n"
								+"1 Gasoline Car\n2 Electrical Car\n");
						int s4=scan.nextInt();
						if(s4==1)
						{
							s=EnumCarType.GasolineVehicle;
						}
						else if(s4==2)
						{
							s=EnumCarType.ElectricVehicle;
						}
						
						else
						{
							System.out.println("No Car type matches your option! Please choose from 1 to 2! ");
						}
						searchList=vehicle.searchByType(s);
						if(searchList.size()>0)
						{
							System.out.println("Are you sure you want to delete all cars under this type?!(y/n) ");
							char sure=scan.next().charAt(0);
							if(sure=='Y'||sure=='y')
							{
								vehicle.deleteByType(searchList);
								System.out.println("All Cars under this type are deleted! ");
							}
							else
							{
								System.out.println("No Car under this type is deleted! ");
							}
						}
						else
						{
							System.out.println("No Car records in the type you have chosen! ");
						}
						scan.nextLine();
					}
					if(search==5)
					{
						exi=true;
						//choice=8;
					}
				}while(!exi);
				
			}
			if(choice==3)
			{
				electricList.clear();
				gasList.clear();
				System.out.println("Printing the vehicle list using the IMileageEfficiency way(used as a backup records)");
				for(IMileageEfficiency element:iMileageList)
				{
					if(element instanceof ElectricVehicle)
					{
						System.out.println(element);
						
					}
					else if(element instanceof GasVehicle) System.out.println(element);
					//else if(element instanceof Customer) System.out.println(element+"\nPayment:"+twoDecimal.format(element.calculatePayment()));
				}
				System.out.println("Splitting the vehicle list into 2 sublists");
				for(Vehicle item : vehicle.getVehicleList())
				{
					if(item instanceof ElectricVehicle)
					{
						electricList.add((ElectricVehicle)item);
					}
					else if (item instanceof GasVehicle)
					{
						gasList.add((GasVehicle)item);
					}
					
				}
				System.out.println("Printing the GasVehicle lists");
				for(GasVehicle item : gasList)
				{
					
					System.out.println(item.toString());
				}
				System.out.println("Printing the ElectricVehicle lists");
				for(ElectricVehicle item : electricList)
				{
					
					System.out.println(item.toString());
				
				}
			}
			if(choice==4)
			{
				int capacity=vehicle.getCapacity();
				System.out.println("The total number of the cars in the factory is: "+capacity);
			}
			if(choice==5)
			{
				
				boolean exi=false;
				do
				{
					System.out.println("Please choose how do you want to search:\n" +
							"1 Search by Index\n2 Search by Car Name\n3 Search by ID\n4 Search by a Car Type\n"+
							"5 Return to Main Menu!\n" );
					int search=scan.nextInt();
					
					if(search==1)
					{
						int total=vehicle.getCapacity();
						System.out.println("The total number of records is: "+total);
						System.out.println("Input the index of player that you want to search(from 0 to "+--total+")");
						int s1=scan.nextInt();
						Vehicle searchCar=vehicle.searchByIndex(s1);
						if(searchCar!=null)
						System.out.println("The car is found: \n"+searchCar.toString());
						else
						{
							System.out.println("No Car matches your input index! ");
						}
						scan.nextLine();
					}
					if(search==2)
					{
						//ArrayList<Vehicle> searchList=new ArrayList<Vehicle>();
						boolean s2=false;
						//Vehicle car=new Vehicle();
						do
						{
							System.out.println("Please choose search by which name:\n" +
									"1 Brand Name\n2 Car Name\n3 Return to Search Menu\n ");
							int op2=scan.nextInt();
							if(op2==1)
							{
								System.out.println("Please input the brand name you want to search: ");
								String name=scan.next();
								ArrayList<Vehicle> searchList=new ArrayList<Vehicle>();
								searchList=vehicle.searchByBrandOrName(Validator.formatData(name), true);
								if(searchList.size()>0)
								{
									System.out.println("The vehicles that equal the brand name you input are as follows: ");
									vehicle.listAllVehicles(searchList);
									
								}
								
								else
								{
									System.out.println("No Vehicle matches your input brand name! ");
								}
								scan.nextLine();
							}
							if(op2==2)
							{
								System.out.println("Please input the car name you want to search: ");
								String name=scan.next();
								ArrayList<Vehicle> searchList=new ArrayList<Vehicle>();
								searchList=vehicle.searchByBrandOrName(Validator.formatData(name), false);
								if(searchList.size()>0)
								{
									System.out.println("The vehicles that contain the car name you input are as follows: ");
									vehicle.listAllVehicles(searchList);
									
									
								}
								
								else
								{
									System.out.println("No Vehicle matches your input car name! ");
								}
								scan.nextLine();
							}
							else
							{
								s2=true;
							}
							
						}while(!s2);
						
						scan.nextLine();
					}
					if(search==3)
					{
						System.out.println("Please input the id you want to search: ");
						String id=scan.next();
						System.out.println("The input is: \n"+id);
						Vehicle searchCar2=vehicle.searchById(id);
						if(searchCar2!=null)
						{
							System.out.println("The car is found: \n"+searchCar2.toString());
						}
						else
						{
							System.out.println("No car matches your input id! ");
						}
						scan.nextLine();
					}
					if(search==4)
					{

						ArrayList<Vehicle> searchList=new ArrayList<Vehicle>();
						EnumCarType s=EnumCarType.Undefined;
						System.out.println("Please choose the vehicle type you want to search(1 to 2): \n"
								+"1 Gasoline Vehicle\n2 Electrical Vehicle\n");
						int s4=scan.nextInt();
						if(s4==1)
						{
							s=EnumCarType.GasolineVehicle;
						}
						else if(s4==2)
						{
							s=EnumCarType.ElectricVehicle;
						}
					
						else
						{
							System.out.println("No vehicle type matches your option! Please choose from 1 to 2! ");
						}
						searchList=vehicle.searchByType(s);
						if(searchList.size()>0)
						{
							vehicle.listAllVehicles(searchList);
						}
						else
						{
							System.out.println("No car records exist in the type you have chosen! ");
						}
						scan.nextLine();
					}
					if(search==5)
					{
						exi=true;
						//choice=8;
					}
				}while(!exi);
				
			}
			if(choice==6)
			{
				boolean exit6=false;
				do
				{
					System.out.println("Please choose how do you want to sort?(1 to 4): \n"
							+"1 Sort by Mileage(descending order)\n2 Sort by ID(ascending order)\n3 Sort by Brand Name\n4 Sort by Car Name\n5 Sort by Produce Date\n" +
									"6 Sort by Price\n7 Return to Main Menu\n");
					int sort=scan.nextInt();
					if(sort==1)
					{
						MileageComparator miComp=new MileageComparator();
						Collections.sort(vehicle.getVehicleList(), miComp);
						System.out.println("Printing the sorted by mileage lists");
						
						for(Vehicle item:vehicle.getVehicleList())
						{
							System.out.println(item.toString());
						}
						
					}
					else if(sort==2)
					{
						IdComparator idComp=new IdComparator();
					
					Collections.sort(vehicle.getVehicleList(), idComp);
					System.out.println("Printing the sorted by id lists");
					
					for(Vehicle item:vehicle.getVehicleList())
					{
						System.out.println(item.toString());
					}
					}
					else if(sort==3)
					{
						BrandNameComparator bNameComp=new BrandNameComparator();
						//Collections.sort(lasalle.getMemberList(), nameComp);
						Collections.sort(vehicle.getVehicleList(), bNameComp);
						System.out.println("Printing the sorted by Brand Name lists");
						
						for(Vehicle item:vehicle.getVehicleList())
						{
							System.out.println(item.toString());
						}
					}
					else if(sort==4)
					{
						CarNameComparator cNameComp=new CarNameComparator();
						//Collections.sort(lasalle.getMemberList(), nameComp);
						Collections.sort(vehicle.getVehicleList(), cNameComp);
						System.out.println("Printing the sorted by Car Name lists");
						
						for(Vehicle item:vehicle.getVehicleList())
						{
							System.out.println(item.toString());
						}
					}
					else if(sort==5)
					{
						DateComparator dateCom=new DateComparator();
						Collections.sort(vehicle.getVehicleList(), dateCom);
						System.out.println("Printing the sorted by car produce date lists");
						
						for(Vehicle item:vehicle.getVehicleList())
						{
							System.out.println(item.toString());
						}
					}
					else if(sort==6)
					{
						PriceComparator com=new PriceComparator();
						Collections.sort(vehicle.getVehicleList(), com);
						System.out.println("Printing the sorted by Price lists");
						
						for(Vehicle item:vehicle.getVehicleList())
						{
							System.out.println(item.toString());
						}
					}
					else
					{
						exit6=true;
						//choice=8;
					}
				}while(!exit6);
			}
			if(choice==7)
			{
				FileHandler.writeToFile(vehicle.getVehicleList());
				System.out.println("Data write to File successfully!");				
			}
			if(choice==8)
			{
				ArrayList<Vehicle> listFromFile=new ArrayList<Vehicle>();
				listFromFile=FileHandler.readFromFile();
			
				System.out.println("Data from File");
				for(Vehicle element:listFromFile)
				{
					System.out.println(element);
				}
			}
				if(choice==9)
				{
					System.out.println("You have successfully exited the application!");
					exit1=true;
				}
			
		}while(!exit1);
		
		
		//long startTime = System.nanoTime();    
		/*long createdMillis = System.currentTimeMillis();
		// ... the code being measured ...   
		System.out.println("press enter to start to count");
		//scan.nextLine();
		scan.nextLine();
		//long estimatedTime = System.nanoTime() - startTime;
		 long nowMillis = System.currentTimeMillis();
		 long seconds=(nowMillis - createdMillis) / 1000;
		System.out.println("time passed:"+seconds);*/

	}

}

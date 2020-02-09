package bus;

public class Validator {
	public static String formatData(String str)
	{
		String cap = str.substring(0, 1).toUpperCase() + str.substring(1).toLowerCase();
		return cap;
	}
	public static boolean isValidDecimal(String value)
	{
		try
		{
			Float.parseFloat(value);
			return true;
		}
		catch(NumberFormatException e)
		{
			System.out.println("YOU input invalid digits! Must be decimal digits!");
			return false;
		}
	}
	public static boolean isValidSerialNum(String id)
	{
		
		if(id.length()==17)
		{
			for(int i=0;i<id.length();i++)
			{
				char ch=id.charAt(i);
				if(Character.isLetter(ch)&&!Character.isUpperCase(ch))
				{
					System.out.println("The letters in a vehicle serial number must be capital letters)!");
					return false;
				}
				/*else
				{
					System.out.println("The letters in a vehicle serial number must be capital letters)!");
					return false;
				}*/
			}
			return true;
		}
		else
		{
			System.out.println("The vehicle serial number must be 17 characters (digits and capital letters)!");
			return false;
		}
	}
	public static boolean isDigit(String id)
	{
		if(id.length()==9)
		{
			try
			{
				Integer.parseInt(id);
			}
			catch(NumberFormatException ex)
			{
				System.out.println("The ID must be digits!");
				return false;
			}
			return true;
		}
		else
		{
			System.out.println("The ID must be 9 digits long!");
			return false;
		}
	}
	public static boolean isDigit2(String id)
	{
		if(id.length()==9)
		{
			for(int i=0;i<id.length();i++)
			{
				if(!Character.isDigit(id.charAt(i)))
						{	System.out.println("The ID must be digits!");
						return false;
						//break;
				}	
			}
			return true;
		}
		else
		{
			System.out.println("The ID must be 9 digits long!");
			return false;
		}
	}
	public static boolean isName(String name)
	{
		if(name==null||name.length()==0)
		{
			System.out.println("The name cannot be empty or null!");
			return false;
		}
		char[] chars=name.toCharArray();
		for(int i=0;i<chars.length;i++)
		{
			int point=Character.codePointAt(chars, i);
			if(!Character.isLetter(point)&&!Character.isSpaceChar(point)||Character.isDigit(point))
			{
				System.out.println("The name must be letter or space, cannot have digits!");
				return false;
			}
		}
		return true;
	}
	public static boolean isName1(String name)
	{
		if(name.length()==0||name==null)
		{
			System.out.println("The name cannot be empty or null!");
			return false;
		}
		if(!Character.isLetter(name.charAt(0)))
		{
			System.out.println("The first letter of name must be a letter!");
			return false;
		}
		for(int i=0;i<name.length();i++)
		{
			char ch=name.charAt(i);
			if(!Character.isLetter(ch)&&ch!=' ')
			{
				System.out.println("The name must be letter or space, cannot have digits!");
				return false;
			}
		}
		return true;
	}
}

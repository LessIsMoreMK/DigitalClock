import java.util.ArrayList;

public class Clock {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(0);
		list.add(0);
		list.add(0);
		list.add(2);
		
		System.out.println(BigestHourOnDigitalClock(list));
	}
	public static String BigestHourOnDigitalClock(ArrayList<Integer> list)
	{
		String result = "";
		int temp = CheckForBigestNumber(list, 2);
		if(temp==2)
		{
			result +=temp;
			list.remove(new Integer(temp));
			
			temp = CheckForBigestNumber(list, 3);
			if(temp<=3 && temp>=0)
			{
				result +=temp+":";
				list.remove(new Integer(temp));
				
				temp = CheckForBigestNumber(list, 5);
				if(temp>=0 && temp<=5)
				{
					result +=temp;
					list.remove(new Integer(temp));
					
					temp = CheckForBigestNumber(list, 9);
					if(temp>=0 && temp<=9)
					{
						result +=temp;
					}
					else
					{
						System.out.println("Cannot create clock hour.");
						return "";
					}
				}
				else
				{
					System.out.println("Cannot create clock hour.");
					return "";
				}
			}
			else
			{
				System.out.println("Cannot create clock hour.");
				return "";
			}
		}
		else if(temp==1 || temp==0)
		{
			result +=temp;
			list.remove(new Integer(temp));
			
			temp = CheckForBigestNumber(list, 9);
			if(temp>=0 && temp<=9)
			{
				result +=temp+":";
				list.remove(new Integer(temp));
				
				temp = CheckForBigestNumber(list, 5);
				if(temp>=0 && temp<=5)
				{
					result +=temp;
					list.remove(new Integer(temp));
					
					temp = CheckForBigestNumber(list, 9);
					if(temp>=0 && temp<=9)
					{
						result +=temp;
					}
					else
					{
						System.out.println("Cannot create clock hour.");
						return "";
					}
				}
				else
				{
					System.out.println("Cannot create clock hour.");
					return "";
				}
			}
			else
			{
				System.out.println("Cannot create clock hour.");
				return "";
			}
		}
		else
		{
			System.out.println("Cannot create clock hour.");
			return "";
		}
		
		return result;
	}
	public static int CheckForBigestNumber(ArrayList<Integer> list, int bigestPossibleNumber)
	{
		int result =-1;
		for(int i=bigestPossibleNumber; i>=0; i--)
		{
			for(int j=0; j<list.size();j++)
			{
				if(list.get(j)==i)
				{
					result=i;
					return result;
				}
			}
		}
		return result;
	}

}

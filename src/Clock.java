import java.util.ArrayList;

public class Clock {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList();
		list.add(1);
		list.add(9);
		list.add(1);
		list.add(5);
		
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
			if(temp==3 || temp==2 || temp==1 || temp==0)
			{
				result +=temp+":";
				list.remove(new Integer(temp));
				
				temp = CheckForBigestNumber(list, 5);
				if( temp == 5 || temp==4 || temp==3 || temp==2 || temp==1 || temp==0)
				{
					result +=temp;
					list.remove(new Integer(temp));
					
					temp = CheckForBigestNumber(list, 9);
					if(temp==9 || temp==8 || temp==7 || temp==6 || temp==5 || temp==4 || temp==3 || temp==2 || temp==1 || temp==0)
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
			if(temp==9 || temp==8 || temp==7 || temp==6 || temp==5 || temp==4 || temp==3 || temp==2 || temp==1 || temp==0)
			{
				result +=temp+":";
				list.remove(new Integer(temp));
				
				temp = CheckForBigestNumber(list, 5);
				if( temp == 5 || temp==4 || temp==3 || temp==2 || temp==1 || temp==0)
				{
					result +=temp;
					list.remove(new Integer(temp));
					
					temp = CheckForBigestNumber(list, 9);
					if(temp==9 || temp==8 || temp==7 || temp==6 || temp==5 || temp==4 || temp==3 || temp==2 || temp==1 || temp==0)
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

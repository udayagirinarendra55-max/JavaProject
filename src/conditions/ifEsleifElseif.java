package conditions;

public class ifEsleifElseif {

	public static void main(String[] args) {
  
		// if age is > 18 and lessthan 25 , gift a bike
		// if age is > 25 and 35 gift a car
		// if age is > 35 and less 50 gift a house
		//above 50 ---> pension 
		
		
		int age=38;
		
		if(age> 18 && age < 25)
		{
			System.out.println("gift a bike");
		}
		else if(age> 25 && age < 35)
		{
			System.out.println("gift a car");
		}
		else if(age> 35 && age < 50)
		{
			System.out.println("gift a car");
		}
		else
		{
			System.out.println("Pension");
		}
	}

}

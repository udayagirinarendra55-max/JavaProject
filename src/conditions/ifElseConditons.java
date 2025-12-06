package conditions;

public class ifElseConditons {

	public static void main(String[] args) {
		int a=110;
		
		if(a>18)                 //:+++++++++++> no semicolon
		{  
			System.out.println("Hi");
	    	System.out.println("You are eligible to vote");
		}
		else              //no condition is written here
		{
			//execute only : if block is not executed 
			System.out.println("you are not eligible to vote ");
		}
		
		// 1. Can we write if without else --> Yes
		// 2. Can we write else without if --> NO 
		//3. can we write anything any between in if and else --> NO

	}

}

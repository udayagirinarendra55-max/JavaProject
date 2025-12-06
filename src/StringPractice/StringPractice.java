package StringPractice;

public class StringPractice {

	public static void main(String[] args) {
     
		// in String we can store anything , alphanumber -> alksj928342-dlkjfa$%@$#
		
		String str="Muneer";
		String str2="MuneeR";
		//String str2=new String("...");
		
		System.out.println(str);
		
		//--> given us methods , which we use 
		
		System.out.println(str.toUpperCase());  //str.
		System.out.println(str.toLowerCase());  
		
		System.out.println(str.contains("is"));
		
		System.out.println("**************************");
		System.out.println(str.equals(str2));              // dont use ===, , .equals()
		System.out.println(str.equalsIgnoreCase(str2));
		
		System.out.println(str.replace("M", "A"));
		
		System.out.println(str.endsWith("R"));
		
		System.out.println(str.charAt(5));
		
		System.out.println(str.indexOf('n'));
		
		String str3="eHi Hello";
		System.out.println(str3.indexOf('H'));  //left to right ------->
		
		System.out.println(str3.lastIndexOf('H'));  //Search right to left <---------
		
		System.out.println(str3.length());
		
	}

}

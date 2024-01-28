import java.io.*; 

// class ehandling { 
// 	public static void main (String[] args) { 
// 	int a=5; 
// 	int b=0; 
// 		try{ 
// 		System.out.println(a/b); 
// 		} 
// 	catch(ArithmeticException e){ 
// 		// e.printStackTrace(); 
//         // System.out.println(e.toString()); 
//         System.out.println(e.getMessage());
// 	} 
// 	} 
// } 

class ehandling {  
	static int divideByZero(int a, int b) 
	{  
		int i = a / b; 
		return i; 
	} 
	static int computeDivision(int a, int b) 
	{ 
		int res = 0; 
		try { 
			res = divideByZero(a, b); 
		} 
		catch (NumberFormatException ex) { 
			System.out.println("NumberFormatException is occurred"); 
		} 
		return res; 
	} 
	public static void main(String args[]) 
	{ 
		int a = 1; 
		int b = 0; 
		try { 
			int i = computeDivision(a, b); 
		} 
		catch (ArithmeticException ex) { 
			System.out.println(ex.getMessage()); 
		} 
	} 
}


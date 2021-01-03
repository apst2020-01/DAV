import java.util.Scanner;
public class SumOf2Integers {

	static int AddSum (int a, int b) {
		return a +b; 
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		System.out.println ("Enter number a");
		int a = in.nextInt ();
		System.out.println("Enter number b");
		int b = in.nextInt();
		
		AddSum (a,b);
		System.out.println ((AddSum (a,b)));
		
	}	
	
	
	}
	

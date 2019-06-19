package order;
public class Equals {
   
	public static void main(String[] args) 
	{ 
		Thread t1 = new Thread(); 
		Thread t2 = new Thread(); 
		Thread t3 = t1; 

		String s1 = new String("hi"); 
		String s2 = new String("hi"); 

		System.out.println("Refer the same object : "+(t1 == t3)); 
		System.out.println("Two different objects : "+(t1 == t2)); 
		System.out.println("Two different objects of different class : "+(s1 == s2)); 
		System.out.println("same contents : "+s1.equals(s2)); 
	} 
} 



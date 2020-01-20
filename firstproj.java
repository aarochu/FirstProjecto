import java.util.Random;
public class FirstProj
{ 

	public static void main(String args[]) 
	{ 
		
	    boolean tester = false;
	    //change this loop to print all odd numbers between 20 and 36
		for (int i = 21; i<37;i=i+2) {
			System.out.println(i);
	    }	
		System.out.println("Hi my name is Aaron, I weigh 2000 pounds uwu."); 
		//change the following such that if tester is true print "Shoutout to Match" else if it is false print "Cheddar cheese"
		if(tester == true){
		    System.out.println("Shoutout to Match");
		}	else
			System.out.println("Cheedar cheese");
	    //random number generator between 1 - 20
		Random rand = new Random();
	    int n = rand.nextInt(21);
		n += 1;
		System.out.println(n);
		    }
		}
	 

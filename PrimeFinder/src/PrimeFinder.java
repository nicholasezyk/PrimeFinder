import java.util.Scanner;
import java.util.Vector;


public class PrimeFinder{

     public static void main(String []args){
    	 
    	long time = System.currentTimeMillis();
    	
        Vector<Integer> primes = new Vector<Integer>();
        
        int cand = 2;
        
        int ct = 1;
        
        one:
        	while (0 != 3)
        	{
        		if (cand == Integer.MAX_VALUE)
        		{
        			int term = (int) ((System.currentTimeMillis() - time) / 1000);
        			System.out.println("Terminated after " + term + " seconds.");
        			break one;	
        		}
        		
        		int sq = (int) (Math.sqrt((double) (cand)));
        		oneA: 			
	        		for (int i = 2; ; i++)
	        			{
	        				if (i > sq) 
	        				{
	        					//primes.addElement(cand);
	        					System.out.println(cand + " is prime number number " +  ct + ".");
	        					ct++;
	        					break oneA;
	        				}
	        				else if (cand % i == 0)
	        				{
	        					break oneA;
	        				}
	        			}
        		
        		cand++;
        		
        	}
     }
}

/* Jessica Zhang
 * Mr. Heiser
 * Honors Computer Programming
 * 5 September 2017
 */

public class VendingMachine 
{  
	public VendingMachine( )
	{
		tokens = 0;
		cans = 10;
	}
	public VendingMachine(int someCans)
	{
	 	tokens = 0;
		cans = someCans;  
	}
     	public void insertToken( ) 
    	{
    	tokens = tokens + 1;   // increase number of tokens
    	cans = cans - 1;       // decrease number of cans
    	return;
    	}
    	public void fillUp(int someCans) 
    	{
    	   cans = cans + someCans;   // add more cans
    	   return;
    	}
    	public int getCanCount( )	// heading for getCanCount
    	{
    	   return cans;   // return a value
    	}
    	public int getTokenCount( )	// heading for getTokenCount
    	{
    	   return tokens;   // return a value
    	}
    	
    	private int cans;
    	private int tokens;
    	
} 




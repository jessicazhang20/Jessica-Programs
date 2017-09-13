/* Jessica Zhang
 * Mr. Heiser
 * Honors Computer Programming
 * 5 September 2017
 */

public class VendingMachineTest 
{  
    public static void main(String[ ] args)
    {
       VendingMachine machine = new VendingMachine( );
       machine.fillUp(10);     // fill up with ten cans
       machine.insertToken( );
       machine.insertToken( );
       System.out.println("Token count = " + machine.getTokenCount( ));
       System.out.println("Can count = " + machine.getCanCount( )); 
    } 
}


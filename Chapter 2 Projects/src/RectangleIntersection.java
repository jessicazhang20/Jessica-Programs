/* Jessica Zhang
 * find intersection points 
 */

import java.awt.Rectangle;

public class RectangleIntersection 
{ 

	public static void main(String[] args)
	{ 
		Rectangle box1 = new Rectangle(2, 2, 5, 2);
		System.out.println("Rectangle A: " + box1);
		
		Rectangle box2 = new Rectangle(5, 3, 5, 2);
		System.out.println("Rectangle B: " + box2);
		
		Rectangle box3 = new Rectangle(3, 6, 5, 2);
		System.out.println("Rectangle C: " + box3);
		
		System.out.println("\n");
		
		box1.intersection(box2);
		System.out.println("Intersection of A and B: " + box1.intersection(box2));
		
		box1.intersection(box3);
		System.out.println("Intersection of A and C: " + box1.intersection(box3));
	
	}

}


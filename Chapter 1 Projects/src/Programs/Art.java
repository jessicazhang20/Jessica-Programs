/* 
 * Jessica Zhang
 * Mr. Heiser
 * Honors Computer Programming
 * 18 August 2017
 */
package Programs;
/**
     Displays an 'art' drawing
 */             

public class Art
{
  public static void main(String[ ] args)
  {
    String s1 = " *   *   *   *   *   * ";
    String s2 = "   *   *   *   *   *   ";
    String s3 = "__________________________________\n";
    String s4 = "_________________________________________________________\n";

    System.out.print(s4 + s1 + s3 + s2 + s3);
    System.out.print(s1 + s3 + s2 + s3);
    System.out.print(s1 + s3 + s2 + s3);
    System.out.print(s1 + s3 + s2 + s3);
    System.out.print(s4 + s4 + s4 + s4 + s4);
  }
}

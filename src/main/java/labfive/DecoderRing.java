package labfive;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/** Creates a decoder ring for G. Wiz's message.
 *
 * @author Solution Repository
 */
public class DecoderRing {
  
  /** Entry point.
   *
   * @param args The command line arguments
   */
  public static void main(String[] args) {
    // Create identifiers for input
    File file = null;
    Scanner input = null;
    // Read input from file
    try {
      file = new File("input/code.word");
      input = new Scanner(file);
    } catch (FileNotFoundException noFile) {
      System.exit(0);
    }
    // Get cipher key
    String codeName = new String();
    String enciphered = input.nextLine();
    int key = enciphered.length();
    // First letter
    char firstLttr = enciphered.charAt(0);
    codeName += (char)(firstLttr - key);
    // Second letter
    char secondLttr = enciphered.charAt(1);
    codeName += (char)(secondLttr - key);
    // Third letter
    char thirdLttr = enciphered.charAt(2);
    codeName += (char)(thirdLttr - key);
    // Fourth letter
    char fourthLttr = enciphered.charAt(3);
    codeName += (char)(fourthLttr - key);
    // Fifth letter
    char fifthLttr = enciphered.charAt(4);
    codeName += (char)(fifthLttr - key);
    // What does it spell?
    System.out.print("Welcome to the club, " + codeName);
  }
}
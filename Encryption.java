import java.util.*;
public class Encryption  {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println(" Enter Your message : ");
    String plaintext = sc.nextLine();
    System.out.println(" Enter your Shift : ");
    int shift = sc.nextInt();
    String ciphertext = "";
    char ExtractedCharacter;
    for (int i = 0; i < plaintext.length(); i++) {
      ExtractedCharacter = plaintext.charAt(i);

      if (ExtractedCharacter >= 'a' && ExtractedCharacter <= 'z') {

        ExtractedCharacter = (char)(ExtractedCharacter + shift);

        if (ExtractedCharacter > 'z') {

          ExtractedCharacter = (char)(ExtractedCharacter + 'a' - 'z' - 1);
        }
        ciphertext = ciphertext + ExtractedCharacter;
        
      } else if (ExtractedCharacter >= 'A' && ExtractedCharacter <= 'Z') {

        ExtractedCharacter = (char)(ExtractedCharacter + shift);

        if (ExtractedCharacter > 'Z') {

          ExtractedCharacter = (char)(ExtractedCharacter + 'A' - 'Z' - 1);
        }
        
        ciphertext = ciphertext + ExtractedCharacter;
        
      } else {
        ciphertext = ciphertext + ExtractedCharacter;
      }

    }
    System.out.println(" Your encrypted message is  : " + ciphertext);
  }
}
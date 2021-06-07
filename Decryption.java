import java.util.*;
public class Decryption {
        public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter your encrypted message : ");
        String ciphertext = sc.nextLine();
        System.out.println(" Enter the shift value : ");
        int shift = sc.nextInt();
        String Decryption = "";
        for(int i=0; i < ciphertext.length();i++)  

        {
            char ExtractedCharacter = ciphertext.charAt(i);
            
            if(ExtractedCharacter >= 'a' && ExtractedCharacter <= 'z')
            {
                ExtractedCharacter = (char) (ExtractedCharacter - shift);
            
                if(ExtractedCharacter < 'a') {

                    ExtractedCharacter = (char) (ExtractedCharacter-'a'+'z'+1);
                }
                Decryption = Decryption + ExtractedCharacter;
            }    
            else if(ExtractedCharacter >= 'A' && ExtractedCharacter <= 'Z')
            {
                ExtractedCharacter = (char) (ExtractedCharacter - shift);
                
                if (ExtractedCharacter < 'A') {
                    
                    ExtractedCharacter = (char) (ExtractedCharacter-'A'+'Z'+1);
                }
                Decryption = Decryption + ExtractedCharacter;            
            }
            else 
            {
             Decryption = Decryption + ExtractedCharacter;            
            } 
        }
        System.out.println(" Your Decrypted message  : " + Decryption);
    }
}

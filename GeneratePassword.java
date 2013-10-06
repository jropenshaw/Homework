import java.util.Random;
import java.util.Scanner;

public class GeneratePassword

{

   public static void main( String[] args )

   {
      String words7 = "abalone bedouin citadel conjure dancers doodles flaming gnocchi glitter jargony lantern oranges ";
      String words4 = "ammo bawl chow clap dine dirt food frog hook inch into jest keys meme mesh mice onto once onyx ribs ride slam taxi thin ";

      Scanner keyboard = new Scanner(System.in);
         System.out.println("Enter a seed: ");
         long seed = keyboard.nextLong();
      
// Create random generator with seed      
      Random random = new Random();
         random.setSeed(seed);
         
// Calculate first random number
         int firstRandom = random.nextInt(12) + 1;
         int firstChar = ((firstRandom * 8) - 8);
         String firstWord = words7.substring(firstChar, firstChar + 7);
         String password = firstWord;
         System.out.println("First 7-letter word: '" + password + "'");
         
// Calculate second random number         
         int secondRandom = random.nextInt(10);
         password += secondRandom;
         password += secondRandom;
         System.out.println("With two digits: '" + password + "'");
         System.out.println();

// Calculate third random number and word         
         int thirdRandom = random.nextInt(24) + 1;
         firstChar = ((thirdRandom * 5) - 5);
         String secondWord = words4.substring(firstChar, firstChar + 4);
         password += secondWord;
         System.out.println("With 4-letter word: '" + password + "'");

// Calculate fourth random number
         int fourthRandom = random.nextInt(10);
         password += fourthRandom;
         password += fourthRandom;
         
         char tempChar = secondWord.charAt(3);
         String tempWord = String.valueOf(tempChar);
         tempChar = secondWord.charAt(2);
         tempWord += String.valueOf(tempChar);
         tempChar = secondWord.charAt(1);
         tempWord += String.valueOf(tempChar);
         tempChar = secondWord.charAt(0);
         tempWord += String.valueOf(tempChar);
         password += tempWord;

// Calculate fifth random number         
         int fifthRandom = random.nextInt(10);
         password += fifthRandom;
         password += fifthRandom;
         
// Calculate the sixth random number         
         int sixthRandom = random.nextInt(12) + 1;
            firstChar = ((sixthRandom * 8) - 8);
         String fourthWord = words7.substring(firstChar, firstChar + 7);
         password += fourthWord;

         System.out.println("With two digits: " + firstChar);
         System.out.println("password = " + password);

 

   } // end of method main

} // end of class GeneratePassword
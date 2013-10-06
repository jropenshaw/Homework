import java.util.Random;
import java.util.Scanner;

public class MathMindTricks

{

   public static void main( String[] args )

   {
      Scanner keyboard = new Scanner(System.in);
      System.out.print("Please enter a seed: ");
      long seed = keyboard.nextLong();
      
      // Create random generator with seed      
      Random random = new Random();
      random.setSeed(seed);
         
      // Calculate first random number
      int firstRandom = random.nextInt(10) + 1;

      System.out.println();
      System.out.println("Generate a random number between 1 and 10: " + firstRandom);

      // Multiply random by 9
      firstRandom = firstRandom * 9;
      System.out.println("Multiply it by nine: " + firstRandom);
         int firstNumber = firstRandom / 10;
         int secondNumber = firstRandom % 10;
         
      int firstResult = firstNumber + secondNumber;
      
     System.out.println("Add the digits of the result together: " + firstResult);
     
     firstResult += 4;
     System.out.println("Add four to your result: " + firstResult);
     System.out.println();
     System.out.println("You should get 13!");
     System.out.println();
    
     // Second MathMindTrick
     
     int secondRandom = random.nextInt(999 - 100 + 1) + 100;
      System.out.println("Generate a random three digit number: " + secondRandom);
     
     secondRandom *= 80;
      System.out.println("Multiply it by 80: " + secondRandom);
      
     secondRandom += 1;
      System.out.println("Add one to the result: " + secondRandom);
      
     secondRandom *= 250;
     System.out.println("Multiply the result by 250: " + secondRandom);
     
     int thirdRandom = random.nextInt(9999 - 1000 + 1) + 1000;
      System.out.println("Generate a random four digit number: " + thirdRandom);
      
     secondRandom += thirdRandom;
      System.out.println("Add the four digit number to your result: " + secondRandom);
     
     secondRandom += thirdRandom;
      System.out.println("Add the four digit number to your result again: " + secondRandom);
     
     secondRandom -= 250;
      System.out.println("Subtract 250 from your result: " + secondRandom);
     
     secondRandom /= 2;
      System.out.println("Divide the result by two: " + secondRandom);
      
     
     System.out.println();
     System.out.println("Does that look familiar?");
     System.out.println();
     
     // Third MathMindTrick
     int fourthRandom = random.nextInt(999 - 100 + 1) + 100;
      int firstDigit = fourthRandom / 100;
      int lastDigit = fourthRandom % 10;
     System.out.println("Generate a random three digit number where the first digit and");
     System.out.println("   the last digit differ by at least 2:");
     System.out.println();
     System.out.println("Base three digit number: " + fourthRandom);
     System.out.println("First digit: " + firstDigit);
      firstDigit += 3;
      int newLastDigit = firstDigit% 10;
     System.out.println("Add three to the first digit: " + firstDigit);
     System.out.println("Current last digit: " + lastDigit);
     System.out.println("New last digit: " + newLastDigit);
      String intString = Integer.toString(fourthRandom);
      char tempChar = intString.charAt(0);
      String tempWord = String.valueOf(tempChar);
      tempChar = intString.charAt(1);
      tempWord += String.valueOf(tempChar);
      tempWord += String.valueOf(newLastDigit);
      int newNumber = Integer.parseInt(tempWord);

     System.out.println("New three digit number: " + newNumber);
     System.out.println();
     
     // Final MathMindTrick
     System.out.println("Now for the final trick:");
      int reversedNumber = (100)*(newNumber % 10)+((newNumber - (newNumber % 10)) % 100) + (newNumber - (newNumber % 100)) / 100;
     System.out.println("New three digit number reversed: " + reversedNumber);
      int newResult;
      if (newNumber > reversedNumber)
      {
         newResult = (newNumber - reversedNumber);
      }
      else
      {
         newResult = reversedNumber - newNumber;
      }
     System.out.println("Take the three digit number you built and the result of reversing");
     System.out.println("  it.  Subtract the smaller of the two from the larger: " + newResult);
      reversedNumber = (100)*(newResult % 10)+((newResult - (newResult % 10)) % 100) + (newResult - (newResult % 100)) / 100;
     System.out.println("Now reverse the result of that subtraction: " + reversedNumber);
      int secondResult = newResult + reversedNumber;
     System.out.println("Now add the number you got from the subtraction to the number you");
     System.out.println("  just created: " + secondResult);
     System.out.println();
     System.out.println("Your number is " + secondResult);
   
   }
}

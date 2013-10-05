import java.util.Scanner;

public class Adventure {
   
   public static void main(String [] args){
   
      Scanner keyboard= new Scanner(System.in);

     
      System.out.println ("You're holding a ticking time bomb");
      System.out.println ("and a pair of pliers. There is a red");
      System.out.println ("wire and a blue wire coiled around the");
      System.out.println ("explosives and only 7 seconds remaining.");
      System.out.println ("Which wire do you cut?!");
      System.out.println ();
      System.out.println ("Enter 1 to cut the red wire.");
      System.out.println ("Enter 2 to cut the blue wire.");     
 
        //Only 1 or 2 inputs 
         int input1= keyboard.nextInt();
         if (input1 <= 1){
               input1 = 1;
               }
          else {
               input1 = 2;
               }
         
        //Start
               
        if (input1 == 1){   //Cut the red wire
         System.out.println ("Good choice! The timer has stopped!");
         System.out.println ("Now how should you get out of here?");
         System.out.println ("Your only options are to cut the lock");
         System.out.println ("off the door and fight your way past");
         System.out.println ("a squad of ninjas, or call your mom.");
         System.out.println ();
         System.out.println ("Enter 1 to take your chances with the");
         System.out.println ("ninjas. Enter 2 to call your mom.");
         int input2= keyboard.nextInt();
            if(input2 == 1){   //take on the ninjas
            System.out.println ("You just got your butt whooped by a");
            System.out.println ("team of highly trained ninjas. Did");
            System.out.println ("you really think you could take on");
            System.out.println ("10+ ninjas armed with only a pair of");
            System.out.println ("plyers? Noob.");
            }
            else{              //call your mom
            System.out.println ("Your mom comes to the rescue, whooping");
            System.out.println ("those ninjas in 30 seconds flat.");
            System.out.println ("Afterwards, she takes you out for some");
            System.out.println ("icecream. Overall, a pretty successful day.");
           
            }
            }
        else{               //cut the blue wire
         System.out.println ("Uh oh...The bomb is still ticking! 4");
         System.out.println ("seconds remaining on the clock! What");
         System.out.println ("will you do; take a chance and cut the");
         System.out.println ("red wire too, or throw the bomb and RUN?!");
         System.out.println ();
            System.out.println ("Enter 1 to cut the red wire. Enter 2");
            System.out.println ("to throw the bomb and book it.");
            int input3 = keyboard.nextInt();
            if(input3 == 1){   //cut the red wire
            System.out.println ("Phew, you got lucky; the bomb stopped");
            System.out.println ("ticking with 1 second on the clock! That");
            System.out.println ("was way too close for comfort. You should");
            System.out.println ("probably go change your underpants...");
            }
            else{              //throw it and run
            System.out.println ("Oh no...You didn't quite run fast");
            System.out.println ("enough...Ew, would you look at that");
            System.out.println ("mess.");
            }
         }
         
         
  
   
   }//end of main method
}//end of class Adventure

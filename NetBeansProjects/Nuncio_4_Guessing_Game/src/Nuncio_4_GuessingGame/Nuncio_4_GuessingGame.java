
package nuncio_4_guessing_game;

public class Nuncio_4_Guessing_Game {

   
     static String username;
     static int userguess;
     static int magicnumber;
     static Random  JasonConklinwantsaRandom;
     static Random randy = new Random ();
     static boolean playagain;
    public static void main(String[] args) {
        playagain = true;
        magicnumber = randy.nextInt(101);
        Scanner name = new Scanner(System.in);
        Scanner guess = new Scanner (System.in);
       System.out.println("Hello, would you like to play a game?");
       System.out.println("What is your name?");
       username = name.nextLine();
       System.out.println("Hello" + username +
                "please pick a number between 88 and 202");
       userguess = guess.nextInt();
       
       if (magicnumber == userguess){
           System.out.println("You win!!!!");
           playagain = false;
           
       } else if (magicnumber > userguess){
           System.out.println("Too low! Try again.");
           
       } else {
           System.out.println("Too high! Try again.");
       }    
       
         int guessesleft = 0;
       if (guessesleft < 1 ){
           System.out.println("NO MORE GUESSES - please play again.");
           playagain = false;
           
       }    
       Scanner userinputname = new Scanner(System.in);
       Scanner sc = new Scanner(System.in);
       //Two main ones we need
       int something = sc.nextInt();
       String variable = sc.nextLine();
       username = userinputname.nextLine();
       System.out.println("Hello " + username + "Let's play the game.");
        
       //runs while the condition is true
       while(guessesleft > 0 ){
           playthegame();
           guessesleft-- ;
        }
    }       

    private static void playthegame() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    }
       
       
       
    



package nuncio_4_game;
import java.util.Scanner;

public class Nuncio_4_Game {
static String hero;
  //#hero
    public static void main(String[] args) {
       System.out.println("Are you a boy or a girl?");
       Scanner genderpl=new Scanner(System.in);
       hero=genderpl.nextLine();
       if(hero.contains("b")){
           System.out.println("character is a boy");
       }else{ System.out.println("character is a girl");
       }
                                                        

    System.out.println("You are sitting alone outside at a lunch table,\n" +
"drawing in your sketchbook.\n" +
"You draw about a world filled with kings,queens,wizards,and magic!\n" +
"Suddenly, in the corner of your eye,\n" +
"you see an orb of light pass by. What do you choose to do?");
    Scanner follow =new Scanner(System.in);
     }static String answer;
    static void one () {
        System.out.println(answer=follow.nextLine();
    if(answer.contains("f")){
         System.out.println("You get up from your table to go look for the orb");
       }else{ System.out.println("You choose to ignore it and continue to draw");
    System.out.println("The orb flies by again\n" +
"this time you see it more clearly\n" +
"You decide to just follow it,\n" +
"You go behind the building to find it");}
    }}
    







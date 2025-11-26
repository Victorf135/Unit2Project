import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

      String q = SlotsAndTrivia.Trivia("","","","","","","","","","","","" );
      String question = q.split(",")[0];
      String answer = q.split(",")[1];
      System.out.println(question);
      Scanner s = new Scanner(System.in);
       String userAnswer = s.nextLine().toLowerCase();

       if (userAnswer.equalsIgnoreCase(answer)) {
         System.out.println("Correct!");
           System.out.println("Time for slots!!");
       }
       else{
         System.out.println("Wrong! Reset to try again!");
         return;
       }

       

      String a = SlotsAndTrivia.slots(0,0,0);
       System.out.println(a);


        int slot1 = Integer.parseInt(a.split(" ")[0]);
        int slot2 = Integer.parseInt(a.split(" ")[1]);
        int slot3 = Integer.parseInt(a.split(" ")[2]);


        if (slot1 == slot2) {
        System.out.println("You Won! You get $" + 30);
        }
        if(slot1 ==slot3) {
        System.out.println("You Won! You get $" + 30);
        }
        if(slot2 ==slot3){
        System.out.println("You Won! You get $" + 30);
        }
        if(slot1 ==slot2 &&slot1 ==slot3){
        System.out.println("Jackpot! You get $" + 100);
        }
        if (slot1 != slot2 && slot1 != slot3 && slot2 != slot3){
          System.out.println("Aww! Better luck next time!");
            System.out.println("To play again, reset the code!");
        }

    }
}

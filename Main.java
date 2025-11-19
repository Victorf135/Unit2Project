//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

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
        }

    }
}

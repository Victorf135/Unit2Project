public class SlotsAndTrivia {
    public static String slots(int slot1, int slot2, int slot3) {
        slot1 = (int) (Math.random() * 10);
        slot2 = (int) (Math.random() * 10);
        slot3 = (int) (Math.random() * 10);
        String slot1s = slot1 + "";
        String slot2s = slot2 + "";
        String slot3s = slot3 + "";

        return slot1s + " " + slot2s + " " + slot3s;
        // Call method: String a = Slots.slots(0,0,0);
        //        System.out.print(a);
    }


    static void slots2() {
        int a = (int) (Math.random() * 10);
        int b = (int) (Math.random() * 10);
        int c = (int) (Math.random() * 10);

        System.out.println(a + " " + b + " " + c);
        // Call method: Slots b = new Slots();
        //        b.slots2();

    }

    // # of Trivia Questions: 14
    //     Themes:
    //            -Shrek: Who is the main side character in the movie Shrek? Who is the main character in the movie Shrek?
    //            -Sports: Who is the starting opposite hitter on Japan's Volleyball team?  What does NBA stand for?  What does VNL stand for?  Who is the tallest player in the NBA currently? Who has the most Olympic Gold medals of all time?
    //            -Farming:
    //            -Video Games: What is the most popular video game that starts with an F?
    //            -Music: Who made the song Beanie?
}
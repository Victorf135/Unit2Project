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

    public static String Trivia(String Q1, String Q2, String Q3, String Q4, String Q5, String Q6, String Q7, String Q8, String Q9, String Q10, String Q11, String Q12){
        Q1 = "Who is the main side character in the movie Shrek?";
        Q2 = "Who is the main character in the movie Shrek?";
        Q3 = "Who is the female lead in the movie Shrek?";
        Q4 = "Who is the starting opposite hitter on Japan's Volleyball team?";
        Q5 = "What does NBA stand for?";
        Q6 = "What does VNL stand for?";
        Q7 = "Who is the tallest player in the NBA currently?";
        Q8 = "Who has the most Olympic Gold medals of all time?";
        Q9 = "What is the most popular video game that starts with an F?";
        Q10 = "Who made the song Beanie?";
        Q11 = "Who made the song Thriller?";
        Q12 = "Who made the song Grenade?";
        int v = ((int) (Math.random() * 14) + 1);
        String condition = "";

        if (v == 1) {
            condition = Q1;
        }
        if (v == 2) {
            condition = Q2;
        }
        if (v == 3) {
            condition = Q3;
        }
        if (v == 4) {
            condition = Q4;
        }
        if (v == 5) {
            condition = Q5;
        }
        if (v == 6) {
            condition = Q6;
        }
        if (v == 7) {
            condition = Q7;
        }
        if (v == 8) {
            condition = Q8;
        }
        if (v == 9) {
            condition = Q9;
        }
        if (v == 10) {
            condition = Q10;
        }
        if (v == 11) {
            condition = Q11;
        }
        if (v == 12) {
            condition = Q12;
        }

        return condition;

    }

    // # of Trivia Questions: 12
    //     Themes:
    //            -Shrek: Who is the main side character in the movie Shrek? Who is the main character in the movie Shrek?  Who is the female lead in the movie Shrek?
    //            -Sports: Who is the starting opposite hitter on Japan's Volleyball team?  What does NBA stand for?  What does VNL stand for?  Who is the tallest player in the NBA currently? Who has the most Olympic Gold medals of all time?
    //            -Video Games: What is the most popular video game that starts with an F?
    //            -Music: Who made the song Beanie?  Who made the song Thriller?  Who made the song Grenade?
}
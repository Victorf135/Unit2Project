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
        Q1 = "Who is the main side character in the movie Shrek?,Donkey";
        Q2 = "Who is the main character in the movie Shrek?,Shrek";
        Q3 = "Who is the female lead in the movie Shrek?,Fiona";
        Q4 = "Who is the starting opposite hitter on Japan's Volleyball team?,Nishida";
        Q5 = "What does NBA stand for?,National Basketball Association";
        Q6 = "What does VNL stand for?,Volleyball National League";
        Q7 = "Who is the tallest player in the NBA currently?,Victor Wembenyama";
        Q8 = "Who has the most Olympic Gold medals of all time?,Michael Phelps";
        Q9 = "What is the most popular video game that starts with an F?,Fortnite";
        Q10 = "Who made the song Beanie?,Chezile";
        Q11 = "Who made the song Thriller?,Michael Jackson";
        Q12 = "Who made the song Grenade?,Bruno Mars";
        int v = ((int) (Math.random() * 14) + 1);

        String condition = "";

        if (v == 1) {
            return Q1;
        }
        if (v == 2) {
            condition = Q2 + "," + v;
        }
        if (v == 3) {
            condition = Q3 + "," + v;
        }
        if (v == 4) {
            condition = Q4 + "," + v;
        }
        if (v == 5) {
            condition = Q5 + "," + v;
        }
        if (v == 6) {
            condition = Q6 + "," + v;
        }
        if (v == 7) {
            condition = Q7 + "," + v;
        }
        if (v == 8) {
            condition = Q8 + "," + v;
        }
        if (v == 9) {
            condition = Q9 + "," + v;
        }
        if (v == 10) {
            condition = Q10 + "," + v;
        }
        if (v == 11) {
            condition = Q11 + "," + v;
        }
        if (v == 12) {
            condition = Q12 + "," + v;


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
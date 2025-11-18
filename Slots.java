public class Slots {
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
}
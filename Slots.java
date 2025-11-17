public class Slots {
    public static String slots(int slot1, int slot2, int slot3) {
        slot1 = (int) (Math.random() * 10);
        slot2 = (int) (Math.random() * 10);
        slot3 = (int) (Math.random() * 10);
        String slot1s = slot1 + "";
        String slot2s = slot2 + "";
        String slot3s = slot3 + "";

        if(slot1 == slot2){
            return String.valueOf(30);
        }
        if(slot1 == slot3){
            return String.valueOf(30);
        }
        if(slot2 == slot3){
            return String.valueOf(30);
        }
        if(slot1 == slot2 && slot1 == slot3){
            return String.valueOf(100);
        }


        return slot1s + " " + slot2s + " " + slot3s;
        // Call method: String a = Slots.slots(0,0,0);
        //        System.out.print(a);
     }



         static void slots2() {
        int a = (int) (Math.random() * 10);
        int b = (int) (Math.random() * 10);
        int c = (int) (Math.random() * 10);
        int d = (int) (Math.random() * 10);
        int e = (int) (Math.random() * 10);

        System.out.println(a + " " + b + " " + c + " " + d + " " + e);
            // Call method: Slots b = new Slots();
             //        b.slots2();

        }
    }

//, int slot4, int slot5
//slot4 = (int) (Math.random() * 10);
//slot5 = (int) (Math.random() * 10);
//String slot4s = slot4 + "";
//String slot5s = slot5 + "";
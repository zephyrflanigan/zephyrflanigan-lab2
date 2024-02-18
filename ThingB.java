public class ThingB extends Thing {
    public int timeSinceLast;

    public static void maybeTurn(Thing t) {
        int i = rand.nextInt(3);
        t.timeSinceLast++;

        if (t.timeSinceLast == 10) {
            t.timeSinceLast = 0;

            if (i == 1) {
                rightTurn(t);
            }

            if (i == 2) {
                leftTurn(t);
            }
        }

    }

}
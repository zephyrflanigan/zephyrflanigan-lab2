import java.util.*;
public class TypeB extends Thing {
    public int timeSinceLast;

    public void maybeTurn(Random rand, Thing t) {
        t = new TypeB();
        int i = rand.nextInt(3);
        timeSinceLast++;

        if (timeSinceLast == 10) {
            timeSinceLast = 0;

            if (i == 1) {
                super.rightTurn(t);
            }

            if (i == 2) {
                super.leftTurn(t);
            }
        }

    }

}
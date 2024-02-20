import java.util.*;
public class TypeC extends Thing {

        public int timeSinceLast;

        public void maybeTurn(Random rand, Thing t) {
            t = new TypeC();
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
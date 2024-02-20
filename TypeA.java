import java.util.*;
public class TypeA extends Thing {

    public void maybeTurn(Random rand, Thing t) {
    t = new TypeA();
    int i = rand.nextInt(3);
      if (i == 1) {
        super.rightTurn(t);
      }

      if (i == 2) {
        super.leftTurn(t);
      }
    }
}
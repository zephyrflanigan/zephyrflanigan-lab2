import java.util.*;
public class TypeA extends Thing {

    public void maybeTurn(Random rand) {
    int i = rand.nextInt(3);
      if (i == 1) {
        super.rightTurn();
      }

      if (i == 2) {
        super.leftTurn();
      }
    }
}
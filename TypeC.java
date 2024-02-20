import java.util.*;
public class TypeC extends Thing {

    public void maybeTurn(Random rand, Thing t) {
    //t = new TypeC();
    int i = rand.nextInt(3);
      if (i == 1) {
        super.leftTurn(t);
        super.rightTurn(t);
        super.rightTurn(t);

      }

      if (i == 2) {
        super.leftTurn(t);
        super.rightTurn(t);
        super.leftTurn(t);
      }
    }

}
import java.util.*;
public class TypeC extends Thing {

    public void maybeTurn(Random rand) {
    //t = new TypeC();
    int i = rand.nextInt(5);
      if (i == 1) {
        super.leftTurn();
        row+=10;
      }

      if (i == 2) {
        super.leftTurn();
        row-=10;
      }
      if(i == 3) {
        super.rightTurn();
        row+=10;
      }
         if(i == 4) {
        super.rightTurn();
        row-=10;
      }
    }

}
public class ThingA extends Thing {
    
    public void maybeTurn(Thing t) {
    int i = rand.nextInt(3);
      if (i == 1) {
        rightTurn(t);
      }

      if (i == 2) {
        leftTurn(t);
      }
    }
  }
import java.util.*;
abstract class Thing {
    /**
   * A "Thing" moves in a grid world. A TypeA Thing randomly
   * decides to turn left or right (or not turn) every "round",
   * and, afterward, takes a step forward.  A TypeB Thing
   * only considers making a random turn every 10th round.
   *
   * A STATIC CLASS? OH NO! GET IT OUT OF HERE!
   */

    // dir: 0=North, 1=East, 2=South, 3=West.
    // timeSinceLast: this is only important for "TypeB" Things.
    public Random rand = new Random(System.currentTimeMillis());
    protected int row;
    protected int col;
    protected int dir;
    //public boolean isTypeB;
    protected char lab;

      // EEEEEK! STATIC METHODS!!! PLEASE FIND THEM A BETTER HOME.

    public void rightTurn() {
        dir = (dir + 1) % 4;
    }

    public void leftTurn() {
        dir = (dir + 3) % 4;
    }

    public void step() {
        final int[] dc = {
            0, 1, 0, -1
            }, dr = {
            1, 0, -1, 0
        };
        row += dr[dir];
        col += dc[dir];
    }

    public abstract void maybeTurn(Random rand);



}
import java.util.*;
public class TypeC extends Thing {
  public int timeSinceLast;

    public void maybeTurn(Random rand) {

        int i = rand.nextInt(3);
        timeSinceLast++;
        if (timeSinceLast == 2) {
          if(i == 1) {
            super.rightTurn();
            //super.step();
            row++;
            super.rightTurn();
            //super.step();
            col--;
            super.leftTurn();
            //super.step();
            row++;
            super.rightTurn();
            //super.step();
            col--;
          }

          if(i == 2) {
            super.leftTurn();
            row--;
            super.leftTurn();
            col++;
            super.rightTurn();
            row--;
            super.leftTurn();
            col++;
           

        }

        timeSinceLast = 0;
        } 


          
        }
  
  }

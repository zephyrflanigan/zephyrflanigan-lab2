import java.util.*;

public class DotChaser {
  

  /**
   * This static method is ok :)
   */
  public static void main(String[] args) {
    ThingList list = new ThingList();
    Random rand = new Random(System.currentTimeMillis());

    // INSTEAD OF A NODE, CREATE SOMETHING MORE USER-FRIENDLY.
    //Node L = null;
    //int count = 0;
      int N = 300;
      if( args.length != 0 )
        N = Integer.parseInt(args[0]);
      int count = 0;
        while(true) {
          if(count % N == 0) {
            list.addAll();
            count++;
          }
          list.printAll();
          list.moveAll(rand);
        
        }
    //list.addAll(args);
    //list.printAll();
    //list.moveAll(rand);
    /*while( true ) {
      // Every N rounds, add another typeA and typeB Thing.
      if( count % N == 0 ) {

        // Add a typeA thing to the list.
        // (GEE, THAT'S A LOT OF CODE FOR JUST CREATING ONE THING)
        Thing tA = new Thing();
        tA.row = 45;
        tA.col = 50;
        Node nA = new Node();
        nA.data = tA;
        nA.next = L;
        L       = nA;

        // Add a typeB thing to the list
        Thing tB = new Thing();
        tB.row     = 55;
        tB.col     = 50;
        tB.lab     = 'b';
        tB.isTypeB = true;
        Node nB = new Node();
        nB.data = tB;
        nB.next = L;
        L       = nB;
      }

      // Print out each thing.
      // (SEEMS LIKE A NICE PRINTALL() METHOD CALL WOULD WORK HERE)
      // (SEEMS LIKE A toString() METHOD IN THE CLASS WOULD ALSO BE NICE)
      for( Node T = L; T != null; T = T.next )
        System.out.println(T.data.row + " " + T.data.col + " " + T.data.lab);

      System.out.println("done");
      System.out.flush();

      // Move each thing.
      // (SEEMS LIKE A NICE MOVEALL() METHOD CALL WOULD WORK HERE)
      for( Node T = L; T != null; T = T.next ) {
        maybeTurn(T.data);
        step(T.data);
      }
      count++;
    } */
  }
}

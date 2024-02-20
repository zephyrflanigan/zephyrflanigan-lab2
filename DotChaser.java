import java.util.*;

public class DotChaser {
  

  /**
   * This static method is ok :)
   */
  public static void main(String[] args) {
    ThingList list = new ThingList();
    Random rand = new Random(System.currentTimeMillis());


      int N = 200;
      if( args.length != 0 )
        N = Integer.parseInt(args[0]);
      int count = 0;
        while(true) {
          if(count % N == 0) {
            list.addAll();
            
          }
          list.printAll();
          list.moveAll(rand);
          count++;
        }
   
  }
}

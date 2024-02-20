import java.util.*;
public class ThingList{
      /**
   * YOU'LL NEED TO PUT THIS SOMEWHERE ELSE
   * HINT: WOULDN'T IT BE NICE TO HAVE A LIST OR QUEUE SO THAT
   *       WE DON'T HAVE TO USE NODES HERE?
   * This class is for linked lists of Thing's
   */
    private class Node {
        private Thing data;
        private Node  next;

        private Node(Thing thing) {
            this.data = thing;
            this.next = null;
        }
    }

    private Node head;

    //polymorphism: THING can be called as ThingA or ThingB
    //ex. Thing myThing = new ThingA();

    private void addThing(Thing t) {
        if (head == null) {
            head = new Node(t);
            if(t instanceof TypeA) {
                head.data = new TypeA();
                head.data.row = 45;
                head.data.col = 50;
                head.data.lab = 'r';
            } else if (t instanceof TypeB) {
                head.data = new TypeB();
                head.data.row = 55;
                head.data.col = 50;
                head.data.lab = 'b';
            }
            else if (t instanceof TypeC) {
                head.data = new TypeC();
                head.data.row = 65;
                head.data.col = 50;
                head.data.lab = 'y';
            }
        }
        for(Node T = head; T != null; T = T.next) {
            //System.out.println("hj");
            T = new Node(t);
                if(t instanceof TypeA) {
                head.data = new TypeA();
                head.data.row = 45;
                head.data.col = 50;
                head.data.lab = 'r';
            } else if (t instanceof TypeB) {
                head.data = new TypeB();
                head.data.row = 55;
                head.data.col = 50;
                head.data.lab = 'b';
            }
            else if (t instanceof TypeC) {
                head.data = new TypeC();
                head.data.row = 65;
                head.data.col = 50;
                head.data.lab = 'y';
            }
        }
            Node temp = head.next;
            while(temp.next != null) {
                temp = temp.next;
                //System.out.println("j");
            }
            temp = new Node(t);
               if(t instanceof TypeA) {
                temp.data = new TypeA();
                temp.data.row = 45;
                temp.data.col = 50;
                temp.data.lab = 'r';
            } else if (t instanceof TypeB) {
                temp.data = new TypeB();
                temp.data.row = 55;
                temp.data.col = 50;
                temp.data.lab = 'b';
            }
            else if (t instanceof TypeC) {
                temp.data = new TypeC();
                temp.data.row = 65;
                temp.data.col = 50;
                temp.data.lab = 'y';
            }
         

    }
    
    private String toString(Node T) {
        return (T.data.row + " " + T.data.col + " " + T.data.lab);
    }

    //lets DotChaser implement row and col for thing a or thing b
    public void addAll() {

        TypeA tA = new TypeA();
        addThing(tA);
        TypeB tB = new TypeB();
        addThing(tB);
        TypeC tC = new TypeC();
        addThing(tC);

    }
    
    public void moveAll(Random r) {
        Node temp = head;
        while(temp.next != null) {
            temp.data.maybeTurn(r, temp.data);
            temp.data.step(temp.data);
            temp = temp.next;
        }

    }

    public void printAll() {
        for(Node T = head; T != null; T = T.next) {
            System.out.println(toString(T));
        }
       System.out.println("done");


        /*while(temp.next != null) {
            System.out.println(toString(temp));
            System.out.println("done");
            temp = temp.next;        
        }*/
        System.out.flush();
    }

    
}
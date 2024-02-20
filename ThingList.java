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

    public void addThing(Thing t) {
        if (head == null) {
            head = new Node(t);
            if(t instanceof TypeA) {
                head.data.row = 45;
                head.data.col = 50;
                head.data.lab = 'r';
            } else if (t instanceof TypeB) {
                head.data.row = 55;
                head.data.col = 50;
                head.data.lab = 'b';
            }
            else if (t instanceof TypeC) {
                head.data.row = 50;
                head.data.col = 50;
                head.data.lab = 'y';
            }
        } else {
            Node temp = head;
            Node nextThing = new Node(t);
             while(temp.next != null) {
                temp = temp.next;
            }
            temp.next = nextThing;
            if(t instanceof TypeA) {
                nextThing.data.row = 45;
                nextThing.data.col = 50;
                nextThing.data.lab = 'r';
            } else if (t instanceof TypeB) {
                nextThing.data.row = 55;
                nextThing.data.col = 50;
                nextThing.data.lab = 'b';
            }
            else if (t instanceof TypeC) {
                nextThing.data.row = 50;
                nextThing.data.col = 50;
                nextThing.data.lab = 'y';
            }
        }
    
    }
    
    private String toString(Node T) {
        return (T.data.row + " " + T.data.col + " " + T.data.lab);
    }

    //lets DotChaser implement row and col for thing a or thing b
    public void addAll() {

        TypeA tA = new TypeA();
        TypeB tB = new TypeB();
        TypeC tC = new TypeC();
       
        addThing(tA);
        addThing(tB);
        addThing(tC);
     
    }
    
    public void moveAll(Random r) {
        //Node temp = head;
        for(Node T = head; T != null; T = T.next) {
            T.data.maybeTurn(r);
            T.data.step();
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
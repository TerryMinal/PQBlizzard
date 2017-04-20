/*
Terry Guan
APCS2 PD3
HW#32: ArrayPriorityQueue
2017-04-20
*/
import java.util.*;

public class ArrayPriorityQueue implements PriorityQueue {

  private ArrayList<Ticket> data;

  public ArrayPriorityQueue() {
    data = new ArrayList<Ticket>();
  }

  // Traverses through the whole list and adding to the spot proper spot in its priority rating
  public void add(Ticket d) {
    for (int i = 0; i < data.size(); i++) {
      if (d.compareTo(data.get(i)) >= 0) {
        data.add(i, d);
        return;
      }
    }
    data.add(d);
  } //O(n)

  //checks the end of the ArrayList
  public Ticket peekMin() {
    return data.get(data.size() - 1);
  } //O(1)

  // removes from the back of the ArrayList
  public Ticket removeMin() {
    Ticket ret = peekMin();
    data.remove(data.size() - 1);
    return ret;
  } //O(1)


  public boolean isEmpty() {
    return data.size() == 0;
  } //O(1)

  public int size() {
    return data.size();
  } //O(1)

  public String toString() {
    String ret = "[";
    for (Ticket x : data) {
      ret += x.getCaseNum() + ", ";
    }
    ret += "]";
    return ret;
  } //O(n)

  public static void main(String[] args) {
    ArrayPriorityQueue mwah = new ArrayPriorityQueue();
    for (int i = 0; i <= 20; i++) {
      Ticket as = new Ticket("data" + i, "I failed to pass my APs", i, (int)(Math.random() * 5), (int)(Math.random() * 10));
      System.out.println(as);
      mwah.add(as);
    }
    System.out.println(mwah);
    System.out.println("checking removing");
    int siz = mwah.size();
    for (int i = 0; i < siz; i++) {
      System.out.print(mwah.removeMin() + " ");
    }
    System.out.println();
    //checks if anything still exists in the arrayList
    System.out.println(mwah);
  } //end of main

} //end of ArrayPriorityQueue

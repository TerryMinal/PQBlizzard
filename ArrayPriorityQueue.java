import java.util.*;

public class ArrayPriorityQueue<T extends Comparable<T>> implements PriorityQueue{

  private ArrayList<T> _data;

  public ArrayPriorityQueue() {
    _data = new ArrayList<T>();
  }


  // Traverses through the whole list and adding to the spot proper spot in its priority rating
  public void add(Object d) {
    for (int i = 0; i < _data.size(); i++) {
      if (((T)d).compareTo(_data.get(i)) >= 0) {
        _data.add(i, (T) d);
        return;
      }
    }
    _data.add((T)d);
  } //O(n)

  //checks the end of the ArrayList
  public T peekMin() {
    return _data.get(_data.size() - 1);
  } //O(1)

  // removes from the back of the ArrayList
  public T removeMin() {
    T ret = peekMin();
    _data.remove(_data.size() - 1);
    return ret;
  } //O(1)


  public boolean isEmpty() {
    return _data.size() == 0;
  } //O(1)

  public int size() {
    return _data.size();
  } //O(1)

  public String toString() {
    String ret = "[";
    for (T x : _data) {
      ret += x.toString() + ", ";
    }
    ret += "]";
    return ret;
  } //O(n)

  public static void main(String[] args) {
    ArrayPriorityQueue<Ticket> mwah = new ArrayPriorityQueue<Ticket>();
    for (int i = 0; i <= 20; i++) {
      Ticket as = new Ticket("data" + i, "I failed to pass my APs", i, (int)(Math.random() * 5), (int)(Math.random() * 10), "N/A");
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

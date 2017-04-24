import java.util.*;
import java.io.*;
public class HelpDesk{
  private ArrayPriorityQueue line;
  private int _ticketID;

  private HelpDesk() {
    line = new ArrayPriorityQueue();
    _ticketID = 0;
  }

  public int getNewID(){
    return _ticketID;
  }

  public void addTicket(){
    System.out.println("Welcome to our help desk!");

    System.out.println("Please enter your name: ");
    String name = Keyboard.readString();

    System.out.println("\nWhat is the problem? ");
    String descrip = Keyboard.readString();

    System.out.println("Lastly, what is your pay grade? (Please enter a non-negative integer)"); //change?
    int priority = Keyboard.readInt();
    while(priority < 0){
      System.out.println("Please enter a valid non-negative integer");
      priority = Keyboard.readInt();
    }

    System.out.println("Your case number is " + _ticketID + ".\nThanks for choosing us.");

    Ticket newTicket = new Ticket(name, descrip, _ticketID, 0, priority, null);
    line.add(newTicket);
    _ticketID++;
  }

  public static void main(String[] args){

    //get int counter for id number from APQ
    //build ticket and add to APQ
    HelpDesk Google = new HelpDesk();
    for (int i = 0; i < 5; i++)
      Google.addTicket();
    System.out.println(Google.line);
  }
}

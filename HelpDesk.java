import java.util.*;
import java.io.*;
public class HelpDesk{
    private ArrayPriorityQueue _line;
    private int _ticketID;

    private HelpDesk() {
	_line = new ArrayPriorityQueue();
	_ticketID = 0;
    }

    public int getNewID(){
	return _ticketID;
    }

    public String getTicketToString(){
	_line.peekMin()
    }
    
    public void updateTicket(){
	
    }

    public void MarkTicketAsSolved(){

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
	_line.add(newTicket);
	_ticketID++;
    }

    public static void main(String[] args){
	//test code
	/*
	//get int counter for id number from APQ
	//build ticket and add to APQ
	HelpDesk Google = new HelpDesk();
	for (int i = 0; i < 5; i++)
	    Google.addTicket();
	System.out.println(Google.line);
	*/

	/*===================================================
	  ----------------MAKING MORE AWESOME----------------
	  ===================================================*/
	HelpDesk CallCenter = new HelpDesk();

	while(true){
	    System.out.println("What are you here for on this pleasant day?\n1 Submit a ticket\n2 Check my ticket\n3 Resolve a ticket");
	    int task = Keyboard.readInt();
	    while(true){
		if(task == 1){
		    CallCenter.addTicket();
		    break;
		} else if (task == 3) {
		    int resolveAnother = 1;
		    while (resolveAnother != 1 || resolveAnother != 2){
			System.out.println("please enter an accepted integer value.\n1 Yes\n No");
		    }
		    if (resolveAnother == 1){
			//resolve here
		    } else {
			break;
		    }
		} else { //entered a non-accepted value
		    System.out.println("please enter an accepted integer value.\n1 Submit\n2 Resolve");
		    task = Keyboard.readInt();
		}
	    }
		
	}
    }
}

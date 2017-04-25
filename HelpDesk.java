/*To do: (in order of priority)
  1. Line 50
      Make a place for unresolvable and resolved tickets to go to in the afterlife so the customer may hear of the tales they have to tell.

  2. Line 105
      Cannot view tickets. Implement "To do #1", then print toString() of ticket.

  3. Line 116
      Will not print current description of ticket along with relevant info.

  3. Line 65
      Change the printed message, I am still too braindead at the moment...
 */

import java.util.*;
import java.io.*;
public class HelpDesk{
    private ArrayPriorityQueue<Ticket> _line;
    private int _ticketID;

    private HelpDesk() {
	_line = new ArrayPriorityQueue();
	_ticketID = 0;
    }

    public int getNewID(){
	return _ticketID;
    }

    public String getTicketToString(){
	return _line.peekMin().toString();
    }
    
    public void updateTicket(){
	Ticket ticket = _line.peekMin();
	ticket.setStatus(1); //no matter what happens, work has begun on ticket.
	ticket.toString();
	if (ticket.getSolution() == null){
	    System.out.println("There were no previous posted solutions. Please write a solution.");
	    ticket.setSolution(Keyboard.readString());
	} else {
	    System.out.println("Here is the previous posted solution. Do you want to update it?\n1 Yes\n2 No");
	    int input = Keyboard.readInt();
	    while(input != 1 && input != 2){
		System.out.println("Please enter a valid non-negative integer");
		input = Keyboard.readInt();
	    }
	    if(input == 1){
		System.out.println("Please write a solution.");
		ticket.setSolution(Keyboard.readString());
	    }
	}
	System.out.println("What is the status on the issue?\n1 Work in progress\n2 Issue resolved\n3 Issue unresolvable");
	int input = Keyboard.readInt();
	while(input != 1 && input != 2 && input != 3){
	    System.out.println("Please enter a valid non-negative integer");
	    input = Keyboard.readInt();
	}
	ticket.setStatus(input);
	if (input == 2 || input == 3){
	    _line.removeMin(); //WHOEVER SEES THIS, DO SOMETHING WITH THIS
	}
    }

    public void addTicket(){
	System.out.println("Welcome to our help desk!");

	System.out.println("Please enter your name: ");
	String name = Keyboard.readString();

	System.out.println("\nWhat is the problem? ");
	String descrip = Keyboard.readString();

	System.out.println("Lastly, what is your pay grade? (Please enter a non-negative integer)"); //change? smh... no one reads my comments
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
		} else if (task == 2){
		    //retrieve ticket by ID and display toString
		} else if (task == 3) {
		    int resolveAnother = 1;
		    while (resolveAnother != 1 && resolveAnother != 2){
			System.out.println("Will you resolve another ticket?\n1 Yes\n No");
		    }
		    if (resolveAnother == 1){
			CallCenter.getTicketToString();
			CallCenter.updateTicket();
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

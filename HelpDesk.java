public class HelpDesk{
    private ArrayPriorityList line;
    
    public void askBasicInfo(){
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

	int caseNum = line.getNewID();	
	System.out.println("Your case number is " + caseNum + ".\nThanks for choosing us.");
	
	Ticket newTicket = new Ticket(name, descrip, caseNum, 0, priority, null);
    }
    
    public static void main(String[] args){
	
	//get int counter for id number from APQ
	//build ticket and add to APQ
	
    }
}

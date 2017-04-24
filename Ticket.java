//ticket class for storing priority and data
public class Ticket implements Comparable<Ticket>{

  //the higher the number the greater the priority
  private String name;
  private String descrip; // description of the issue
  private int caseNum;
  private int status; //0 = Request sent to helpDesk 1 = Request has begun on resolving issue 2 = Issue is almost done 3 = Issue resolved 4 = Issue unresolvable
  private int priority;
  private String solution; // description of the solution if any

  public Ticket(String name, String descrip, int caseNum, int status, int priority, String solution) {
    this.name = name;
    this.descrip = descrip;
    this.caseNum = caseNum;
    this.status = status;
    this.priority = priority;
    this.solution = solution;
  }

  public int compareTo(Ticket t) {
    int p = this.priority;
    int p2 = t.priority;
    if (p == p2)
      return 0;
    else if (p < p2)
      return -1;
    else
      return 1;
  }

  // ------- ACESSOR METHODS -------
  public String getName() {
    return name;
  }

  public String getDescrip() {
    return descrip;
  }

  public int getCaseNum() {
    return caseNum;
  }

  public int getStatus() {
    return status;
  }

  public int getPriority() {
    return priority;
  }

  public String getSolution() {
    return solution;
  }

  // ------ MUTATOR METHODS ------
  public String setName(String newName) {
    String oldName = name;
    name = newName;
    return oldName;
  }

  public String setDescrip(String newDescrip) {
    String oldDescrip = descrip;
    descrip = newDescrip;
    return oldDescrip;
  }

  public int setCaseNum(int newCaseNum) {
    int oldCaseNum = caseNum;
    caseNum = newCaseNum;
    return oldCaseNum;
  }

  public int setStatus(int newStatus) {
    int oldStatus = status;
    status = newStatus;
    return oldStatus;
  }


  public int setPriority(int newP) {
    int oldP = priority;
    priority = newP;
    return oldP;
  }

  public String setSolution(String newSolution) {
    String oldSol = solution;
    solution = newSolution;
    return oldSol;
  }

  public String toString() {
    return "priority: " + priority + " case#: " + caseNum;
  }
} //end of Pdata class

# PQBlizzard
#### Terry Guan, Lisa Eng, Yuanchu Liu


### Design
  The ArrayPriorityQueue class uses Ticket as a data carrier: the Ticket contains all the data a user would enter and a priority number.
The ArrayPriorityQueue is generically typed to allow any types that implement the Comparable interface (Ticket implements Comparable). The ArrayPriorityQueue
uses the priority as a means of comparison allowing Ticket to carry any data necessary since the data does not affect the actual comparison of the Tickets. The ArrayPriorityQueue
is simply an ArrayList of all the Tickets sorted in reverse order with the highest priority (priority = 0) at the end and the lowest priority (10)
at the end. We sorted the Tickets as they are added into the ArrayList; the add method traverses through the whole list and finds its correct position--it runs in linear time. Since
the highest priority is guaranteed to be in the last position of the ArrayList, peakMin() and removeMin() both run in constant time. The isEmpty() method is a basic check for whether the
size of the ArrayList is 0 or not. The size() method returns the size of the ArrayList. 

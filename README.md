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

### Extras
The Ticket class had to carry many variables to create a helpDesk: name, description, case number, priority, and solution. Given the difficulty of having a computer understand solve
general problems the helpDesk class did not determine priority or create a solution based on inputed data-- it simply took data and stored it in an ArrayPriorityQueue. The ArrayPriorityQueue
is generically typed to use only types that implement the Comparable interface which has both its pros and cons. Since it forces the type to implement the Comparable interface there is a guarantee
that the type has a compareTo method which allows for easy comparison and determination of priority. However, this limits the types it can take. In addition, the Ticket class also has to implement
Comparable<Ticket>. Something cool we learned is that Comparable<Ticket> allows for an interface that will be type specific to Ticket. 

package collection_1_may;

import java.util.PriorityQueue;
import java.util.Queue;
//PriorityQueue doesnot follow fifo 
// arrange data in natural order then process 
// priority quweu doesnot work opn different data 
public class PriorityQueueExample {

	public static void main(String[] args) {
		   
		
		       //11 12 13 14 30 43 120
		       // Queue <Integer> r= new PriorityQueue<Integer>();//here r can access List and queue both methods 
		        Queue  r= new PriorityQueue();
				r.add(120); //this is top element and will be removed first 
				r.add(30 );
				r.add(22);
				r.add(55);
				r.add(66);
				r.add(74);
				//r.add(null); not allowed in priority queue 
		 
				System.out.println(r.remove(74));//return type boolean  r.remove(object to be removed) 
				
				
				System.out.println(r.remove());//return type object 
			}

		}

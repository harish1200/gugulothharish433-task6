
package set.Collections;

import java.util.Iterator;
import java.util.LinkedList;

public class Linked{
   public static void main(String args[]){

     LinkedList<String> list=new LinkedList<String>();

     //Adding elements to the Linked list
     list.add("jagadish");
     list.add("satish");
     list.add("arun");
     list.add("srikanth");
     list.add("sai");
     list.add("ashok");
     list.add("naveen");
     list.add("charan");
     list.add("pranay");
     list.add("santhosh");
     list.add("kalyan");
     list.add(11,"devendar");
 
     System.out.println(list);
    
     //using index print value
     System.out.println("LinkedList Elements :");
     int i = 0;
	while (list.size() > i) {
   	  System.out.println(list.get(i));
   	  i++;
         }
	
     
  //Adding an element to the first position
     list.addFirst("nikhil");
     
     //Adding an element using position
    list.add(2, "jaju");
     list.add(5, "vilash");
   
//removing an element
     list.remove("santhosh"); 
     list.remove("ashok");  
     list.remove("pranay");  
  
     //adding
     list.add(11,"ilesh");
     list.add("jaswanth");
     System.out.println(list);
     
     //adding
     list.add(1,"sai charan");
     list.add(5,"vikranth");
     list.add(7,"rahul LE");
     list.add(9,"Subhash");
     System.out.println(list);
     //removing
     list.remove("charan"); 
     list.remove("arun");  
     list.remove("satish");  
     
     System.out.println(list);
     Iterator<String> iterator=list.iterator();
     while(iterator.hasNext()){
       System.out.println(iterator.next());
         }
   } 
}

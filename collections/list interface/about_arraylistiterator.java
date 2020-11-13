import java.util.*;
class about_arraylistiterator{
	public static void main(String args[]){
	List<Integer> list=new ArrayList<Integer>();
	list.add(10);
	list.add(20);
	list.add(30);
	list.add(40);
	list.add(50);
	list.add(60);
	ListIterator lit=list.listIterator();
	System.out.println("In actual order :");  
          while (lit.hasNext()) {  
                System.out.println(lit.next());  
            }  
          System.out.println("In reverse order :");  
            
          while (lit.hasPrevious()) {  
                System.out.println(""+lit.previous());  
         }  
		  lit.next();
		  System.out.println("The Index is given as : " + lit.nextIndex());
			lit.next();  	
			lit.next();
			lit.next();
	System.out.println("The second Index is given as : " + lit.previousIndex());
	System.out.println("The second Index is given as : " + lit.nextIndex());
	System.out.println(lit.previousIndex());

	
        					
           
}
}
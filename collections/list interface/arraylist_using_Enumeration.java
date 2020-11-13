import java.util.*;
class arraylist_using_Enumeration{
	public static void main(String args[]){
		ArrayList<Integer> list=new ArrayList<Integer>();
		list.add(63);
		list.add(68);
		list.add(71);
		list.add(73);
		list.add(83);
		 Enumeration<Integer> e = Collections.enumeration(list); 
	}
}
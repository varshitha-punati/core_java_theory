import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
class about_arraylistinterface{
	public static void main(String args[]){
		List<String> list=new ArrayList<String>();
		list.add("varshi");
		list.add("yashu");
		list.add("harish");
		list.add("ishu");
		list.add("dharu");
		list.add("lakshmi");
		System.out.println(list);
	Iterator <String> it=list.iterator();
	String s ="";
	while(it.hasNext()) {
		
	s=(String)it.next();
		
		if(s.equals("yashu")){
			it.remove();
    }
	}
				System.out.println("after remove method : ");

			System.out.println(list);

	}

}
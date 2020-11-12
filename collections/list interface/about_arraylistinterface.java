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
	while(it.hasNext()) {
		System.out.println(it.next());
    }
	it.remove();
	System.out.println(it);
}
}
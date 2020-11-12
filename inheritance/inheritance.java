class parent{
	 public void method1(){
		System.out.println("method1 in parent class");
	}
}
 class child extends parent{
	 public void method2(){
		System.out.println("method2 in child class");
	}
}
 public class inheritance{
	public static void main(String args[]){
		//object creation for parent class
		parent obj=new parent();
		//method calling
		obj.method1();
		//child obj1=new child();
		//obj1.method2();
	}
}
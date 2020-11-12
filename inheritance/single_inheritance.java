//single inheritance:one parent clas-->one child class
class parent{
	public void method1()
	{
		System.out.println("Method1 in parent class");
	}
}
class child extends parent{
	public void method2()
	{
		System.out.println("method2 in child class");
	}
}
class single_inheritance{
	public static void main(String args[]){
		//1.parent class object creation
		//parent obj=new parent();
		//obj.method1();
		//obj.method2();//we can acess only parent class method from this parent class object creation
		
		
		
		//2.child class object creation
		child obj=new child();
		obj.method1();
		obj.method2();//from child class object we can acess child and parent class members
		
		
		//3.child class object with parent class reference
		//parent obj=new child();
		//obj.method1();
		//obj.method2();//we can acess only parent class method from this parent class reference and child class object
		
		
		//4.parent class object with child class reference
		//child obj=new parent();
		//obj.method1();
		//obj.method2();//It is not acessiable it raises incompatiable error
		
	}
}

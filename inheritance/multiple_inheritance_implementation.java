//By using interface we can implement the more than one parent properties to child
interface parent1{
	default void method1(){
		System.out.println("parent1 class method");
	}
}
interface parent2{
	 default void method2(){
		System.out.println("parent2 class method");
	}
}
class child implements parent1,parent2{
	public void method3(){
		System.out.println("child class method");
	}
}
class multiple_inheritance_implementation{
	public static void main(String args[]){
		 //child obj=new child();
		 //obj.method1();
		 //object creations
		 //parent1 obj=new child();
		 //obj.method1();
		 
		 //object reference 2
		 parent2 obj=new child();
		 obj.method2();
	}
}
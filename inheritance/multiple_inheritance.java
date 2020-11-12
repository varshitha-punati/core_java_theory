//In mulitple inhertiance class does not support for it
//It raises an syntax error
//so interfaces are introduced
class parent1{
	public void method1(){
		System.out.println("parent1 class method");
	}
}
class parent2{
	public void method2(){
		System.out.println("parent2 class method");
	}
}
class child extends parent1, parent2{
	public void method3(){
		System.out.println("parent2 class method");
	}
}
class mulitple_inheritance{
	public static void main(){
		 child obj=new child();
		 obj.method1();
	}
}
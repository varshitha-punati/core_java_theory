class A {
     public void method1()
    {
        System.out.println(" method1 of ClassA");
    }
}
 interface B{
	default void method2()
    {
        System.out.println("interface method2 implementation in interfaceB");
    }
}
interface C{
	default void method3()
    {
        System.out.println("interface method3 implementation in interfaceC");
    }
}
 class D extends A implements B,C{
   public void method4()
    {
        System.out.println("method 4");
    }
}
class hybrid_inheritance{
	public static void main(String args[])
    {
		//object creation
        D obj = new D();
        obj.method2();
		obj.method4();
		obj.method3();
		obj.method1();
    }
}
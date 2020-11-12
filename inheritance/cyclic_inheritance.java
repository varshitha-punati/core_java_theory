/*
In Java, cyclic inheritance is not allowed if a class, be it inner or outer, attempts to inherits from itself. 
Cyclic inheritance is absurd conceptually because it implies that a class is its superclass and subclass at the same time
a->a
a->b,b->a
It is not supported in java
*/


class A
{
   public void method1()
   {
     System.out.println("Class A method");
   }
}
Class B extends C
{
public void method2()
{
System.out.println("class B method");
}
}
Class C extends A
{
   default void method3()
   {
     System.out.println("class C method");
   }  
}
class cyclic_inheritance{
	public static void main(String args[])
   {
     C obj = new C();
     obj.method1(); 
     obj.method2();
     obj.method3(); 
  }
}
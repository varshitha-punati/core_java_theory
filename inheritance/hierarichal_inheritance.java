/*When more than one classes inherit a same class then this is called hierarchical inheritance. 
For example class B, C and D extends a same class A.*/
class A
{
   public void method1()
   {
      System.out.println("method of Class A");
   }
}
class B extends A
{
   public void method2()
   {
      System.out.println("method of Class B");
   }
}
class C extends A
{
  public void method3()
  {
     System.out.println("method of Class C");
  }
}
class D extends A
{
  public void method4()
  {
     System.out.println("method of Class D");
  }
}
class hierarichal_inheritance
{
  public static void main(String args[])
  {
     B obj1 = new B();
     C obj2 = new C();
     D obj3 = new D();
     //All classes can access the method of class A
     obj1.method1();
     obj2.method1();
     obj3.method1();
  }
}
/*In multilevel inheritance
a->b//b has its own properties and properties of a also
a->b->c //c has it own properties and properties of a and b also
*/
class X{
    void method1()
   {
     System.out.println("Class X method");
   }
}
class Y extends X{
 void method2()
{
System.out.println("class Y method");
}
}
class Z extends Y{
    void method3()
   {
     System.out.println("class Z method");
   }  
}
class multilevel_inheritance{
	public static void main(String args[])
   {
     Z obj = new Z();
     obj.method1(); //calling grand parent class method
     obj.method2(); //calling parent class method
     obj.method3(); //calling local method
  }
}
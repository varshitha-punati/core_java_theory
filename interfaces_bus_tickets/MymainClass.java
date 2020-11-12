package bus_tickets;
interface First{
  public void method1(); // interface method
}

interface Second {
  public void method2(); // interface method
}

class DemoClass implements First, Second {
  public void method1() {
    System.out.println("method 1");
  }
  public void method2() {
    System.out.println("method 2");
  }
}

class MymainClass {
  public static void main(String[] args) {
    DemoClass myObj = new DemoClass();
    myObj.method1();
    myObj.method2();
  }
}
//A class cannot have two methods with same signature
 //we try to declare two methods with same signature you will get a compile time error.
public class MethodSignature1 {
   public int add(int a, int b){
      int c = a+b;
      return c;
   }
   public double show(int a, int b){
      double c = a+b;
	  System.out.println(c);
      return c;
   }
   public static void main(String args[]){
      MethodSignature1 obj = new MethodSignature1();
      int result = obj.add(56, 34);
	  obj.show(56,34);
      System.out.println(result);
   }
}
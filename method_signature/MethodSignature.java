//method signature is nothing but having method and its parmeters is known as method Signature
public class MethodSignature {
   public int add(int a, int b){//Here we declared return type as int
      int c = a+b;
      return c;
	 // so we should declare the return otherwise it throws an error
   }
   public static void main(String args[]){
      MethodSignature obj = new MethodSignature();
      int result = obj.add(56, 34);
      System.out.println(result);
   }
}
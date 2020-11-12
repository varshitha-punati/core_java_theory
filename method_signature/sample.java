/* The signature of a method is:
Its name.
The number and types of its parameters, in order.

The signatures of the methods in a class must be unique. For example, the signatures of the two processDeposit methods are:
processDeposit( int )
processDeposit( int, int )

The names of the parameters are not part of the signature because parameter names are not visible outside of their scope.
The return type is not part of the signature. The visibility modifier is not part of the signature.*/


public class sample {
   public void add(int a, int b){
      int c = a+b;
	  System.out.println(c);
   }
   public void show(int a, int b){
      double c = a+b;
	  System.out.println(c); 
   }
   public static void main(String args[]){
      sample obj = new sample();
      obj.add(56, 34);
	  obj.show(56, 34);
   }
}
//If a class has multiple methods having same name but different in parameters, it is known as Method Overloading.
class Methodoverloading {
    public static void display(int a){
        System.out.println("Arguments: " + a);
    }

    public static void display(int a, int b){
        System.out.println("Arguments: " + a + " and " + b);
    }

    public static void main(String[] args) {
		Methodoverloading obj=new Methodoverloading();
        obj.display(1);
        obj.display(1, 4);
    }
}

class methodsample {
    public static void display(int a){
        System.out.println("integer type");
    }
    public static void display(int a, int b){
        System.out.println("method with 2 parameters");
    }
    public static void main(String[] args) {
		methodsample obj=new methodsample();
        obj.display(1);
        obj.display(1,4);
    }
}
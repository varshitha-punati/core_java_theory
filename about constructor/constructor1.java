class constructor1{
	constructor1(){
		System.out.println("constructor");
	}
	
	constructor1(int a){
		System.out.println("passing integer value");
	}
	public static void main(String args[]){
		constructor1 obj=new constructor1();
		constructor1 obj1=new constructor1(2);
	}
}
	
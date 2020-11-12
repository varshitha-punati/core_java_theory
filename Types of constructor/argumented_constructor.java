class argumented_constructor{
	int a;
	int b;
	public argumented_constructor(){
		System.out.println("constructor with no arguments");
		this.a=12;
		this.b=15;
	}
	public argumented_constructor(int a,int b){
		System.out.println("constructor with arguments");
		
	}
	public static void main(String args[])
	{
		argumented_constructor obj=new argumented_constructor();
		System.out.println(obj.a);
		System.out.println(obj.b);
		
		argumented_constructor obj1=new argumented_constructor(1,2);
		System.out.println(obj1.a);
		System.out.println(obj1.b);
	}
		
}

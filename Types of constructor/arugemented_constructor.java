class argumented_Constructor{
	int a;
	int b;
	public argumented_Constructor(){
		System.out.println("constructor with no arguments");
		this.a=12;
		this.b=15;
	}
	public argumented_Constructor(int a1,int b1){
		System.out.println("constructor with arguments");
		this.a=a1;
		this.b=b1;
	}
	public static void main(String args[])
	{
		argumented_Constructor obj=new argumented_Constructor();
		argumented_Constructor obj1=new argumented_Constructor(int a,int b);
	}
		
}

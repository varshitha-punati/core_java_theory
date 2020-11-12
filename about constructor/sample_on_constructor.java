class sample_on_constructor{
	int a;
	int b;
	sample_on_constructor(){
		System.out.println(a);
	}
	void method(){
		System.out.println("void method");
	}
	public static void main(String args[])
	{
		sample_on_constructor obj=new sample_on_constructor();
		obj.method();
	}
}

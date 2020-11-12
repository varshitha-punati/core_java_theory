class autoconversion {

    public void display(int a){
        System.out.println("Integer data.");
    }

	public  void display(float b){
        System.out.println("floating data");
    }
	public void display(short c){
        System.out.println("short data.");
    }

    public void display(long d){
        System.out.println("floating data");
    }

    public static void main(String[] args) {
		autoconversion obj=new autoconversion();
        obj.display(1);
        obj.display(1);
		obj.display(1.1f);
		obj.display('c');
    }
}
package Student_Performance;

class student_percentage{
	public static void main(String args[]){
		
		//object creation
		student_percentage check=new student_percentage();
		
		//method calling
		check.percentage();
		check.calculate();
	}
	public static void percentage(){
		System.out.println("enter the percentage");
	}
	public static void calculate(){
		System.out.println("percenatge obtained is 80%");
	}
}

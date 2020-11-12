package Student_Ranking;
import Student_Performance.student_percentage;
class student_rank{
	public static void main(String args[]){
		//object creation
		student_rank test=new student_rank();
		//method calling
		test.rank();
		student_percentage use=new student_percentage();

		use.calculate();
	}
	public static void rank(){
		System.out.println("rank is obtained");
		System.out.println("rank1 is obtained");

	}
}
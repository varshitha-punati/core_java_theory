package Student_Ranking;
import java.util.Scanner;
class even_odd_ranking{
	public static void main(String args[]){
		//object creation
		even_odd_ranking test=new even_odd_ranking();
		//method calling
		test.input();
	}
	public void input(){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter ranking");
		int number=sc.nextInt();
		check(number);
	}
	void check(int number){
			if(number%2==0){
				System.out.println("even number ranking");
			}
			else{
				System.out.println("odd number ranking");
			}
		
	}
}


//Insertion and to rearrnge the order in array is not possible
//so to overcome this collection frmae work is introduced
class student{
	String name;
	int Rollno;
	student(String n,int n1){
		name=n;
		Rollno=n1;
	}
}
class about_collections{
public static void main(String args[]){
	//here we created objected and stored in array because we want store in 20 variables 
	//It becames program complexity 
	//These are 5 objects for student
	 student s1=new student("varshi",573);
	 student s2=new student("tulasi",561);
	 student s3=new student("nagurbe",567);
	 student s4=new student("geeta",562);
	 student s5=new student("gowthami",590);
	 
	 //storing objects into student array
	 student students[]=new student[5];
	 students[0]=s1;
	 students[1]=s2;
	 students[2]=s3;
	 students[3]=s4;
	 students[4]=s5;
	 
	 //retrieve the data
	 for(int i=0;i<students.length;i++){
		 System.out.println(students[i].name+"\t\t\t"+students[i].Rollno);
	}
	//student s=new student[students.length];
	//student s=students.clone();
	for(int i=0;i<students.length;i++){
		student s=students[i];
		 System.out.println(s.name+"\t\t\t"+s.Rollno);
	}
}
}
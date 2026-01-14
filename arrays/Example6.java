public class Example6{
	public static void main(String[]args){
		
		Student [] arr; //declaring array of students
		
		arr = new Student[5]; // allocating memory
		
		arr[0] = new Student(101,"jash");
		arr[1] = new Student(102,"max");
		arr[2] = new Student(103,"jordan");
		arr[3] = new Student(104,"mackie");
		arr[4] = new Student(105,"amanda");
		
		for (int i = 0; i < arr.length; i++){
			System.out.println("student at " + i + " is " + arr[i].rollno +  " & " + arr[i].name);
		}
		
	}
	
	
}

class Student{
	
	int rollno;
	String name;
	
	Student(int rno, String n){
		
		this.rollno = rno;
		this.name = n;
	}
}
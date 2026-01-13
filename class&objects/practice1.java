import java.util.Scanner;

public class practice1{
	public static void main(String[]args){
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter current year : ");
		
		int year = sc.nextInt();
		
		cars obj1 = new cars("BMW",2005,"red");
		
		obj1.display();
		obj1.getAge(year);
		
		//cars obj2 = new cars("Audi", 2010,"white");
		//obj2.display();
		
		//cars obj3 = new cars("Mercedes", 2011, "black");
		//obj3.display();
		
		
		
		System.out.println("Total cars built: " + cars.count);
	}
}

class cars{
	String brand_name;
	int model_year;
	String color;
	static int count = 0;
	
	
	cars(String n, int y, String c){
	this.brand_name = n;
	this.model_year = y;
	this.color = c;
	count++;
	
}

void display(){
		System.out.println("The brand name is : " + brand_name );
		System.out.println("The model year is : " + model_year );
		System.out.println("The car color is : " + color );
		
	}
	
	void getAge(int currentyear){
		
		int carage = currentyear - model_year;
		System.out.println("The car age is : " + carage);
		System.out.println("------------------------------------");
		
	}

}


		
		
public class Encap{
	public static void main(String [] args){
		
	programmer new1 = new programmer();
	new1.setname("Jash");
	System.out.println("The name is: " + new1.getname());


}

}

class programmer{

private String name;

public String getname() {return name;}

public void setname(String name){
	this.name = name;
}
}
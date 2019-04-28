package demo;

public class Human {
	
	String color;
	
	int age;
	
	String gender;
	
	public Human(String humanColor,int humanAge,String humanGender) {
		color = humanColor;
		age	= humanAge;
		gender = humanGender;
	}

	public void printDetails(){
		System.out.println("Color = " + color + " Age = " + age + " Gender = " + gender);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Human zil = new Human("Brown",26,"Male");
		Human tirth = new Human("Brown",24,"Male");
		Human rikki = new Human("Brown",22,"Female");
		
		zil.printDetails();
		tirth.printDetails();
		rikki.printDetails();
	}
	// Pull Before Push	
}

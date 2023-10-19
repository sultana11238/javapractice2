package hw9_26;

public class Student extends Person{

	Student(String name) {
		super(name);
	} //<---- to extend a class with a constructor you need one here too
	
int studentage; 
	
	void StudentInfo (String name, int Id){
		System.out.println("This student's name is" + " " + name);
		System.out.println("Their ID number is" + " " + Id);
		System.out.println("Their age is" + " " + studentage);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

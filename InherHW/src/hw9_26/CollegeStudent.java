package hw9_26;

public class CollegeStudent extends Student {
	
	CollegeStudent(String name) {
		super(name);
	}

String major; 
	
	void show () {
		System.out.println("Their major is" + " " + major);
		System.out.println("this is a change");
	}
	
	public static void main(String[] args) {

	}

}

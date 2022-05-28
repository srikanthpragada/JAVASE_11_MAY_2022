package oop;

class Student {
	private int admno;
	private String name;

	public Student(int admno, String name) {
		this.admno = admno;
		this.name = name;
	}

	public void print() {
		System.out.println(this.admno);
		System.out.println(this.name);
	}
	public int getMarks() {
		 return 0;
	}
}

class JavaStudent extends Student {
	private int labMarks;

	public JavaStudent(int admno, String name, int labMarks) {
		super(admno, name);
		this.labMarks = labMarks;
	}

	@Override
	public void print() {
		super.print();
		System.out.println(this.labMarks);
	}

}

class PythonStudent extends Student {
	private int projectMarks;

	public PythonStudent(int admno, String name, int projectMarks) {
		super(admno, name);
		this.projectMarks = projectMarks;
	}

	@Override
	public void print() {
		super.print();
		System.out.println(this.projectMarks);
	}

	public int getMarks() {
		return this.projectMarks;
	}
}

public class TestStudent {

	public static void main(String[] args) {
        Student s = new JavaStudent(1, "Jason", 90);  // Upcasting 
        s.print(); // runtime polymorphism 
        
        if (s.getMarks() > 60)  // Runtime polymorphism 
        	System.out.println("Passed");
        else
        	System.out.println("Failed");
        
        s = new PythonStudent(2,"James", 80);
        s.print();
      
	}

}

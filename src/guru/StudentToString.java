package guru;

public class StudentToString {
	private String lockerCombination;
	public String name;
	public int marks;
	public double gpa;
	
	StudentToString(){
		name="";
		marks=55;
		gpa=0.7;
	}
	public String toString(){
		
		
		String output = "Name: " +getName()+"\n Marks: "+getMarks() + "\n Gpa : "+getGpa();
		
		return output;
		
		//return String.format(l, format, args)
	}
	protected String getName() {
		return name;
	}
	protected void setName(String name) {
		this.name = name;
	}
	protected int getMarks() {
		return marks;
	}
	protected void setMarks(int marks) {
		this.marks = marks;
	}
	protected double getGpa() {
		return gpa;
	}
	protected void setGpa(double gpa) {
		this.gpa = gpa;
	}
	
	StudentToString(String name, int marks,double gpa,String lc){
		this.name=name;
		this.marks=marks;
		this.gpa=gpa;
		lockerCombination =lc;
	}
	public static void main(String[] args) {
		
		StudentToString stud = new StudentToString();
		System.out.println(stud.toString());
        StudentToString stud1 = new StudentToString("Brock", 55, 9.0,"88 80 30");
        System.out.println(stud1);
		
	}

}

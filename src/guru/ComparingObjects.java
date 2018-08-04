package guru;

public class ComparingObjects implements Comparable{
	private String name;
	private int grade;
	private double gpa;
	
	ComparingObjects(String name, int grade, double d){
		this.name=name;
		this.grade=grade;
		this.gpa=d;
		
	}
	
	   
	protected String getName() {
		return name;
	}


	protected void setName(String name) {
		this.name = name;
	}


	protected int getGrade() {
		return grade;
	}


	protected void setGrade(int grade) {
		this.grade = grade;
	}


	protected double getGpa() {
		return gpa;
	}


	protected void setGpa(int gpa) {
		this.gpa = gpa;
	}
  public boolean equals(ComparingObjects other){
	  
	
	  
	  
	  return this.getGrade()==other.getGrade();
  }
  public String toString(){
	  
	  return "{Name:: " + getName() + 
			  "\n Grade:: " + getGrade() + 
			  "\n Gpa:: "+getGpa() + "}";
  }

	public static void main(String[] args) {
		
		
		  ComparingObjects bob = new ComparingObjects("Bob", 9, 7.9);
		  
		  ComparingObjects  joe = new ComparingObjects("joe", 9, 7.9);
		  
		boolean b= bob.equals(joe);
		  System.out.println(b);
		  
		    int result=     bob.compareTo(joe);
		    
		    if(result < 0){
		    	System.out.println(bob.getName()+" is lesser than "+ joe.getName());
		    }
		    else if(result > 0){
		    	  System.out.println(bob.getName()+ " is greater than " + joe.getName());
		    }
		    else{
		    	System.out.println(bob.getName()+" is equal "+ joe.getName());
		    }
		    
	}


	@Override
	public int compareTo(Object temp) {
		// TODO Auto-generated method stub
		
	ComparingObjects other = (ComparingObjects) temp;
	    
	   if(getGrade() > other.getGrade()){
		   return 1;
	   }
	   else if
		  (getGrade() < other.getGrade()){
		    	return -1;
		    }
	   else{
		   
		   return 0;
	   }
		
	}
	
	
	

}

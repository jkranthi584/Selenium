package guru;

public class Student implements Comparable <Student>{
	
	
		private String name;
		private int grade;
		private double gpa;
		
		 Student(String name, int grade, double d){
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
			
			
			  //ComparingObjects bob = new ComparingObjects("Bob", 9, 7.9);
			  
			 // ComparingObjects  joe = new ComparingObjects("joe", 17, 7.9);
			  
			//boolean b= bob.equals(joe);
			//  System.out.println(b);
			  
			            Student bob = new Student ("Bob", 9,7.9);
			            Student joe = new Student("Joe",9,8.5);
			            Student Mike = new Student("Mike",8,9.5);
			            
			            
			            
			    int result=     joe.compareTo(Mike);
			    
			    if(result < 0){
			    	//System.out.println(bob.getName()+" is lesser than "+ joe.getName());
			    	System.out.println(joe.getName()+" is lesser than "+ Mike.getName());
			    }
			    else if(result > 0){
			    	 // System.out.println(bob.getName()+ " is greater than " + joe.getName());
			    	  System.out.println(joe.getName()+ " is greater than " + Mike.getName());
			    }
			    else{
			    	//System.out.println(bob.getName()+" is equal "+ joe.getName());
			    	System.out.println(joe.getName()+" is equal "+ Mike.getName());
			    }
			    
		}


		@Override
		public int compareTo(Student other) {
			// TODO Auto-generated method stub
			
		//ComparingObjects other = (ComparingObjects) temp;
			
			/*if(getName().compareTo(other.getName())>0){
				
				return 1;
				
			}
			else if(getName().compareTo(other.getName())<0){
				
				return -1;
			}
			else{
				return 0;
			}
		    */
		  if(getGrade() > other.getGrade()){
			   return 1;
		   }
		   else if
			  (getGrade() < other.getGrade()){
			    	return -1;
			    }
			  
		   else if
			   
			   (getGpa() > other.getGpa()){
				   return 1;
				   
			   }
			   else if
				   
				   (getGpa() < other.getGpa()){
					   return -1;
					   
				   }
			   
		   
		   else {
			   
			   return 0;
		   }
		   
		  
			
		}


	
		
		
		

	}



